package com.imooc.java2020.week03.packagedemo.practice;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Test {
    public static void main(String[] args) {
        Company cp = new Company("niuniu", "加里敦");
        Staff st = new Staff(30, "huahua");
        st.comp = cp;
        System.out.println(st.display());
    }
}