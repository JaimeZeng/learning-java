package pub.zxj.servlet.practice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jaime
 */
@WebServlet("/practice/translation")
public class TranslationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        Map<String, String> wordMap = new HashMap<>(6);
        wordMap.put("apple", "苹果");
        wordMap.put("strawberry", "草莓");
        wordMap.put("olive", "橄榄");
        wordMap.put("walnut", "核桃");
        wordMap.put("peanut", "花生");
        wordMap.put("cherry", "樱桃");
        if (wordMap.containsKey(req.getParameter("word"))) {
            req.setAttribute("value", wordMap.get(req.getParameter("word")));
            req.getRequestDispatcher("/translation/success.jsp").forward(req, resp);
            // req.getRequestDispatcher("/translation/success.jsp?value=" + wordMap.get(req.getParameter("word"))).forward(req, resp);
            // resp.sendRedirect("/servlet_advanced_war_exploded/translation/success.jsp?value=" + wordMap.get(req.getParameter("word")));
        } else {
            req.getSession().setAttribute("msg", " 没有找到对应的单词解释");
            resp.sendRedirect("/servlet_advanced_war_exploded/translation/fail.jsp");
            // req.getRequestDispatcher("/translation/fail.jsp").forward(req, resp);
        }
    }
}
