import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Give the servlet a name, and set it's URL pattern or route
//this will mean that for this servlet to be used,
//a get or post request needs to be sent to localhost:8080/hello
//other request types are allowed of course, but those are the main
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    //this method is called when post requests are sent to /hello
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("a POST request was sent to /hello");

    }

    //this method is called when get requests are sent to /hello
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("a GET request was sent to /hello");

        //Set the content type in the header of the HTTP request
        //this just tells the client the type of data being sent
//        response.setContentType("text/plain");
//
//        response.getWriter().println("Here is a line");
//        response.getWriter().println("another line");

        //Content types: https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types
        response.setContentType("text/html");
        response.getWriter().println("<h1>Greetings!!!</h1>");
        response.getWriter().println("<h3>Pickles are delicious</h3>");

    }

}
