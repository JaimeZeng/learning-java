package com.imooc.java2020.week03.schooldemo.model;

/**
 * 学科专业类 Subject01
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Subject01 {
    /**
     * 学科名称subName、学科编号subId、学制年限subYear、报名学科的学生信息subStu、报名学科的学生人数subStuNum
     */
    private String subName;
    private String subId;
    private int subYear;
    // private Student04[] subStu = new Student04[88];
    private Student04[] subStu;
    private int subStuNum;

    /**
     * 无参构造
     */
    public Subject01() {
    }

    /**
     * 有参构造初始化部分属性，包括：学科名称、学科编号、学制年限
     *
     * @param subName 学科名称
     * @param subId   学科编号
     * @param subYear 学制年限
     */
    public Subject01(String subName, String subId, int subYear) {
        this.setSubName(subName);
        this.setSubId(subId);
        this.setSubYear(subYear);
    }

    /**
     * 有参构造初始化全部属性，包括：学科名称、学科编号、学制年限、报名学科的学生信息、报名学科的学生人数
     *
     * @param subName   学科名称
     * @param subId     学科编号
     * @param subYear   学制年限
     * @param subStu    报名学科的学生信息
     * @param subStuNum 报名学科的学生人数
     */
    public Subject01(String subName, String subId, int subYear, Student04[] subStu, int subStuNum) {
        this.setSubName(subName);
        this.setSubId(subId);
        this.setSubYear(subYear);
        this.setSubStu(subStu);
        this.setSubStuNum(subStuNum);
    }

    /**
     * get 获取学科名称
     *
     * @return 学科名称
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 设置学科名称
     *
     * @param subName 学科名称
     */
    public void setSubName(String subName) {
        this.subName = subName;
    }

    /**
     * get 获取学科编号
     *
     * @return 学科编号
     */
    public String getSubId() {
        return subId;
    }

    /**
     * set 设置学科编号
     *
     * @param subId 学科编号
     */
    public void setSubId(String subId) {
        this.subId = subId;
    }

    /**
     * get 设置学制年限
     *
     * @return 学制年限
     */
    public int getSubYear() {
        return subYear;
    }

    /**
     * set 设置学制年限
     *
     * @param subYear 学制年限
     */
    public void setSubYear(int subYear) {
        this.subYear = subYear;
    }

    /**
     * get 获取报名学科的学生信息 subStu 数组。如果 subStu 数组还未初始化，就先初始化 subStu，数组长度设置为 88。然后再获取报名学科的学生信息
     *
     * @return 报名学科的学生信息
     */
    public Student04[] getSubStu() {
        if (this.subStu == null) {
            this.subStu = new Student04[88];
        }
        return subStu;
    }

    /**
     * set 设置报名学科的学生信息 subStu。
     *
     * @param subStu 报名学科的学生信息
     */
    public void setSubStu(Student04[] subStu) {
        this.subStu = subStu;
    }

    /**
     * get 获取报名学科的学生人数 subStuNum
     *
     * @return 报名学科的学生人数
     */
    public int getSubStuNum() {
        return subStuNum;
    }

    /**
     * set 设置报名学科的学生人数
     *
     * @param subStuNum 报名学科的学生人数
     */
    public void setSubStuNum(int subStuNum) {
        this.subStuNum = subStuNum;
    }

    /**
     * 将报名学科的学生添加到报名学科的学生信息 subStu 数组中，并将学生人数保存到报名学科的学生人数 subStuNum 中。
     *
     * @param stu 报名学科的学生对象
     */
    public void addStudent(Student04 stu) {
        for (int i = 0; i < this.getSubStu().length; i++) {
            if (this.getSubStu()[i] == null) {
                this.getSubStu()[i] = stu;
                this.setSubStuNum(i + 1);
                return;
            }
        }
    }

    /**
     * 输出专业详细信息
     *
     * @param sub 学科类对象
     * @return 专业详细信息（学科名称、学科编号、学制年限、专业学科报名学生人数）
     */
    public String showSubInformation(Subject01 sub) {
        return "==============================================="
                + "\n专业信息如下: "
                + "\n专业名称: " + sub.getSubName()
                + "\n学科编号: " + sub.getSubId()
                + "\n学制年限: " + sub.getSubYear()
                + "\n专业学科报名学生人数: " + sub.getSubStuNum();
    }
}

