package pub.zxj.java2020.week10.xml.dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 * @author Jaime
 */
public class HrWrite {
    /**
     * 更新 xml 文件
     */
    public void writeXml() {
        String file = "course-java2020/src/pub/zxj/java2020/week10/xml/hr.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            Element root = document.getRootElement();
            // 在文件中创建属于 root 对象（hr 标签）的子节点 employee
            Element employee = root.addElement("employee");
            employee.addAttribute("no", "3311");
            Element name = employee.addElement("name");
            name.setText("Ryanjiena");
            employee.addElement("age").setText("26");
            employee.addElement("salary").setText("6800");

            Element department = employee.addElement("department");
            department.addElement("dname").setText("Personnel");
            department.addElement("address").setText("PINGAN IFC B105");

            Writer writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
            document.write(writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        HrWrite hrWrite = new HrWrite();
        hrWrite.writeXml();
        HrReader hrReader = new HrReader();
        hrReader.readXml();
    }
}
