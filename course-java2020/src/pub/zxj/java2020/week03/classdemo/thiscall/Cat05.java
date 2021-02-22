package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat05，在成员方法中通过 this 返回类对象。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat05 {
    String name;

    public Cat05() {
    }

    public Cat05(String name) {
        this.name = name;
    }

    public Cat05 call(String name) {
        this.name = name;
        //通过 this 返回类对象
        return this;
    }
}
