package pub.zxj.java2020.week03.schooldemo.test;

import pub.zxj.java2020.week03.schooldemo.model.Subject;

/**
 * 学科类 SUbject 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class SubjectTest {
    public static void main(String[] args) {
        Subject sub1;
        sub1 = new Subject("计算机科学与技术", "J0001", 4);
        System.out.println(sub1.showSubInformation(sub1));
    }
}
