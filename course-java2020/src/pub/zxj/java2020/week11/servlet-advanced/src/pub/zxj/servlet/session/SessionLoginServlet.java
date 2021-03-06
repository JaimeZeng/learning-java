package pub.zxj.servlet.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/session/login")
public class SessionLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("User login success~");
        // 保存用户会话 session 对象
        HttpSession httpSession = request.getSession();
        System.out.println("Login SessionId: " + httpSession.getId());
        httpSession.setAttribute("username", "Jaime");
        request.getRequestDispatcher("/session/index").forward(request, response);
    }
}
