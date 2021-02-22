package pub.zxj.java2020.week03.schooldemo.test;

import pub.zxj.java2020.week03.schooldemo.model.Student02;
import pub.zxj.java2020.week03.schooldemo.model.Subject;


/**
 * 学生类 Student02 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Student02Test {
    public static void main(String[] args) {
        Subject sub;
        sub = new Subject("计算机科学与技术", "J0001", 4);
        Student02 stu01, stu02, stu03;
        stu01 = new Student02("张三", "S01", "男", 18);
        stu02 = new Student02("李四", "S02", "女", 17);
        stu03 = new Student02("王五", "S03", "男", 18);
        System.out.println(stu01.showStuInformation(sub));
        System.out.println(stu02.showStuInformation(sub));
        System.out.println(stu03.showStuInformation(sub));

    }

}
