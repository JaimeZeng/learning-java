package pub.zxj.java2020.week10.xml.dom4j.practice;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 利用XPath对存储课程信息的plan.xml文档进行查询并将结果输出，要求如下：
 * 1. 获取所有课程信息
 * 2. 查询课时小于 50 的课程信息
 * 3. 查询课程名为高等数学的课程信息
 * 4. 查询属性 id 为 001 的课程信息
 * 5. 查询前两条课程信息
 *
 * @author Jaime
 */
public class PlanXPathTestor {

    /**
     * 查询所有符合 xpath 表达式的节点，然后将所有节点结果信息输出
     *
     * @param xpathExp 传入的 xpath 表达式
     */
    public void xpath(String xpathExp) {
        String file = "course-java2020/src/pub/zxj/java2020/week10/xml/dom4j/practice/plan.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            List<Node> nodes = document.selectNodes(xpathExp);
            for (Node node : nodes) {
                Element emp = (Element) node;
                System.out.printf("Course{id = %s, course-name = %s, class-hour = %s, exam-form = %s}\n",
                        emp.attributeValue("id"), emp.elementText("course-name"),
                        emp.elementText("class-hour"), emp.elementText("exam-form"));
            }
            System.out.println();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PlanXPathTestor testor = new PlanXPathTestor();
        System.out.println("--- 获取所有课程信息 ---");
        testor.xpath("//course");
        System.out.println("--- 查询课时小于 50 的课程信息 ---");
        testor.xpath("//course[class-hour < 50]");
        System.out.println("--- 查询课程名为 高等数学 的课程信息 ---");
        testor.xpath("//course[course-name = '高等数学']");
        System.out.println("--- 查询属性 id 为 001 的课程信息 ---");
        testor.xpath("//course[@id = 001]");
        System.out.println("--- 查询前两条课程信息 ---");
        testor.xpath("//course[1] | //course[2]");
    }
}
