import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String crust = request.getParameter("crust-type");
        String sauce = request.getParameter("sauce-type");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("topping");
        String address = request.getParameter("address");
        System.out.println("Crust type: " + crust);
        System.out.println("Sauce type: " + sauce);
        System.out.println("Pizza size: " + size);
        System.out.println("Toppings:");
        for(String topping : toppings) {
            System.out.println("    -" +topping);
        }
        System.out.println("Address: " + address);
    }
}