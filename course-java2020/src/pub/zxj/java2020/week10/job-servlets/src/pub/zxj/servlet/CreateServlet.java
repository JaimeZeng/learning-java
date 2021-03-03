package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 程序启动时创建数据库
 *
 * @author Jaime
 */
@WebServlet(urlPatterns = "/unused0", loadOnStartup = 0)
public class CreateServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("正在创建数据库...");
    }
}
