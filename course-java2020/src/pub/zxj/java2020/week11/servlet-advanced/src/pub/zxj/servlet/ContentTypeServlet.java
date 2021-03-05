package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/ct")
public class ContentTypeServlet extends HttpServlet {

    public ContentTypeServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String output = "<h4><a href='https://www.baidu.com'><span>Baidu</span></a></h4>";
        // response.setContentType("text/html;charset=utf-8");
        // response.setContentType("text/plain;charset=utf-8");
        // response.setContentType("text/xml;charset=utf-8");
        response.setContentType("application/x-msdownload;charset=utf-8");
        response.getWriter().println(output);
    }
}
