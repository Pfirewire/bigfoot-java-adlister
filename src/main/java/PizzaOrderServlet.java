import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust-type");
        String sauce = request.getParameter("sauce-type");
        String size = request.getParameter("size");
        System.out.println("Crust type: " + crust);
        System.out.println("Sauce type: " + sauce);
        System.out.println("Pizza size: " + size);
        System.out.println("Toppings:");
        for(int i = 1; i <= 5; i++) {
            String topping = request.getParameter("topping" + i);
            if(topping != null) System.out.println(topping);
        }
    }
}