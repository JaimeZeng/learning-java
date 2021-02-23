package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.test;

import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.Bicycle;
import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.ElectricVehicle;
import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.NonVehicle;
import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.Tricycle;

/**
 * @author Jaime
 */
public class Test {
    public static void main(String[] args) {
        NonVehicle nonVehicle = new NonVehicle("天宇", "红", 4, 2);
        System.out.print("父类信息测试：");
        nonVehicle.showInfo();

        Bicycle bicycle = new Bicycle("捷安特", "黄");
        System.out.print("自行车类信息测试：");
        bicycle.showInfo();

        ElectricVehicle electricVehicle = new ElectricVehicle("飞鸽");
        System.out.print("电动车类信息测试：");
        electricVehicle.showInfo();

        Tricycle tricycle = new Tricycle();
        System.out.print("三轮车类信息测试：");
        tricycle.showInfo();
    }
}
