package pub.zxj.servlet.session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/session/index")
public class SessionIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession httpSession = request.getSession();
        System.out.println("Index SessionId: " + httpSession.getId());
        String username = String.valueOf(httpSession.getAttribute("username"));
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("Hi, " + username + ", this is index pages~");
    }
}
