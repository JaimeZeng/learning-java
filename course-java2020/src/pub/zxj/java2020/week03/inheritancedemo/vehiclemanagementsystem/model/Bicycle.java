package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 自行车类 Bicycle 继承于非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class Bicycle extends NonVehicle {
    /**
     * 无参构造方法
     */
    public Bicycle() {
    }

    /**
     * 双参构造方法，实现对自行车品牌、颜色属性的初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     */
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    /**
     * 四参构造方法，实现对自行车品牌、颜色、车轮、座椅属性进行初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     * @param wheel 车轮
     * @param seat  座椅
     */
    public Bicycle(String brand, String color, int wheel, int seat) {
        super(brand, color, wheel, seat);
    }



    /**
     * 重写运行的方法。
     */
    @Override
    public void showInfo() {
        System.out.printf("这是一辆 %s 颜色的，%s 牌的自行车。\n", this.getColor(), this.getBrand());
    }
}
