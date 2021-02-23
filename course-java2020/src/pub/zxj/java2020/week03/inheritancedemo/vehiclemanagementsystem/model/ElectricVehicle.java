package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 电动车类 ElectricVehicle 继承于非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class ElectricVehicle extends NonVehicle {
    /**
     * 电池品牌batteryBrand
     */
    private String batteryBrand;

    /**
     * 单参构造方法，实现对对电动车电池品牌属性的初始化赋值操作
     */
    public ElectricVehicle(String batteryBrand) {
        this.setBatteryBrand(batteryBrand);
    }

    /**
     * 双参构造方法，实现对对电动车品牌、颜色、电池品牌属性的初始化赋值操作。
     *
     * @param brand        品牌
     * @param color        颜色
     * @param batteryBrand 电池品牌
     */
    public ElectricVehicle(String brand, String color, String batteryBrand) {
        super(brand, color);
        this.setBatteryBrand(batteryBrand);
    }

    /**
     * 四参构造方法，实现对电动车品牌、颜色、车轮、座椅、电池品牌属性进行初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     * @param wheel 车轮
     * @param seat  座椅
     */
    public ElectricVehicle(String brand, String color, int wheel, int seat, String batteryBrand) {
        super(brand, color, wheel, seat);
        this.setBatteryBrand(batteryBrand);
    }

    public String getBatteryBrand() {
        return batteryBrand;
    }

    public void setBatteryBrand(String batteryBrand) {
        this.batteryBrand = batteryBrand;
    }

    /**
     * 重写运行的方法。
     */
    @Override
    public void showInfo() {
        System.out.printf("这是一辆使用 %s 牌电池的电动车。\n", this.getBatteryBrand());
    }
}
