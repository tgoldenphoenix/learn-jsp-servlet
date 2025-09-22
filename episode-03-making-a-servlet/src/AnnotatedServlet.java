import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * [video 04](https://www.youtube.com/watch?v=DZdtFlLi_I4&list=PLfu_Bpi_zcDOn8ajnuLY6g1C6hc_eeDFl&index=10)
 */

//Give the servlet a name, and set it's URL pattern or route
//this will mean that for this servlet to be used,
//a get or post request needs to be sent to localhost:8080/hello
//other request types are allowed of course, but those are the main
@WebServlet(name = "HelloServlet", urlPatterns = "/anhao")
@WebServlet(name = "HelloServlet", urlPatterns = {"/anhao", "/kimphuong", "/bentre/mcn"})
public class AnnotatedServlet extends HttpServlet {

    //this method is called when post requests are sent to /hello
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("a POST request was sent to /hello");

    }

    //this method is called when get requests are sent to /hello
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("a GET method has been called");
    }

}
