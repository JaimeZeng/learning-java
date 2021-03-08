package pub.zxj.servlet.practice;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jaime
 */
@WebServlet("/practice/sum_display")
public class SumDisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // String num = request.getParameter("num");
        // String sum = request.getParameter("sum");
        String num = String.valueOf(request.getAttribute("num"));
        String sum = String.valueOf(request.getAttribute("sum"));
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("1 + 2 + .. + " + num + " = " + sum);
        // response.getWriter().println(sum);
    }
}
