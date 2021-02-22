package pub.zxj.java2020.week03.schooldemo.test;

import pub.zxj.java2020.week03.schooldemo.model.Student04;
import pub.zxj.java2020.week03.schooldemo.model.Subject01;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Student04Test {
    public static void main(String[] args) {
        Subject01 sub;
        sub = new Subject01("计算机科学与技术", "J0001", 4);

        Student04 stu01, stu02, stu03;
        stu01 = new Student04("张三", "S01", "男", 18, sub);
        stu02 = new Student04("李四", "S02", "女", 17, sub);
        stu03 = new Student04("王五", "S03", "男", 18, sub);
        System.out.println(stu01.showStuInformation(stu01));
        System.out.println();
        System.out.println(stu02.showStuInformation(stu02));
        System.out.println();
        System.out.println(stu03.showStuInformation(stu03));
        System.out.println();

        sub.addStudent(stu01);
        sub.addStudent(stu02);
        // sub.addStudent(stu03);
        System.out.println(sub.showSubInformation(sub));
        System.out.println();
    }
}