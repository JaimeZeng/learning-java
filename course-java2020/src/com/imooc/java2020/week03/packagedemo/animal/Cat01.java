package com.imooc.java2020.week03.packagedemo.animal;

/**
 * 宠物猫类 Cat01 + static 静态成员
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat01 {
    /**
     * 昵称 name、年龄age、体重weight、品种 species、价格 price
     */
    private String name;
    private int age;
    private double weight;
    private String species;
    // public int price;
    /**
     * static: 静态 静态成员、类成员
     * static+属性--》静态属性、类属性 在 IDEA 中通过断点调试查看变化
     */
    public static int price;

    /**
     * 无参构造
     */
    public Cat01() {
    }

    /**
     * 有参构造
     *
     * @param name    昵称
     * @param age     年龄
     * @param weight  体重
     * @param species 品种
     */
    public Cat01(String name, int age, double weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    /**
     * get 获取昵称
     *
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * set 设置昵称
     *
     * @param name 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 获取年龄
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * set 设置昵称
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get 获取体重
     *
     * @return 体重
     */
    public double getWeight() {
        return weight;
    }

    /**
     * set 设置体重
     *
     * @param weight 体重
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * get 获取品种
     *
     * @return 品种
     */
    public String getSpecies() {
        return species;
    }

    /**
     * set 设置品种
     *
     * @param species 品种
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * 宠物猫信息
     *
     * @return 宠物猫信息
     */
    @Override
    public String toString() {
        return "Cat01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                ", price=" + price +
                '}';
    }


    public void run() {
        eat();
        this.name = "niuniu";
        // this.price = 20000;
        Cat01.price = 20000;
        // System.out.println("name = " + this.name + ", price = " + this.price + " 的小猫在跑~");
        System.out.println("name = " + this.name + ", price = " + Cat01.price + " 的小猫在跑~");
    }

    /**
     * 吃鱼的方法
     * static+方法--》类方法、静态方法
     * 用过类引用访问
     */
    public static void eat() {
        //静态方法中不能直接访问同一个类中的非静态成员，只能直接调用同一个类中的静态成员
        //只能通过对象实例化后，对象.成员方法的方式访问非静态成员
        // Cat01 temp = new Cat01();
        // temp.run();
        System.out.println("小猫快来吃鱼~");
    }
}
