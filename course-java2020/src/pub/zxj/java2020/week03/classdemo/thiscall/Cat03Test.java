package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat03 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat03Test {
    public static void main(String[] args) {
        Cat03 one, two, three;

        System.out.println("--------- 调用无参构造 ---------");
        one = new Cat03();

        System.out.println("--------- 单参构造调用无参构造 ---------");
        two = new Cat03("huahua");

        System.out.println("--------- 双参构造调用单参构造 ---------");
        three = new Cat03("huahua", 2);
    }
}
