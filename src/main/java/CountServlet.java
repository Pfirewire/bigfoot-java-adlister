import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Setting up PrintWriter and ResponseType
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Request Parameters
        String reset = request.getParameter("reset");

        // Logic
        if(reset == null) counter++;
        else counter = 0;

        // Output
        out.println("<h1>This is the Counter Page!</h1>");
        out.printf("<h1>The count is: %d</h1>%n", counter);
    }
}
