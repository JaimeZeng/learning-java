package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat05 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat05Test {
    public static void main(String[] args) {
        Cat05 one = new Cat05();
        System.out.println(one.call("huahua"));
        System.out.println(one.call("huahua").name);
    }
}
