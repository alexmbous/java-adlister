
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "pickColorServlet", urlPatterns = "/pickcolor")
public class pickColorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pickColor.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String color = request.getParameter("pickcolor");
        String colorText = request.getParameter("picktextcolor");
        if(color == null){
            request.getRequestDispatcher("/pickColor.jsp");
        }
        request.setAttribute("color", color);
        request.setAttribute("colorText", colorText);
        request.getRequestDispatcher("/coloredPage.jsp").forward(request, response);






    }

    }





