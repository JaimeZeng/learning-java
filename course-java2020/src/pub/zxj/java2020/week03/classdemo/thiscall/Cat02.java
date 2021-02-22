package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat02，通过 this 调用成员方法
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat02 {
    String name;

    public void run() {
        System.out.println("---------- 有 this ----------");
        this.eat();
        System.out.println("---------- 没有 this ----------");
        eat();
    }

    public void eat() {
        name = "huahua";
        System.out.printf("名叫 %s 的小猫在吃鱼！\n", this.name);
    }
}
