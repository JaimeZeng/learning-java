package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 三轮车类 Tricycle 继承于非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class Tricycle extends NonVehicle {

    /**
     * 无参构造方法
     */
    public Tricycle() {
        this.setWheel(3);
    }

    /**
     * 重写运行的方法。
     */
    @Override
    public void showInfo() {
        System.out.printf("三轮车是一款有 %d 个轮子的非机动车。\n", this.getWheel());
    }
}
