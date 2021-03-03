package pub.zxj.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 数据库创建，导入数据之后分析数据
 *
 * @author Jaime
 */
@WebServlet(urlPatterns = "/unused2", loadOnStartup = 2)
public class AnalysisServlet extends HttpServlet {
    @Override
    public void init() {
        System.out.println("正在分析数据库...");
    }
}
