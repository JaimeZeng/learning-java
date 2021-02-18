package com.imooc.java2020.week03.encapsulationdemo.practice;

/**
 * 宠物猫管理类 CatManage
 *
 * @author Jaime
 * @project_name learning-java
 */
public class CatManage {

    /**
     * 宠物猫年龄比较
     *
     * @param one 宠物猫一
     * @param two 宠物猫二
     * @return 年龄大的宠物猫
     */
    public Cat catMonthPk(Cat one, Cat two) {
        return (one.getAge() > two.getAge()) ? one : two;
    }
}
