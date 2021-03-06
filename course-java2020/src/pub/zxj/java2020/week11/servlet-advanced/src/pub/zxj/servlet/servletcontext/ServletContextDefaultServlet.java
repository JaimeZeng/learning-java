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
@WebServlet("/servlet_context/default")
public class ServletContextDefaultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletContext servletContext = request.getServletContext();
        String title = (String) servletContext.getAttribute("title");
        String author = String.valueOf(servletContext.getAttribute("author"));
        String copyright = String.valueOf(servletContext.getAttribute("copyright"));
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("Title : " + title + "<br/>Author: " + author + "<br/><br/><hr/><br/>" + copyright);
    }
}
