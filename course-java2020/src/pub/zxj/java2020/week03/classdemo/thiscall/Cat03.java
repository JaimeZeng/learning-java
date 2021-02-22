package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat03，
 * 在单参构造中使用 this 调用无参构造，双参构造中调用单参构造
 * 在普通成员方法内调用构造
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat03 {
    String name;
    int month;

    public Cat03() {
        System.out.println("无参构造！");
    }

    public Cat03(String name) {
        // 调用无参构造
        // 构造方法的调用必须是构造函数本体中的第一条语句!!!
        /*this.name = name;
        this(); // Error: 'this()' 调用必须是构造函数本体中的第一条语句
        System.out.println("单参构造！");*/

        this();
        this.name = name;
        System.out.println("单参构造！");
    }

    public Cat03(String name, int month) {
        this(name);
        this.month = month;
        System.out.println("双参构造！");
    }

    public void run() {
        // 不能在类中普通成员方法内通过 this() 调用构造方法
        // this();
        System.out.println("小猫快跑！");
    }
}
