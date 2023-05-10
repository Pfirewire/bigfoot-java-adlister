import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("Inside LoginServlet doPost");
        System.out.printf("username: %s%npassword: %s%n%n", username, password);
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            req.getRequestDispatcher("/profile").forward(req, resp);
        } else {
            req.getRequestDispatcher("/login").forward(req, resp);
        }
    }
}
