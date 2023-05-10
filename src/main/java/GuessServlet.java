import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Create Random Number
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

        // Collect User's Guess
        int guess = Integer.parseInt(request.getParameter("guess"));

        // Set up destination string based on whether user guessed correctly
        if(guess < 1 || guess > 3) response.sendRedirect("/guess.jsp");
        else if(guess == randomNumber) response.sendRedirect("/correct?random-number=" + randomNumber + "&guess=" + guess);
        else response.sendRedirect("/incorrect?random-number=" + randomNumber + "&guess=" + guess);

//        // Setting attribute so the user can see what number was produced
//        request.setAttribute("randomNumber", randomNumber);
//
//        // Forward user to correct servlet
//        request.getRequestDispatcher(destination).forward(request, response);

//        response.sendRedirect(destination + "?random-number=" + randomNumber + "&guess=" + guess);
    }
}
