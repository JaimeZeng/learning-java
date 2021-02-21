package com.imooc.java2020.week03.officemanagementsystem.model;

/**
 * 部门类 Department
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Department {
    /**
     * 部门编号departmentId，部门名称departmentName，员工数组departmentStaff和部门中的员工个数departmentStaffCount
     */
    private String departmentId;
    private String departmentName;
    private Staff[] departmentStaff;
    private int departmentStaffCount;

    /**
     * 无参构造初始化
     */
    public Department() {
    }

    /**
     * 有参构造初始化部分属性
     *
     * @param departmentId   部门编号
     * @param departmentName 部门名称
     */
    public Department(String departmentId, String departmentName) {
        this.setDepartmentId(departmentId);
        this.setdepartmentName(departmentName);
        // this.departmentId = departmentId;
        // this.departmentName = departmentName;
    }

    /**
     * 有参构造初始化所有属性
     *
     * @param departmentId         部门编号
     * @param departmentName       部门名称
     * @param departmentStaff      部门员工信息
     * @param departmentStaffCount 部门员工人数
     */
    public Department(String departmentId, String departmentName, Staff[] departmentStaff, int departmentStaffCount) {
        this.setDepartmentId(departmentId);
        this.setdepartmentName(departmentName);
        this.setDepartmentStaff(departmentStaff);
        this.setDepartmentStaffCount(departmentStaffCount);
        // this.departmentId = departmentId;
        // this.departmentName = departmentName;
        // this.departmentStaff = departmentStaff;
        // this.departmentStaffCount = departmentStaffCount;
    }

    /**
     * get 获取部门编号
     *
     * @return 部门编号 departmentId
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * set 设置员工部门编号
     *
     * @param departmentId 员工部门编号
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * get 获取部门名称
     *
     * @return 部门名称
     */
    public String getdepartmentName() {
        return departmentName;
    }

    /**
     * set 设置部门名称
     *
     * @param departmentName 部门名称
     */
    public void setdepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * get 获取部门员工信息。如未初始化就先初始化。
     *
     * @return 部门员工信息
     */
    public Staff[] getDepartmentStaff() {
        if (departmentStaff == null) {
            this.departmentStaff = new Staff[36];
        }
        return departmentStaff;
    }

    /**
     * set 设置部门员工信息。
     *
     * @param departmentStaff 部门员工信息
     */
    public void setDepartmentStaff(Staff[] departmentStaff) {
        this.departmentStaff = departmentStaff;
    }

    /**
     * get 获取部门员工人数
     *
     * @return 部门员工人数
     */
    public int getDepartmentStaffCount() {
        return departmentStaffCount;
    }

    /**
     * set 设置部门员工人数
     *
     * @param departmentStaffCount 部门员工人数
     */
    public void setDepartmentStaffCount(int departmentStaffCount) {
        this.departmentStaffCount = departmentStaffCount;
    }

    /**
     * 将部门员工添加进部门并同时统计部门员工人数。
     *
     * @param departmentStaff 部门员工
     */
    public void addDepartmentStaff(Staff departmentStaff) {
        departmentStaff.setStaffDepartment(this);
        this.setDepartmentStaffCount(this.getDepartmentStaffCount() + 1);
    }
}
