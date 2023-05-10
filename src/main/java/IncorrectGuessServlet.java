import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IncorrectGuessServlet", urlPatterns = "/incorrect")
public class IncorrectGuessServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int guess = Integer.parseInt(request.getParameter("guess"));
        int randomNumber = Integer.parseInt(request.getParameter("random-number"));
        request.setAttribute("randomNumber", randomNumber);
        request.setAttribute("isCorrect", false);
        request.setAttribute("guess", guess);
        request.getRequestDispatcher("/outcome.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    }

}
