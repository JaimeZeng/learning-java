package com.imooc.java2020.week03;

/**
 * 宠物猫管理类 Sections02EncapsulationPracticeCatManage
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationPracticeCatManage {

    /**
     * 宠物猫年龄比较
     *
     * @param one 宠物猫一
     * @param two 宠物猫二
     * @return 年龄大的宠物猫
     */
    public Sections02EncapsulationPracticeCat catMonthPk(Sections02EncapsulationPracticeCat one, Sections02EncapsulationPracticeCat two) {
        return (one.getAge() > two.getAge()) ? one : two;
    }
}
