package pub.zxj.java2020.week03.inheritancedemo.animaltest;

import pub.zxj.java2020.week03.inheritancedemo.animal.Cat01;
import pub.zxj.java2020.week03.inheritancedemo.animal.Dog01;

/**
 * 动物类测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Test01 {
    public static void main(String[] args) {
        Cat01 one = new Cat01("huahua", 9, "中华田园猫", 9.8);
        System.out.println("====== Animal 的 eat 方法 ======");
        one.eat();
        System.out.println("====== 重写 Animal 的 eat 方法 ======");
        Dog01 two = new Dog01("niuniu", 12, "哈士奇", '母');
        two.eat();
        System.out.println("====== Animal 的 sleep 方法 ======");
        two.sleep();
        System.out.println("====== 重载 Dog 类的 sleep 方法 ======");
        two.sleep(two.getName());
    }
}
