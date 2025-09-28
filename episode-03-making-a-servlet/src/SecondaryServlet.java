import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * [video 05](https://www.youtube.com/watch?v=-SiJypBbO3M&list=PLfu_Bpi_zcDOn8ajnuLY6g1C6hc_eeDFl&index=5)
 */

@WebServlet(name = "SecondaryServlet", urlPatterns = "/secondary")
public class SecondaryServlet extends HttpServlet {

    //this method is called when post requests are sent to /hello
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    //this method is called when get requests are sent to /hello
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("A get request was made on /secondary");
    }

}
