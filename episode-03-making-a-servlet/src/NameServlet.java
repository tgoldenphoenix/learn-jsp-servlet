import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * [video 06](https://www.youtube.com/watch?v=2bq6EsPOZi4&list=PLfu_Bpi_zcDOn8ajnuLY6g1C6hc_eeDFl&index=6)
 * Accessing GET Request Parameters
 *  
*/

@WebServlet(name = "NameServlet", urlPatterns = "/name")
public class NameServlet extends HttpServlet {

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  // ~/name/?firstName=Anhao&lastName=Pham
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");

    if (firstName == null || lastName == null) {
      System.out.println("Missing parameters");
    } else {
      System.out.println("Hello " + firstName + " " + lastName + ", nice to meet you!");
    }
  }

}
