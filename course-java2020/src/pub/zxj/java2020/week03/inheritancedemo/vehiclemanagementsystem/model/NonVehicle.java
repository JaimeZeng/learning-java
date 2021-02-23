package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class NonVehicle {
    /**
     * 品牌brand、颜色color、轮子wheel、座椅seat
     */
    private String brand;
    private String color;
    private int wheel = 2;
    private int seat = 1;

    /**
     * 无参构造方法
     */
    public NonVehicle() {
    }

    /**
     * 双参构造方法，实现对对品牌、颜色属性的初始化 赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     */
    public NonVehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    /**
     * 四参构造方法，实现对品牌、颜色、车轮、座椅属性进行初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     * @param wheel 车轮
     * @param seat  座椅
     */
    public NonVehicle(String brand, String color, int wheel, int seat) {
        this.setBrand(brand);
        this.setColor(color);
        this.setWheel(wheel);
        this.setSeat(seat);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    /**
     * 运行的方法。
     */
    public void showInfo() {
        System.out.printf("这是一辆 %s 颜色的，%s 牌的非机动车，有 %d 个轮子，有 %d 个座椅的非机动车。\n", this.getColor(), this.getBrand(), this.getWheel(), this.getSeat());
    }
}
