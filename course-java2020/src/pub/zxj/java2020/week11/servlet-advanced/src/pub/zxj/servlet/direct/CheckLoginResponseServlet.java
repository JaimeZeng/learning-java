package pub.zxj.servlet.direct;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/direct/check_resp")
public class CheckLoginResponseServlet extends HttpServlet {

    public CheckLoginResponseServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Login Success~");
        //响应重定向需要 contentpath
        response.sendRedirect("/servlet_advanced_war_exploded/direct/index");
    }
}
