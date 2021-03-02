package pub.zxj.java2020.week10.xml.dom4j.practice;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author Jaime
 */
public class PlanReaderWrite {

    /**
     * 遍历 plan.xml 文件并将节点和属性等内容输出。
     */
    public void readXml() {
        String file = "course-java2020/src/pub/zxj/java2020/week10/xml/dom4j/practice/plan.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            // root - teaching-plan
            Element root = document.getRootElement();
            List<Element> courses = root.elements("course");
            for (Element course : courses) {
                System.out.printf("Course{id = %s, course-name = %s, class-hour = %s, exam-form = %s}\n",
                        course.attributeValue("id"), course.elementText("course-name"),
                        course.elementText("class-hour"), course.elementText("exam-form"));
            }
            System.out.println();

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 为 plan.xml 添加一条新的课程信息
     */
    public void writeXml() {
        String file = "course-java2020/src/pub/zxj/java2020/week10/xml/dom4j/practice/plan.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            // root - teaching-plan
            Element root = document.getRootElement();
            Element course = root.addElement("course");
            course.addAttribute("id", "004");
            course.addElement("course-name").setText("Java 入门到放弃");
            course.addElement("class-hour").setText("88");
            course.addElement("exam-form").setText("上机考试");

            Writer writer = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
            document.write(writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PlanReaderWrite readerWrite = new PlanReaderWrite();
        System.out.println("原始的课程信息：");
        readerWrite.readXml();
        readerWrite.writeXml();
        System.out.println("修改后的课程信息：");
        readerWrite.readXml();
    }
}
