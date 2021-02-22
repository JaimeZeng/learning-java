package pub.zxj.java2020.week03.packagedemo.practice;

/**
 * 员工类 Staff
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Staff {
    /**
     * 员工年龄age、员工姓名name、员工所在公司comp
     */
    int age;
    String name;
    Company comp;

    /**
     * 初始化全部属性
     *
     * @param age  员工年龄
     * @param name 员工姓名
     */
    public Staff(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 显示员工信息
     *
     * @return 员工信息
     */
    public String display() {
        return "Staff {" +
                "\n \r age = " + this.age +
                "\n \r name = " + this.name +
                "\n \r compaName = " + this.comp.name +
                "\n \r compAddress = " + this.comp.address +
                "\n}";
    }
}