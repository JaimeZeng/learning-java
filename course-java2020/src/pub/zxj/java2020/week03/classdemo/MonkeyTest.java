package pub.zxj.java2020.week03.classdemo;

/**
 * 自定义猴子类 Monkey 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class MonkeyTest {
    public static void main(String[] args) {
        Monkey monkey1, monkey2;
        monkey1 = new Monkey();
        // System.out.println("名称：" + monkey1.name);
        // System.out.println("特征：" + monkey1.feature);
        // 执行无参构造
        System.out.println("我是使用无参构造产生的猴子：");
        monkey1.print(monkey1);

        System.out.println("=============================");

        monkey2 = new Monkey("白头叶猴", "头上有白毛，喜欢吃树叶");
        // monkey2.name = "白头叶猴";
        // monkey2.feature = "头上有白毛，喜欢吃树叶";
        // System.out.println("名称：" + monkey2.name);
        // System.out.println("特征：" + monkey2.feature);
        System.out.println("我是使用带参构造产生的猴子：");
        monkey2.print(monkey2);


    }
}
