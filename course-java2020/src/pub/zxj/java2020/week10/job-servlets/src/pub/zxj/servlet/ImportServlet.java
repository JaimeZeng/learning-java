package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 创建完数据库之后对数据进行导入
 *
 * @author Jaime
 */
@WebServlet(urlPatterns = "/unused1", loadOnStartup = 1)
public class ImportServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("正在导入数据库...");
    }
}
