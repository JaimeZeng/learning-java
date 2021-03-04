package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/ua")
public class UserAgentServlet extends HttpServlet {

    public UserAgentServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userAgent = request.getHeader("User-Agent");
        String ua1 = "Windows NT", ua2 = "iPhone", ua3 = "Android";
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("User - Agent:" + userAgent + "<br/>");
        if (userAgent.contains(ua1)) {
            response.getWriter().println("<h2>This is PC index~</h2>");
        } else if (userAgent.contains(ua2) || userAgent.contains(ua3)) {
            response.getWriter().println("<h2>This is Mobile index~</h2>");
        }
    }
}
