package com.imooc.java2020.week03.officemanagementsystem.test;

import com.imooc.java2020.week03.officemanagementsystem.model.Post;

/**
 * 职务类 Post 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class TestPost {
    public static void main(String[] args) {
        Post post01, post02, post03;
        post01 = new Post("P001", "经理");
        post02 = new Post("P002", "助理");
        post03 = new Post("P003", "职员");

        System.out.printf("Post Name = %s, Post ID = %s.\n", post01.getPostName(), post01.getPostId());
        System.out.printf("Post Name = %s, Post ID = %s.\n", post02.getPostName(), post02.getPostId());
        System.out.printf("Post Name = %s, Post ID = %s.\n", post03.getPostName(), post03.getPostId());

    }
}
