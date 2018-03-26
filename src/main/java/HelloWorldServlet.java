import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");


//
//        String name = request.getParameter("name");
//        out.println("<HTML>");
//        out.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
//        out.println("<BODY>");
//        out.println("Hello, " + name);
//        out.println("</BODY></HTML>");
//    }
//    public String getServletInfo() {
//        return "A servlet that knows the name of the person to whom it's" +
//                "saying hello";
    }




}