import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloWorldServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        res.getWriter().println("<form>");
        res.getWriter().println("<input name=\" name\" /");
        res.getWriter().println("</form>");




       String name = request.getParameter("name");
        if (name != null) {
            out.println("<h1>Hello, " + name + "</h1>");
        } else {
            out.println("<h1>Hello World</h1>");
        }

//        String counter = request.getParameter("counter");
//        response.setContentType("text/html");
//        count ++;
//        if(counter != null && counter.equalsIgnoreCase("reset")){
//            count = 0;
//            out.println("<h1>The count has been reset to 0!</h1>");
//        }else if(count == 1) {
//            out.println("<h1>This page has been viewed " + count + " time</h1>");
//        } else out.println("<h1>This page has been viewed " + count + " times</h1>");
//    }



}
}