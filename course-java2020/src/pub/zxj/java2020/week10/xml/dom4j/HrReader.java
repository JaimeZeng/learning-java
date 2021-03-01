package pub.zxj.java2020.week10.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author Jaime
 */
public class HrReader {
    /**
     * 遍历 xml 文件
     */
    public void readXml() {
        String file = "course-java2020/src/pub/zxj/java2020/week10/xml/hr.xml";
        // SAXReader 类是读取 XML 文件的核心类，用于将 XML 文件解析后以“树”的形式保存在内存中。
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            // 获取 XML 文件的根节点，即 hr 标签
            Element root = document.getRootElement();
            // elements 获取指定标签集合
            List<Element> employees = root.elements("employee");
            for (Element employee : employees) {
                // element 获取唯一的子节点对象
                Element name = employee.element("name");
                // getText() 获取标签文本
                String empName = name.getText();
                System.out.println(empName);
                //elementText 获取子节点文本
                System.out.println(employee.elementText("age"));
                System.out.println(employee.elementText("salary"));

                Element department = employee.element("department");
                System.out.println(department.element("dname").getText());
                System.out.println(department.elementText("address"));

                // attribute 获取节点属性值
                // Attribute attribute = employee.attribute("no");
                // System.out.println(attribute.getText());
                System.out.println(employee.attribute("no").getText());
                System.out.println(employee.attributeValue("no"));
            }


        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HrReader reader = new HrReader();
        reader.readXml();
    }
}
