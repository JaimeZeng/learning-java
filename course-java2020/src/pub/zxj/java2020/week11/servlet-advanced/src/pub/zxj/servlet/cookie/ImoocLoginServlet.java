package pub.zxj.servlet.cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/cookies/login")
public class ImoocLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Login Success~");
        Cookie cookie = new Cookie("username", "Jaime");
        // expires/Max-Age: 7.0 days
        cookie.setMaxAge(60 * 60 * 24 * 7);
        response.addCookie(cookie);
        response.getWriter().println("Login Success~");
    }
}
