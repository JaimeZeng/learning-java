package pub.zxj.java2020.week03.officemanagementsystem.test;

import pub.zxj.java2020.week03.officemanagementsystem.model.Department;
import pub.zxj.java2020.week03.officemanagementsystem.model.Post;
import pub.zxj.java2020.week03.officemanagementsystem.model.Staff;

/**
 * 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Test {
    public static void main(String[] args) {

        Department department01, department02;
        department01 = new Department("D001", "人事部");
        department02 = new Department("D002", "市场部");

        Post post01, post02, post03;
        post01 = new Post("P001", "经理");
        post02 = new Post("P002", "助理");
        post03 = new Post("P003", "职员");

        Staff staff01, staff02, staff03, staff04, staff05, staff06;
        staff01 = new Staff("张铭", "S001", 29, "男", department01, post01);
        staff02 = new Staff("李艾爱", "S002", 21, "女", department01, post02);
        staff03 = new Staff("孙超", "S003", 29, "男", department01, post03);
        staff04 = new Staff("张美美", "S004", 26, "女", department02, post03);
        staff05 = new Staff("蓝迪", "S005", 37, "男", department02, post01);
        staff06 = new Staff("米莉", "S006", 24, "女", department02, post02);

        department01.addDepartmentStaff(staff01);
        department01.addDepartmentStaff(staff02);
        department01.addDepartmentStaff(staff03);
        department02.addDepartmentStaff(staff04);
        department02.addDepartmentStaff(staff05);
        department02.addDepartmentStaff(staff06);

        System.out.println(staff01.showStaffInfo());
        System.out.println(staff02.showStaffInfo());
        System.out.println(staff03.showStaffInfo());
        System.out.println(staff04.showStaffInfo());
        System.out.println(staff05.showStaffInfo());
        System.out.println(staff06.showStaffInfo());

        System.out.println(department01.getdepartmentName() + "总共有 " + department01.getDepartmentStaffCount() + " 名员工");
        System.out.println(department02.getdepartmentName() + "总共有 " + department02.getDepartmentStaffCount() + " 名员工");
    }
}
