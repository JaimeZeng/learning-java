package pub.zxj.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jaime
 */
public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // 接收请求发来的参数
        String name = request.getParameter("name");
        // 将前台返回的参数放在字符串中
        String html = "<h1 style = 'color: #ff0000;'> hi," + name + "~</h1><hr/>";
        System.out.println("返回给浏览器的相应数据为：" + html);
        // 从服务器向浏览器返回的输出流
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // 通过 out 对象将 html 发送回浏览器
        out.println(html);
    }
}
