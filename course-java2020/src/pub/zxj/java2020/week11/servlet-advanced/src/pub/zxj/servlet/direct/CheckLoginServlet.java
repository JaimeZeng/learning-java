package pub.zxj.servlet.direct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/direct/check")
public class CheckLoginServlet extends HttpServlet {

    public CheckLoginServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("用户登录成功~");
        System.out.println("用户登录成功~");
        request.setAttribute("username", "Jaime");
        //请求转发
        request.getRequestDispatcher("/direct/index").forward(request, response);
    }
}
