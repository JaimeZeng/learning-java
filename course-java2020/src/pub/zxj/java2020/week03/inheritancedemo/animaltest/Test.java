package pub.zxj.java2020.week03.inheritancedemo.animaltest;

import pub.zxj.java2020.week03.inheritancedemo.animal.Cat;
import pub.zxj.java2020.week03.inheritancedemo.animal.Dog;

/**
 * 动物类测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Test {
    public static void main(String[] args) {
        Cat one = new Cat("huahua", 9, "中华田园猫", 9.8);
        one.eat();
        one.run();
        System.out.println("=====================");

        Dog two = new Dog("niuniu", 12, "哈士奇", '母');
        two.eat();
        two.sleep();

    }
}
