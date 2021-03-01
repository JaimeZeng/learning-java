package pub.zxj.java2020.week10.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author Jaime
 */
public class XPathTestor {

    /**
     * @param xpathExp 传入的 xpath 表达式
     */
    public void xpath(String xpathExp) {
        String file = "course-java2020/src/pub/zxj/java2020/week10/xml/0408hr.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            // selectNodes() 查询所有符合 xpath 表达式的节点
            List<Node> nodes = document.selectNodes(xpathExp);
            for (Node node : nodes) {
                Element emp = (Element) node;
                System.out.printf("{no = %s, name = %3s, age = %s, salary = %s}\n", emp.attributeValue("no"), emp.elementText("name"), emp.elementText("age"), emp.elementText("salary"));
            }
            System.out.println();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        XPathTestor testor = new XPathTestor();
        System.out.println("所有员工信息：");
        testor.xpath("/hr/employee");
        System.out.println("所有员工信息：");
        testor.xpath("//employee");
        System.out.println("工资少于 4000 的员工信息：");
        testor.xpath("//employee[salary < 4000]");
        System.out.println("姓名为 李铁柱 的员工信息：");
        testor.xpath("//employee[name = '李铁柱']");
        System.out.println("编号为 3306 的员工信息：");
        testor.xpath("//employee[@no = 3306]");
        System.out.println("编号最小的员工信息：");
        testor.xpath("//employee[1]");
        System.out.println("编号最大的员工信息：");
        testor.xpath("//employee[last()]");
        System.out.println("编号前 5 的员工信息：");
        testor.xpath("//employee[position() < 6]");
        System.out.println("第 3 和 第 8 位员工的信息：");
        testor.xpath("//employee[3] | //employee[8]");
    }
}
