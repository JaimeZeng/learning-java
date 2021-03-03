package pub.zxj.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jaime
 */
public class SampleServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

        // 向浏览器输出的数据流
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<a href = 'https://www.baidu.com/'>Baidu</a>");
    }
}
