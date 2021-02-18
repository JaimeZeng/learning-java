package com.imooc.java2020.week03.schooldemo.model;

/**
 * 学科类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Subject {
    /**
     * 学科名称subName、学科编号subId、学制年限subYear
     */
    private String subName;
    private String subId;
    private int subYear;

    /**
     * 无参构造
     */
    public Subject() {
    }

    /**
     * 有参构造初始化
     *
     * @param subName 学科名称
     * @param subId   学科编号
     * @param subYear 学制年限
     */
    public Subject(String subName, String subId, int subYear) {
        this.setSubName(subName);
        this.setSubId(subId);
        this.setSubYear(subYear);
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
     * 输出专业详细信息
     *
     * @param sub 学科类对象
     * @return 专业详细信息（学科名称、学科编号、学制年限）
     */
    public String showSubInformation(Subject sub) {
        return "==============================================="
                + "\n专业信息如下: "
                + "\n专业名称: " + sub.getSubName()
                + "\n学科编号: " + sub.getSubId()
                + "\n学制年限: " + sub.getSubYear();
    }
}
