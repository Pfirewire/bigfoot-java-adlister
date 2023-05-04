import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Setting up Printwriter and response Content Type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Getting Request Parameters
        String name = request.getParameter("name");

        // Logic and Output
        if(name != null) out.printf("<h1>Hello, %s!</h1>%n", name);
        else out.println("<h1>Hello, World!</h1>");
    }
}
