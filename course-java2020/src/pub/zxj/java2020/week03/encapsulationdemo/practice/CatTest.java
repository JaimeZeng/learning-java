package pub.zxj.java2020.week03.encapsulationdemo.practice;

/**
 * 自定义 Cat 类的测试类：宠物猫测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class CatTest {
    public static void main(String[] args) {
        Cat one, two;
        one = new Cat("huahua", 3);
        two = new Cat("fanfan", 6);
        CatManage manage = new CatManage();
        System.out.println("优胜者 name = " + manage.catMonthPk(one, two).getName() + ", age = " + manage.catMonthPk(one, two).getAge());
    }
}
