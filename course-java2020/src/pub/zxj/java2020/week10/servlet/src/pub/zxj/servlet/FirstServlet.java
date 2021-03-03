package pub.zxj.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jaime
 */
public class FirstServlet extends HttpServlet {

    /**
     * Servlet 生命周期：
     * 1. 装载 web.xml 文件
     * 2. 通过构造函数创建 Servlet 类对象
     * 3. 通过 init() 初始化 Servlet 类对象
     * 4. 通过 service()/doGet()/doPost() 提供服务
     * 5. 在应用重启/关闭时销毁 Servlet 类对象
     *
     * 对于一个 Servlet 类来说，有且只有一个对象来提供服务，绝不会出现多个情况。
     */

    public FirstServlet() {
        System.out.println("Create FirstServlet Object~");
    }

    @Override
    public void init(ServletConfig config) {
        System.out.println("Init FirstServlet Object~");
    }

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

    @Override
    public void destroy() {
        System.out.println("Destory FirstServlet Object~");
    }
}
