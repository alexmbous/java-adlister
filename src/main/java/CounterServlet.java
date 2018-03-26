import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {
    private int count;

    protected void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
    String counter = request.getParameter("counter");
        res.setContentType("text/html");
    count++;
        if(counter != null && counter.equalsIgnoreCase("reset")){
        count = 0;
        out.println("<h1>The count has been reset to 0!</h1>");
    }else if(count == 1) {
        out.println("<h1>This page has been viewed " + count + " time</h1>");
    } else out.println("<h1>This page has been viewed " + count + " times</h1>");
}


}
