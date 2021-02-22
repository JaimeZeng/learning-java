package pub.zxj.java2020.week03.classdemo.practice;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Person {
    int age = 10;
    String name = "tony";

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // public void Section01ClassTest(int age, String name) {
    //     age = age;
    //     name = name;
    //     System.out.println("name = " + name + ", age = " + age);
    // }

    public void eat() {
        System.out.println("快起来吃饭了！");
    }

    public static void main(String[] args) {
        new Person(20, "Jaime").eat();
    }
}
