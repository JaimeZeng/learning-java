package pub.zxj.servlet.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/servlet_context/init")
public class ServletContextInitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext servletContext = request.getServletContext();
        // servletContext.setAttribute("title", "Stay Simple.");
        // servletContext.setAttribute("author", "Jaime");
        // servletContext.setAttribute("copyright", "&copy; 2018-present zxj.pub 京ICP备12345678号-2");
        String title = servletContext.getInitParameter("title");
        String author = servletContext.getInitParameter("author");
        String copyright = servletContext.getInitParameter("copyright");
        servletContext.setAttribute("title", title);
        servletContext.setAttribute("author", author);
        servletContext.setAttribute("copyright", copyright);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<p>init success~</p>");
    }
}
