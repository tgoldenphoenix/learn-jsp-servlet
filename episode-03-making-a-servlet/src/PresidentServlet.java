import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * [video 05](https://www.youtube.com/watch?v=-SiJypBbO3M&list=PLfu_Bpi_zcDOn8ajnuLY6g1C6hc_eeDFl&index=5)
 */

@WebServlet(name = "PresidentServlet", urlPatterns = "/presidents")
public class PresidentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // dispatch a new request to the JSP page
        getServletContext().getRequestDispatcher("/president.jsp").forward(request, response);

        // getServletContext().getRequestDispatcher("/banana.html").forward(request, response);

        // forward to another servlet
        getServletContext().getRequestDispatcher("/secondary").forward(request, response);

        // ===============Re-direct================
        // redirect to a website outside of our application
        // response.sendRedirect("https://www.google.com/");

        // redirect internally
        // url will change, create a new request
        response.sendRedirect("/secondary");
    }

}
