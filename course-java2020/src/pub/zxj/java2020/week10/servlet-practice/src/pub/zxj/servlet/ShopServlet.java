package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 0205 编程练习
 * 使用 Servlet 在页面输出商品类别名称，商品类别名称通过 url 地址进行传递，在 Servlet 中获取类别名称并输出。
 * url地址如下所示：/ShopServlet?category=book
 *
 * @author Jaime
 */
@WebServlet(urlPatterns = "/ShopServlet")
public class ShopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String category = req.getParameter("category");
        resp.setContentType("text/html");
        // resp.getWriter().println("<p><span style = 'color: #0000ff;'>" + category + "</span></p>");
        resp.getWriter().println("<h3 style = 'color: #0000ff;'>" + category + "</h3>");
    }
}
