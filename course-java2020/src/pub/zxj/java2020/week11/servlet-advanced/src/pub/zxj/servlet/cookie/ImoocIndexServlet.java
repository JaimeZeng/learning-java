package pub.zxj.servlet.cookie;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @author Jaime
 */
@WebServlet("/cookies/index")
public class ImoocIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 获取所有 cookie
        Cookie[] ck = request.getCookies();
        String username = null;
        if (ck == null) {
            response.getWriter().println("User Not Login~");
        }
        for (Cookie c : Objects.requireNonNull(ck)) {
            System.out.println(c.getName() + " : " + c.getValue());
            if ("username".equals(c.getName())) {
                username = c.getValue();
                break;
            }
        }
        response.getWriter().println((username == null) ? "User not login~" : "Hi, " + username);
    }
}
