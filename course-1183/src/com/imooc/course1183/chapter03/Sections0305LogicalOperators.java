package com.imooc.course1183.chapter03;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0305LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        System.out.println((a && b) + " 未通过");
        System.out.println((a || b) + " 通过");
        System.out.println((!a) + " 未通过");
        System.out.println((c ^ d) + " 通过");
    }
}
