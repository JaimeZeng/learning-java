package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat04，使用 this 调用使用类作为参数的成员方法。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat04 {
    String name;

    public Sections01ClassThisCat04() {
    }

    public Sections01ClassThisCat04(String name) {
        this.name = name;
    }

    // 使用 this 调用使用类作为参数的成员方法等价于下面的方法
    public void call() {
        // this可以作为方法参数进行传递,代表调用方法的当前对象。
        run(this);
    }

    // 等价方法
    // public void call(Sections01ClassThisCat04 cat04){
    //     run(cat04);
    // }

    public void run(Sections01ClassThisCat04 cat04) {
        System.out.printf("昵称为 %s 的小猫在奔跑！\n", cat04.name);
    }
}
