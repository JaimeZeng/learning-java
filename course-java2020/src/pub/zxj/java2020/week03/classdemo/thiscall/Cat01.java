package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat01，通过 this 访问成员属性
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat01 {
    int month;
    String name;

    public void run(int month) {
        // 局部变量和成员属性同名并且需要访问成员属性，必须加 this。
        this.month = month;
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", month);
    }

    public void eat() {
        this.name = "huahua";
        System.out.printf("名叫 %s 的小猫在吃鱼！\n", this.name);
    }

    public void run1(int month) {
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", month);
    }

    public void eat1() {
        name = "huahua";
        System.out.printf("名叫 %s 的小猫在吃鱼！\n", this.name);
    }
}
