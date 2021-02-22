package pub.zxj.java2020.week03.packagedemo.animal;

/**
 * 宠物猫类 Cat02 + {} 代码块
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat02 {
    /**
     * 昵称name、价格price
     */
    private String name;
    public static int price;

    /**
     * 无参构造
     */
    public Cat02() {
    }

    /**
     * 构造初始化
     *
     * @param name 昵称
     */
    public Cat02(String name) {
        this.name = name;
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
     * 静态代码块1
     */
    static {
        System.out.println("====== Cat02 three ======");
        Cat02 three = new Cat02();
        three.setName("fanfan");
        Cat02.price = 20000;
        // tempCat.run(temp.getName(), Cat02.price);
        Cat02.eat(three);
        System.out.println("静态代码块1.");
    }

    /**
     * 静态代码块2
     */
    static {
        System.out.println("静态代码块2.");
    }

    /**
     * 构造代码块1
     */ {
        System.out.println("构造代码块1.");
    }

    /**
     * 构造代码块2
     */ {
        System.out.println("构造代码块2.");
    }

    /**
     * 奔跑的方法
     *
     * @param name 宠物猫昵称
     */
    public void run(String name, int price) {
        System.out.println("name = " + name + ", price = " + price + " 在愉快的奔跑中~");
        /**
         * 普通代码块1
         */
        {
            int age = 12;
            System.out.println("age = " + age + ", run() 普通代码块1.");
        }
        /**
         * 普通代码块2
         */
        {
            int age = 13;
            System.out.println("age = " + age + ", run() 普通代码块2.");
        }
    }

    /**
     * 吃东西的方法
     *
     * @param cat02 宠物猫类对象
     */
    public static void eat(Cat02 cat02) {
        cat02.run(cat02.getName(), Cat02.price);
    }


}
