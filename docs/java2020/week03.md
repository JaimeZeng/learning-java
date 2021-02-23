---
title: 第3周 面向对象之封装与继承
url: week03
---

# 面向对象之封装与继承

## 面向对象

### 对象

- 万物皆对象、客观存在的事物。
- 对象：用来描述客观事物的一个实体，由一组属性和方法构成。

### 面向对象

- 人关注对象。
- 人关注事物信息。

### 类

- 类是模子，确定对象将会拥有的特征（属性）和行为（方法）。
- 具有相同属性和方法的一组对象的集合。
- 对象是类的实例表现。
- 类是对象的类型。
- 对象是特定类型的数据

### 对象的属性和方法

- 属性：对象具有的各种静态特征 『有什么』
- 方法：对象具有的各种动态行为 『能做什么』

### 类和对象的关系

- 类
  - 抽象的概念
  - 仅仅是模板
- 对象
  - 一个你能够看得到、摸得着的具体实体
- 类是对象的类型
- 对象是特定类型的数据

> 具体开发过程中，先定义类再实例化对象

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/Cat.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/Cat.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/CatTest.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/CatTest.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/Person.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/Person.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/PersonTest.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/PersonTest.java)

### 单一职责原则

- 单一职责原则(`Single Responsibility Principle`, SRP)，也称为单一功能原则，是面向对象设计中的一个重要原则
- 一个类，应该有且只有一个引起变化的原因
- 在程序设计中，尽量把不同的职责，放在不同的职责中，即把 不同的变化原因，封装到不同的类中。

> **单一职责原则总结**
>
> 单一职责原则(SRP: `Single responsibility principle`)又称单一功能原则，面向对象五个基本原则(SOLID: SRP 单一责任原则、OCP 开放封闭原则、LSP 里氏替换原则、DIP 依赖倒置原则、ISP 接口分离原则)之一。它规定一个 SRP 单一一个发生变化的原因。该原则由罗伯特·C·马丁( Robert C.Martin)于《敏捷软件开发：原则、模式和实践》一书中给出的。马丁表示此原则是基于汤姆·狄马克(Tom DeMarco)和 Meilir Page-Jones 的著作中的内聚性原则发展出的。
>
> 所调职责是指类变化的原因，如果一个类有多于一个的动机被改变，那么这个类就具有多于一个的职责。而单一职责原则就是指一个类或者模块应该有且只有一个改变的原因。
>
> 单一职责原则告诉我们：一个类不能太累！在软件系统中,一个类(大到模块,，小到方法)承担的职责越多，它被复用的可能性就越小。而且一个类承担的职责过多，就相当于将这些职责耦合在一起，当其中一个职责变化时，可能会影响其他职责的运作。因此要将这些职责进行分离，将不同的职责封装在不同的类中，即将不同的变化原因封装在不同的类中，如果多个职责总是同时发生改变则可将它们封装在同一类中。
>
> 之所以会出现单一职责原则就是因为在软件设计时会出现以下类似场景：T 负责两个不同的职责：职责 P1，职责 P2。当由于职责 P1 需求发生改变而需要修改类 T 时，有可能会导致原本运行正常的职责 P2 功能发生故障。也就是说职责 P1 和 P2 被耦合在了一起。
>
> 解决办法：遵守单一职责原则，将不同的职责封装到不同的类或模块中，分别建立两个类 T1、T2，使 T1 完成职责 P1 功能，T2 完成职责 P2 功能。这样，当修改类 T1 时，不会使职责 P2 发生故障风险；同理，当修改 T2 时，也不会使职责 P1 发生故障风险。

### Java 内存管理之堆和栈

我们都知道 Java 程序是运行在 JVM(Java Virtual Machine, Java 虛拟机)上的，可以把 JVM 理解成 Java 程序和操作系统之间的桥梁，而 Java 内存分配也都是基于 JVM 中进行的。

我们今天先来认识一下 Java 程序运行过程会涉及到的两大重要内存区域 - 堆和栈：

**栈**：每个方法(Method)在执行时，都会创建—个栈帧，用于存储局部变量表、操作数、动态链接、方法出口信息等。

需要注意，栈中所存储，多用于保存局部信息的值，譬如：方法体中的基本数据类型定义的变量、对象的引用(也称为对象实例)等。当局部作用范围结束时，栈內信息立即自动释放。

当存储内容是由基本数据类型(byte、short、int、long、float、double、char、 boolean)声明的局部变量时，在栈中存储的是它们对应的具体数值。

当存储的是局部的对象的引用(定义在方法体中的引用类型的变量)，存储的是具体对象在堆中的地址。当然，如果对象的引用没有指向具体的空间，则是 null。

**堆**：用来存放动态产生的数据，比如 new 出来的对象。当对象使用结束，并确定已无实例引用指向堆空间时，JVM 才会依据相关垃圾回收机制进行资源回收，完成堆内资源释放，也就是说，并不是方法结束，方法内涉及到的堆空间就会立即释放，这也是与栈管理不同的地方。

此时，需要注意，创建出来的对象只包含属于各自的成员变量，并不包括成员方法。因为同一个类拥有各自的成员变量，存储在堆中的不同位置，但是同一个类不同实例的之间共享该类的方法，并不是每创建一个对象就把成员方法复制一次。

```java
public class Cat{
    String name;
    int age;

    public void run(double weight){
        System.out.println("小猫已经" + weight + "！太重了，快去跑步！");
    }
}

public class CatTest{
    public static void main(String[] args) {
        Cat one = new Cat();
        double wh = 200;
        one.run(wh);
    }
}
```

执行流程：

1. JM 自动寻找 main 方法，执行第一句代码，创建一个 Cat 类的实例 one，在栈中分配块内存，存放一个指向堆区对象的地址譬如 0x111111。

2. 创建一个 doube 型的变量 wh，由于是基础数据类型，直接在栈中存放 double 对应的值 200。

   ![Java-memory-management-heap-and-stack-01](https://img.zxj.guru/java/img/Java-memory-management-heap-and-stack-01.png)

3. 当调用 one 对象的 run 方法，并以 wh 为参数传入方法时，JVM 检测到方法参数 weight，作为方法局部变量，也会放入栈中并将 Wh 的值 200 复制给 weight。

   ![Java-memory-management-heap-and-stack-02](https://img.zxj.guru/java/img/Java-memory-management-heap-and-stack-02.png)

4. 当完成 run 方法调用后，立即释放局部变量 weight 所占用的栈空间。

   ![Java-memory-management-heap-and-stack-03](https://img.zxj.guru/java/img/Java-memory-management-heap-and-stack-03.png)

5. main 方法运行结束，立即释放栈中 one，wh 的空间，而堆中对象空间，则会当确定无引用指向后，由垃圾回收机制进行回收，不会立即释放资源。

   ![Java-memory-management-heap-and-stack-04](https://img.zxj.guru/java/img/Java-memory-management-heap-and-stack-04.png)

### 对象实例化

- 实例化对象的过程可以分为两部分: `Cat one = new Cat();`

  1. 声明对象 `Cat one`
  2. 实例化对象 `new Cat();`

- 每次 new 对象会产生新的实例化对象。

  ```java
  Cat one = new Cat();
  Cat two = new Cat();
  ```

- 多个对象可以指向同一块实例化空间

  ```java
  Cat one = new Cat();
  Cat two = one;
  ```

  ![Java-class-object-instantiation](https://img.zxj.guru/java/img/Java-class-object-instantiation.png)

> 1. 对象必须被实例化之后才能使用
> 2. 对象间的引用传递，实际上传递的是堆内存空间的使用权

### 构造方法

```java
访问修饰符 构造方法名() {
    // 初始化代码
}

// 1. 构造方法与类同名且没有返回值。
// 2. 构造方法名与类名相同。
```

1. 构造方法与类同名且没有返回值。
2. 构造方法的语句格式。
3. 只能在对象实例化的时候调用。
4. 当没有指定构造方法时，系统会自动添加无参的构造方法。
5. 当有指定构造方法，无论是有参、无参的构造方法，都不会自动添加无参的构造方法。
6. 一个类中可以有多个构造方法。

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/Cat01.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/Cat01.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/Cat01Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/Cat01Test.java)

### this 关键字

- this：当前对象的默认引用；

- this 的使用

  - 调用成员变量，解决成员属性和局部变量同名冲突

    ```java
    String name;
    int age;
    double weight;
    String species;

    // 单参构造
    public Cat(String name) {
        this.name = name;
    }

    // 全参构造
    public Cat(String name, int age, double weight, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }
    ```

  - 调用成员方法

    ```java
    public void eat(String name) {
        this.run();
        System.out.println(name + " 快吃鱼！");
    }

    public void run() {
        System.out.println("小猫快跑！");
    }
    ```

  - 调用重载的构造方法

    ```java
    public Cat() {
        System.out.println("无参构造方法");
    }

    public Cat(String name) {
        this();    // 必须是构造方法第一条语句
        this.name = name;
        System.out.println("单参构造");

    }
    ```

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/Cat01.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/Cat01.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/Cat01Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/Cat01Test.java)

### 就近原则

关于在 Java 方法调用传参时涉及到的"就近原则"，通俗来说可以理解为"有需要,找最近的"

请注意：此处的最近，不仅是简单的代码编写位置，物理显示的近，更是指逻辑含义上的近，即可访问范围内的最近。

警如，在如下代码中，分别定义了 Cat 和 CatTest 类，其中 Cat 类中包含属性 month，方法 run。在 CatTest 中实例化 Cat 对象 one，调用了 run 方法，最后在输出语句中显示属性 month 的值。

```java
public class Cat() {
    int month;

    public void run(int month) {
        month = month;
        System.out.printf("小猫已经 %d 月大了，跑的很欢快！\n", month);
    }
}
```

```java
public class CatTest {
    public static void main(String[] args) {
        Cat one = new Cat();
        int mh = 1;
        one.run(mh);
        System.out.printf("小猫已经 %d 月大了，跑的很欢快！\n", one.month);
    }
}
```

```java
// 运行结果
小猫已经 1 月大了，跑的很欢快！
小猫已经 0 月大了，跑的很欢快！
```

为什么输出结果是 1 和 0，而不是 1 和 1 呢？这就是"就近原则"其作用啦。

接下来，我们就起来分析下这个结果产生的原因：

1. main 方法启动，执行第一条语句，产生 Cat 类型对象 one，此时由于 Cat 类中没有定义构造方法，系统默认提供无参构造，并设置其属性 month 的默认值为 0。

2. 创建一个 int 类型的变量 mh，赋值为 1。

3. 调用 one 的 run 方法，将 mh 作为实参传入 run。此时，run 方法的参数 month 即为 1。

4. run 方法执行第一句，由于此时在 run 方法中，由于就近原则的影响，其"可访问范围内"的 month，最近的是方法形参的 month 也就是说 month= month，执行操作实际为，方法形参的自身赋值。说白了，这句话的执行类似于 1=1，无实际意义。

5. run 方法执行第二句，将赋值结果后的 month 传入输出语句，打印输出。即输出结果的第一行：小猫已经 1 月大了，跑的很欢快。

6. 回到主方法，由于此时 one.month 仍是初始值 0，未被修改过，因此最后打印输出第二行：小猫已经 0 月大了，跑的很欢快。

因此，当实际输出结果需要为 1 和 1 时，常用修订方案：

**方案 1:** 修改 run 方法参数名，使其与类中属性名不同，此时再执行 run 方法第一句时，其可访问范围内的 month 就需要向上找类中的成员属性 month 了，也就会对成员属性赋值，从而影饷主方法中属性输出结果。

```java
public class Cat() {
    int month;

    public void run(int thMonth) {
        month = thMonth;
        System.out.printf("小猫已经 %d 月大了，跑的很欢快！\n", thMonth);
    }
}
```

**方案 2:** 修改方法中的行代码，通过 this 关键字，强行指代类中的成员属性 month 接收方法参数的赋值。此时由于 this 的影响向，run 方法传入的参数，将会直接给属性赋值，进而影响主方法最后的输出结果。

```java
public class Cat() {
    int month;

    public void run(int month) {
        this.month = month;
        System.out.printf("小猫已经 %d 月大了，跑的很欢快！\n", month);
    }
}
```

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/Monkey.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/Monkey.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/MonkeyTest.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/MonkeyTest.java)

### this 关键字应用

this 是 Java 中常用的关键字，代表当前对象本身，可以理解为: 指向当前对象的一个引用。

this 在 Java 中可用于调用成员属性、成员方法、构造方法，也可以当作参数进行方法传参以及方法返回值。

#### this 调用成员属性

示例: 分别在 run 和 eat 方法中，通过 this 访问属性 month 和 name。

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat01，通过 this 访问成员属性
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat01 {
    int month;
    String name;

    public void run(int month) {
        // 局部变量和成员属性同名并且需要访问成员属性，必须加 this。
        this.month = month;
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", month);
    }

    public void eat() {
        this.name = "huahua";
        System.out.printf("名叫 %s 的小猫在吃鱼！\n", this.name);
    }

    public void run1(int month) {
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", month);
    }

    public void eat1() {
        name = "huahua";
        System.out.printf("名叫 %s 的小猫在吃鱼！\n", this.name);
    }
}
```

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat01 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat01Test {
    public static void main(String[] args) {
        Cat01 one = new Cat01();
        int mh = 1;

        System.out.println("---------- 没有 this ----------");
        one.run1(mh);
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", one.month);
        one.eat1();

        System.out.println("---------- 有 this ----------");
        one.run(mh);
        System.out.printf("小猫已经 %d 个月大了，跑的很欢快！\n", one.month);
        one.eat();
    }
}
```

```java
---------- 没有 this ----------
小猫已经 1 个月大了，跑的很欢快！
小猫已经 0 个月大了，跑的很欢快！
名叫 huahua 的小猫在吃鱼！
---------- 有 this ----------
小猫已经 1 个月大了，跑的很欢快！
小猫已经 1 个月大了，跑的很欢快！
名叫 huahua 的小猫在吃鱼！
```

**总结:** 大部分时候，类的方法中访问成员属性时无须使用 this，但如果方法里存在局部变量和成员属性同名，但程序又需要在该方法里访问成员属性时，则必须使用 this 进行调用。

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat01.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat01.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat01Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat01Test.java)

在类中的 run 方法中，分别通过 this 以及不加 this 为前缀调用的方式访问同类中的 eat 方法。

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat02，通过 this 调用成员方法
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat02 {
    String name;

    public void run() {
        System.out.println("---------- 有 this ----------");
        this.eat();
        System.out.println("---------- 没有 this ----------");
        eat();
    }

    public void eat() {
        name = "huahua";
        System.out.printf("名叫 %s 的小猫在吃鱼！\n", this.name);
    }
}
```

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat02 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat02Test {
    public static void main(String[] args) {
        Cat02 one = new Cat02();
        one.run();
    }
}
```

```java
---------- 有 this ----------
名叫 huahua 的小猫在吃鱼！
---------- 没有 this ----------
名叫 huahua 的小猫在吃鱼！
```

**总结:** 大部分时候，类的成员方法访问同类中其他成员方法时，this 关键字可加可不加，效果相同。

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat02.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat02.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat02Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat02Test.java)

#### this 调用构造方法

在类中分别定义了属性 name 和 month，无参构造方法、单参构造方法以及双参构造方法；

在测试类中，定义多个类的类型引用，并分别应用不同构造方法进行实例化。

**在带参构造中调用无参构造**

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat03，
 * 在单参构造中使用 this 调用无参构造，双参构造中调用单参构造
 * 在普通成员方法内调用构造
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat03 {
    String name;
    int month;

    public Cat03() {
        System.out.println("无参构造！");
    }

    public Cat03(String name) {
        // 调用无参构造
        // 构造方法的调用必须是构造函数本体中的第一条语句!!!
        /*this.name = name;
        this(); // Error: 'this()' 调用必须是构造函数本体中的第一条语句
        System.out.println("单参构造！");*/

        this();
        this.name = name;
        System.out.println("单参构造！");
    }

    public Cat03(String name, int month) {
        this(name);
        this.month = month;
        System.out.println("双参构造！");
    }

    public void run() {
        // 不能在类中普通成员方法内通过 this() 调用构造方法
        // this();
        System.out.println("小猫快跑！");
    }
}
```

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat03 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat03Test {
    public static void main(String[] args) {
        Cat03 one, two, three;

        System.out.println("--------- 调用无参构造 ---------");
        one = new Cat03();

        System.out.println("--------- 单参构造调用无参构造 ---------");
        two = new Cat03("huahua");

        System.out.println("--------- 双参构造调用单参构造 ---------");
        three = new Cat03("huahua", 2);
    }
}
```

```java
--------- 调用无参构造 ---------
无参构造！
--------- 单参构造调用无参构造 ---------
无参构造！
单参构造！
--------- 双参构造调用单参构造 ---------
无参构造！
单参构造！
双参构造！
```

**总结：**

1. 可以在构造方法中，通过 this 调用本类中的另一个构造方法，但是，调用动作必须置于方法中的第一行。
2. 可以通过 this 调用本类中带参或者无参构造方法，调用带参构造方法时，需要按顺序传入设定的参数。
3. 在一个构造方法内只能调用一个构造方法。

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat03.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat03.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat03Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat03Test.java)

**在普通成员方法内调用构造**

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat03，
 * 在单参构造中使用 this 调用无参构造，双参构造中调用单参构造
 * 在普通成员方法内调用构造
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat03 {
    String name;
    int month;

    public Cat03() {
        System.out.println("无参构造！");
    }

    public void run() {
        // 不能在类中普通成员方法内通过 this() 调用构造方法
        // this();
        System.out.println("小猫快跑！");
    }
}
```

**总结:** 不能在类中普通成员方法内通过 this 调用构造方法。

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat03.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat03.java)

- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat03Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat03Test.java)

#### this 方法调用时作为参数传递

在类中，定义 run 方法，方法参数为类对象。类方法中，调用 run 方法，并通过 this 指代，传入当前对象。

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat04，使用 this 调用使用类作为参数的成员方法。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat04 {
    String name;

    public Cat04() {
    }

    public Cat04(String name) {
        this.name = name;
    }

    // 使用 this 调用使用类作为参数的成员方法等价于下面的方法
    public void call() {
        // this可以作为方法参数进行传递,代表调用方法的当前对象。
        run(this);
    }

    // 等价方法
    // public void call(Cat04 cat04){
    //     run(cat04);
    // }

    public void run(Cat04 cat04) {
        System.out.printf("昵称为 %s 的小猫在奔跑！\n", cat04.name);
    }
}
```

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat04 的测试类。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat04Test {
    public static void main(String[] args) {
        Cat04 one;
        one = new Cat04("huahua");
        one.call();
    }
}
```

```java
昵称为 huahua 的小猫在奔跑！
```

**总结：**this 可以作为方法参数进行传递，代表调用方法的当前对象。

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat04.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat04.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat04Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat04Test.java)

#### this 方法调用时作为返回值传递

在类中，定义 call 方法，方法中通过 this 返回类对象。

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat05，在成员方法中通过 this 返回类对象。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat05 {
    String name;

    public Cat05() {
    }

    public Cat05(String name) {
        this.name = name;
    }

    public Cat05 call(String name) {
        this.name = name;
        //通过 this 返回类对象
        return this;
    }
}
```

```java
package pub.zxj.java2020.week03.classdemo.thiscall;

/**
 * 自定义类 Cat05 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat05Test {
    public static void main(String[] args) {
        Cat05 one = new Cat05();
        System.out.println(one.call("huahua"));
        System.out.println(one.call("huahua").name);
    }
}
```

```java
pub.zxj.java2020.week03.classdemo.thiscall.Cat05@1b6d3586
huahua
```

**总结：** this 可以作为方法返回值，代表返回当前调用对象。

---

- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat05.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat05.java)
- [course-java2020/src/com/imooc/java2020/week03/classdemo/thiscall/Cat05Test.java](course-java2020/src/pub/imooc/java2020/week03/classdemo/thiscall/Cat05Test.java)

### 构造方法常见问题

#### 构造方法与类中成员方法的区别

1. 作用

   - 构造方法: 用于生成并初始化对象，针对不同的初始化状态，设置不同参数的构造方法。

   - 成员方法: 根据类型所需任意功能，进行方法设置。

2. 格式

- 构造方法: 访问修饰符类名(参数列表){}

- 成员方法: 访问修饰符返回值类型方法名(参数列表){}

3. 特点

   - 构造方法

     - 方法名必须与类名相同，包括大小写
     - 没有返回值，也不能用 void 修饰。
     - 如果在定义类时没有定义构造方法，则编译系统会自动插入一个无参数且无方法体的构造方法以完成对象实例化。如果类中显式地定义了一个或多个构造方法，则编译器不再提供默认构造方法。
     - 类中可以包含多个构造方法，多个构造方法之间可以通过 this 进行调用，但仅可在第一行执行调用，this 调用一次只能调用一个构造方法。
     - 只能与 new 一起进行调用，不能通过对象名、类名等其他形式调用。
     - 在非构造方法中，只能结合对象实例化操作被调用，不能通过方法名被访问。

   - 成员方法

     - 方法名符合 Java 命名规范即可。
     - 需设置返回值，如果方法体中无返回值，需用 void 设置。
     - 类中可以包含多个同名成员方法，类内方法间可以在任意位置进行调用。类外，当访问权限允许时，可以通过 `对象名.方法名()` 形式调用。
     - 语法层面来说，可以存在方法名与类名相同的成员方法，但并不推荐。代码中存在方法名与类名相同的成员方法时，编译器会提示 `Warning 方法名称与其类名(构造方法名)相同` ，但是不影响程序运行。

#### 一个类中构造方法可以有几种表现形式?相互之间是否可以调用?

- 一个类中可以包含多个构造方法，只要满足参数类型、顺序、个数不同即可，也称为构造方法重载。

- 不同构造方法之间可以通过 this(参数列表)的方式进行调用，但是只能在构造方法的第一行出现。

- 调用详情及示例可查看 『this 关键字应用』- 『this 调用构造方法』。

#### 进行构造方法的调试时，为啥我的断点会跳到这里来而不在我写的代码里呢?

**解决方案:** 如果在代码调试时，希望进入构造方法内部，需要在对应的构造方法（无参、有参构造方法）上设置断点。否则，就可能会导致代码进入 class 类文件中进行调用。

#### debug 进入之后单步执行为啥会直接报错 source not found?

**解决方案:** 首先 source 并不是报错，而是由于没有配置源码信息，再加上断点设置的位置关系，进行调试时就会展示这个界面。在配置中选择 JDK 目录下的 `src.zip` 文件即可。

## 封装

### 什么是封装

- 将类的某些信息隐藏在类内部，不允许外部程序直接访问
- 通过该类提供的方法来实现对隐藏信息的操作和访问
- 隐藏对象的信息
- 留出访问的接口

#### 封装特点

- 只能通过规定的方法访问数据
- 隐藏类的实例细节，方便修改和实现

#### 封装步骤

1. 修改属性的可见性（设为 private）
2. 创建 getter/setter 方法（设为 public，用于属性的读写）
3. 在 getter/setter 方法中加入属性控制语句（对属性值的合法性进行判断）

---

- [course-java2020/src/com/imooc/java2020/week03/encapsulationdemo/Cat.java](course-java2020/src/pub/imooc/java2020/week03/encapsulationdemo/Cat.java)

- [course-java2020/src/com/imooc/java2020/week03/encapsulationdemo/CatTest.java](course-java2020/src/pub/imooc/java2020/week03/encapsulationdemo/CatTest.java)

#### 关于封装应用中的常见问题

1. **如果不用封装，在要调用的普通成员方法中编写相关限制代码，实现避免在主方法中所调用属性及方法的值被非法篡改，这样不也可以吗，为什么一定要用封装?**

   在面向对象的的设计思想中，封装可以理解为是种利用抽象的函数接口实现细节信息的包装隐藏的方式。我们可以把封装认为是一个保护屏障，防止该类的私密代码和数据被外部类定义的代码随机访问和修改。简单来说，就是"按我的规则，才能玩我的游戏"。而在隐藏信息的同时，我们还要注意职责单一原则的应用，也就是各司其职。

   如果只是从功能实现的角度来说，当然可以将限制代码写在任意的功能实现方法中，但是试想，如果一个类中，有 10 个功能性方法中需要针对某一属性进行相同的设定，我们是设置一次方便，还是设置十次更方便安全呢?

   因此，适当的封装可以让代码更容易理解与维护，也加强了安全性。调用者不能随意通过变量名属性名的方式来修改类中的私密数据信息；同时，在使用的时候，也只需直接调用封装后的方法即可，无需再操心细节处理。

2. **get/set 用两个方法实现取值、赋值，放在一个方法里不是更简单?是否可以改成别的名字呢?**

   如果仅仅是为了实现功能，那么，无论是写在一个方法里，还是用其他名字命名方法都是 OK 的。但是，在基于面向对象的编程思想中，更推荐大家采用 get/set 方法分别实现取值和赋值的功能，让他们各司其职，也更加通俗易懂，毕竟当业务越来越复杂，团队协作的时候，约定俗成会比各有千秋更有价值。

3. **有了 get/set 方法，为什么还需要带参构造方法?或者说，在构造方法中直接写 if...else...判断限制输入输出结果不行么，为什么要多写两个方法 get/set?**

   构造方法与 get/set 方法的作用是不同的，构造方法只能在创建对象时进行调用，如果在对象构建完成后，再想对其某些属性进行赋值和取值，就无法再次应用构造方法啦。因此两者的存在并不冲突，我们可以应用带参构造在对象初始化时进行某些属性的设置，也可以通过 get/set 方法，在对象构建完成后进行后续修订。

4. **main 方法中为什么可以添加 return?什么时候能加?有什么作用?是否可以用 break 进行替换?**

   关于 return 和 break 的应用

   - 当方法中出现 return 表示方法运行终止；当出现 break 则表示循环语句或者 swith 语句运行结束。
   - 如果方法设置了返回值，那么必须出现 return，应用 return 带回返回值；如果方法的返回值为 void，也可以出现 return。但是后面什么也不能加，直接加分号结束。

   因此，主方法中的 return 语句不能与 break 随意替换。

5. **private 修饰的成员怎么用?**

   - 在同一个类中，可以直接访问。
   - 在不同类中，需要通过对应的非私有方法访问。

---

- [course-java2020/src/com/imooc/java2020/week03/encapsulationdemo/practice/Book.java](course-java2020/src/pub/imooc/java2020/week03/encapsulationdemo/practice/Book.java)
- [course-java2020/src/com/imooc/java2020/week03/encapsulationdemo/practice/BookTest.java](course-java2020/src/pub/imooc/java2020/week03/encapsulationdemo/practice/BookTest.java)

#### 引用数据类型的应用 -- 方法参数

Java 中的方法包含无参、有参、无返回值、带返回值多种形态。其中，方法中的参数和返回值，可以使用基本数据类型(譬如：int， float， double 等)定义，也可以使用引用数据类型(譬如：String，数组，自定义类等)定义。

如应用的是基本数据类型的变量，则传递的是数据的值；当为引用数据类型的变量时，传递的则是对象的引用。

现有宠物猫类，包含属性：昵称和年龄。

```java
package pub.zxj.java2020.week03.encapsulationdemo.practice;

/**
 * 宠物猫类 Cat
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat {
    /**
     * 昵称name、年龄age
     */
    private String name;
    private int age;

    /**
     * 有参构造初始化
     *
     * @param name 昵称
     * @param age  年龄
     */
    public Cat(String name, int age) {
        // this.name = name;
        // this.age = age;
        this.setName(name);
        this.setAge(age);
    }

    /**
     * get 获取昵称
     *
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * set 设置昵称
     *
     * @param name 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 获取年龄
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * set 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }
}
```

宠物猫管理类，包含年龄比较的方法 catMonthPk

```java
package pub.zxj.java2020.week03.encapsulationdemo.practice;

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
```

宠物猫测试类，包含主方法

```java
package pub.zxj.java2020.week03.encapsulationdemo.practice;

/**
 * 自定义 Cat 类的测试类：宠物猫测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class CatTest {
    public static void main(String[] args) {
        Cat one, two;
        one = new Cat("huahua", 3);
        two = new Cat("fanfan", 6);
        CatManage manage = new CatManage();
        System.out.println("优胜者 name = " + manage.catMonthPk(one, two).getName() + ", age = " + manage.catMonthPk(one, two).getAge());
    }
}
```

运行结果：

```java
优胜者 name = fanfan, age = 6
```

执行流程

1. 宠物猫测试类中包含主方法，启动后，实例化产生宠物猫类类型的 one，two 两个对象，并通过构造方法完成对象初始化。
2. 完成宠物猫管理类类型实例化操作，并调用 catMonthPk 方法，实现两只宠物猫年龄的对比。
3. 在 catMonthPk 方法中，由于方法参数是自定义类型宠物猫类类型，因此传入 one，two 两个对象的引用，并借由引用获取到对象的年龄，进而进行判断，将年龄大的对象作为返回值返回主方法。
4. 主方法中的局部变量 max 接收到 catMonthPk 返回的最大值的引用，并获取对应信息打印输出。

**请注意：** 当方法参数是引用数据类型对象时，方法调用时，也需传入与之匹配的类型的对象。

---

- [course-java2020/src/com/imooc/java2020/week03/encapsulationdemo/practice/Cat.java](course-java2020/src/pub/imooc/java2020/week03/encapsulationdemo/practice/Cat.java)
- [course-java2020/src/com/imooc/java2020/week03/encapsulationdemo/practice/CatManage.java](course-java2020/src/pub/imooc/java2020/week03/encapsulationdemo/practice/CatManage.java)
- [course-java2020/src/com/imooc/java2020/week03/encapsulationdemo/practice/CatTest.java](course-java2020/src/pub/imooc/java2020/week03/encapsulationdemo/practice/CatTest.java)

### 包

- 管理 Java 文件

- 解决同名文件冲突

#### 定义包

语法：`package 包名;`

例：`package com.imooc.animal;`

注意：

1. 必须放在 Java 源文件中的第一行
2. 一个 Java 源文件中只能有一个 package 语句
3. 包名全部英文小写
4. 命名方式：域名倒序+模块+功能

#### 导入包

语法：`import 包名.类名;`

例：

1. 导入包中全部类：`import com.imooc.*;`
2. 导入包中指定类：`import com.imooc.animal.Cat;`

---

- [course-java2020/src/com/imooc/java2020/week03/packagedemo/animal/Cat.java](course-java2020/src/pub/imooc/java2020/week03/packagedemo/animal/Cat.java)
- [course-java2020/src/com/imooc/java2020/week03/packagedemo/mechanics/Cat.java](course-java2020/src/pub/imooc/java2020/week03/packagedemo/mechanics/Cat.java)
- [course-java2020/src/com/imooc/java2020/week03/packagedemo/demotest/CatTest.java](course-java2020/src/pub/imooc/java2020/week03/packagedemo/demotest/CatTest.java)

#### package 和 import 的常见问题

1. **为什么需要打包，都放在一起使用不行么?**

   为便于大型应用程序中信息管理，解决协同工作时类的命名冲突的问题，Java 引入了"包管理"机制。"包管理"机制类似于计算机管理系统中的文件夹。

   基于合理分类，便于管理的思想，约定：

   - 推荐将一组相互具有联系并组合起来完成某一功能的类聚集到同一个包中。
   - 同一个包中，类名不允许重复。
   - 不同包中，可以存在同名类。

2. **包管理语句使用规则是什么?**

   - 语法规则
     - package
       - 作用: 指明该文件中定义的类所在的包。
       - 语法格式: `package 包名`。
       - 包名推荐定义格式: `域名倒序.模块.功能`，其中: 用 `.` 来指明包的层次。
       - 包名推荐全小写。
     - import
       - 作用:当需要引用本包之外定义的类时，可以通过 import 语句进行信息导入，以简化代码编写。
       - 语法格式: `import 包名.*` 或者 `import 包名.类名`。
   - 注意事项
     - package 语句必须放在 Java 源文件第一行，一个 Java 文件中只能有一条 package 语句。如缺省，则指定为无名包。
     - 一个 Java 文件中可以有多条 import 语句。如缺省，则默认导入 `java.lang` 包下的全部类。
   - import 需写在 class 语句上面，即一个 Java 文件中的存在顺序应是: `package` - `import` - `class`。

3. **import 语句几种导入方式的区别是什么?**

   - `import 包名.*` :导入指定包名下所有直接允许访问的类，无法导入其子包中的类。
   - `import 包名.类` :导入指定包名下指定的类。

#### import 练习

0. 存在两个类：宠物猫类 Cat 和机器猫类 Cat。

   ```java
   package pub.zxj.java2020.week03.packagedemo.animal;

   /**
       * 宠物猫类 Cat
       *
       * @author Jaime
       * @project_name learning-java
       */
   public class Cat {
       /**
           * 无参构造
           */
       public Cat() {
           System.out.println("我是宠物猫！");
       }
   }
   ```

   ```java
   package pub.zxj.java2020.week03.packagedemo.mechanics;

   /**
       * 机器猫类 Cat
       *
       * @author Jaime
       * @project_name learning-java
       */
   public class Cat {
       public Cat() {
           System.out.println("我是机器猫呦~");
       }
   }
   ```

1. 当需要访问宠物猫类时，以下 3 种方案任选其一即可。

   ```java
   package pub.zxj.java2020.week03.packagedemo.demotest;

   // 方案1：import 包名.* - 导入指定包名下所有直接允许访问的类
   // import pub.zxj.java2020.week03.packagedemo.animal.*;

   // 方案2：import 包名.类 - 导入指定包名下指定的类
   // import pub.zxj.java2020.week03.packagedemo.animal.Cat;

   /**
       * Cat 测试类
       * @author Jaime
       * @project_name learning-java
       */
   public class CatTest {
       public static void main(String[] args) {
           // 方案1,2 调用语句
           Cat one = new Cat();
           // 方案3：包名.类名 - 调用时直接写完整名
           pub.zxj.java2020.week03.packagedemo.animal.Cat two = new pub.zxj.java2020.week03.packagedemo.animal.Cat();

       }
   }
   ```

   执行结果：

   ```java
   我是宠物猫！
   ```

2. 如果同时访问宠物猫类和机器猫类时。

   ```java
   package pub.zxj.java2020.week03.packagedemo.demotest;

   import pub.zxj.java2020.week03.packagedemo.animal.Cat;

   /**
       * Cat 测试类
       * @author Jaime
       * @project_name learning-java
       */
   public class CatTest {
       public static void main(String[] args) {
           Cat one = new Cat();
           pub.zxj.java2020.week03.packagedemo.mechanics.Cat two = new pub.zxj.java2020.week03.packagedemo.mechanics.Cat();

       }
   }
   ```

   运行结果：

   ```java
   我是宠物猫！
   我是机器猫呦~
   ```

3. 如果同时导入宠物猫类和机器猫类，**分别以和指定类名进行导入，以类名导入优先级最高。**

   ```java
   package pub.zxj.java2020.week03.packagedemo.demotest;

   import pub.zxj.java2020.week03.packagedemo.mechanics.*;
   import pub.zxj.java2020.week03.packagedemo.animal.Cat;

   /**
       * Cat 测试类
       * @author Jaime
       * @project_name learning-java
       */
   public class CatTest {
       public static void main(String[] args) {
           Cat one = new Cat();
       }
   }
   ```

   运行结果：

   ```java
   我是宠物猫！
   ```

#### 常用系统包

- java.lang 包含 java 语言基础的类
- java.util 包含 java 语言中各种工具类
- java.io 包含输入、输出相关功能的类

### static

- static+属性---静态属性
- static+方法---静态方法
- static+类---不存在（只能 public, abstract, final）
- static+方法内局部变量---不存在

静态成员随类加载产生，直至类销毁才回收。

**静态方法**

1. 可以使用类直接访问同类中的静态成员，不建议通过类实例访问静态成员。
2. 不可以直接调用同类中的非静态成员(只能 static)。
3. 可以通过实例化对象后，对象调用的方式完成非静态成员调用。
4. 静态方法中不能使用 this。

---

- [course-java2020/src/com/imooc/java2020/week03/packagedemo/animal/Cat01.java](course-java2020/src/pub/imooc/java2020/week03/packagedemo/animal/Cat01.java)
- [course-java2020/src/com/imooc/java2020/week03/packagedemo/demotest/Cat01Test.java](course-java2020/src/pub/imooc/java2020/week03/packagedemo/demotest/Cat01Test.java)

### 代码块

1. 通过{}可以形成代码块
2. 方法内的代码块称为：普通代码块
3. 类内的代码块称为：构造代码块
4. 构造代码块前+static：静态代码块

#### 代码块执行顺序

1. 无论实例产生多少对象，静态代码块只执行一次
2. 构造代码块随实例化过程调用
3. 普通代码块随方法调用执行，执行结束后里面的临时变量就会被系统回收。

#### 示例代码

```java
package pub.zxj.java2020.week03.packagedemo.animal;

/**
 * 宠物猫类 Cat02 + {} 代码块
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat02 {
    /**
     * 昵称name、价格price
     */
    private String name;
    public static int price;

    /**
     * 无参构造
     */
    public Cat02() {
    }

    /**
     * 构造初始化
     *
     * @param name 昵称
     */
    public Cat02(String name) {
        this.name = name;
    }

    /**
     * get 获取昵称
     *
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * set 设置昵称
     *
     * @param name 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 静态代码块1
     */
    static {
        System.out.println("====== Cat02 three ======");
        Cat02 three = new Cat02();
        three.setName("fanfan");
        Cat02.price = 20000;
        // tempCat.run(temp.getName(), Cat02.price);
        Cat02.eat(three);
        System.out.println("静态代码块1.");
    }

    /**
     * 静态代码块2
     */
    static {
        System.out.println("静态代码块2.");
    }

    /**
     * 构造代码块1
     */ {
        System.out.println("构造代码块1.");
    }

    /**
     * 构造代码块2
     */ {
        System.out.println("构造代码块2.");
    }

    /**
     * 奔跑的方法
     *
     * @param name 宠物猫昵称
     */
    public void run(String name, int price) {
        System.out.println("name = " + name + ", price = " + price + " 在愉快的奔跑中~");
        /**
         * 普通代码块1
         */
        {
            int age = 12;
            System.out.println("age = "+ age+", run() 普通代码块1.");
        }
        /**
         * 普通代码块2
         */
        {
            int age = 13;
            System.out.println("age = "+ age+", run() 普通代码块2.");
        }
    }

    /**
     * 吃东西的方法
     *
     * @param cat02 宠物猫类对象
     */
    public static void eat(Cat02 cat02) {
        cat02.run(cat02.getName(), Cat02.price);
    }
}
```

```java
package pub.zxj.java2020.week03.packagedemo.demotest;

import pub.zxj.java2020.week03.packagedemo.animal.Cat02;

/**
 * Cat02 测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat02Test {
    public static void main(String[] args) {
        System.out.println("====== Cat02 one ======");
        Cat02 one = new Cat02("huahua");
        one.run(one.getName(), Cat02.price);
        System.out.println("====== Cat02 two ======");
        Cat02 two = new Cat02("niuniu");
        Cat02.price = 1000;
        // two.eat(two);
        Cat02.eat(two);
    }
}
```

执行结果

```java
====== Cat02 one ======
====== Cat02 three ======
构造代码块1.
构造代码块2.
name = fanfan, price = 20000 在愉快的奔跑中~
age = 12, run() 普通代码块1.
age = 13, run() 普通代码块2.
静态代码块1.
静态代码块2.
构造代码块1.
构造代码块2.
name = huahua, price = 20000 在愉快的奔跑中~
age = 12, run() 普通代码块1.
age = 13, run() 普通代码块2.
====== Cat02 two ======
构造代码块1.
构造代码块2.
name = niuniu, price = 1000 在愉快的奔跑中~
age = 12, run() 普通代码块1.
age = 13, run() 普通代码块2.
```

---

- [course-java2020/src/com/imooc/java2020/week03/packagedemo/animal/Cat02.java](course-java2020/src/pub/imooc/java2020/week03/packagedemo/animal/Cat02.java)
- [course-java2020/src/com/imooc/java2020/week03/packagedemo/demotest/Cat02Test.java](course-java2020/src/pub/imooc/java2020/week03/packagedemo/demotest/Cat02Test.java)

## 综合案例

某校开设"计算机科学与应用"专业，专业编号 J0001，学制 4 年。现有 3 名学生都报名学习了这个专业。

| 张三 | S01  | 男   | 18 岁 |
| ---- | ---- | ---- | ----- |
| 姓名 | 学号 | 性别 | 年龄  |
| 李四 | S02  | 女   | 17 岁 |
| 王五 | S03  | 男   | 18 岁 |

### 运行效果

```java
===============================================
专业信息如下:
专业名称: 计算机科学与技术
学科编号: J0001
学制年限: 4

===============================================
学生信息如下:
姓名: 张三
学号: S01
性别: 男
年龄: 18
学科名称: 计算机科学与技术
学制年限: 4

===============================================
学生信息如下:
姓名: 李四
学号: S02
性别: 女
年龄: 17
学科名称: 计算机科学与技术
学制年限: 4

===============================================
学生信息如下:
姓名: 王五
学号: S03
性别: 男
年龄: 18
学科名称: 计算机科学与技术
学制年限: 4
```

### 案例分析

- 专业类

  - 属性：专业编号、专业名称、学制年限 。

  - 方法：介绍（功能：介绍专业相关信息）。

- 学生类

  - 属性：专业编号、专业名称、学制年限。
  - 方法：自我介绍（功能：介绍学生相关信息）。

- 实现专业与学生关联

  - 方案 1： 在学生类的自我介绍方法中，添加两个参数：专业名称、学制年限。

    特点：容易理解、参数列表长。

  - 方案 2： 在学生类的自我介绍方法中，添加一个专业对象作为参数，从中获取专业名称、学制年限。

    特点：相比前一个参数列表简单、获取参数方便。

  - 方案 3： 在学生类中，添加一个专业对象作为属性，从中获取专业名称、学制年限。

    特点：关联性更强。

---

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Subject.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Subject.java)
- [course-java2020/src/com/imooc/java2020/week03/schooldemo/test/SubjectTest.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/test/SubjectTest.java)
- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Student.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Student.java)
- [course-java2020/src/com/imooc/java2020/week03/schooldemo/test/StudentTest.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/test/StudentTest.java)

方案 1 代码：

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Subject.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Subject.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Student01.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Student01.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/test/Student01Test.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/test/Student01Test.java)

方案 2 代码：

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Subject.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Subject.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Student02.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Student02.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/test/Student02Test.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/test/Student02Test.java)

方案 3 代码：

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Subject.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Subject.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Student03.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Student03.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/test/Student03Test.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/test/Student03Test.java)

### 扩展功能

实现统计指定专业下有多少报名参加的学生。

运行效果：

```java
===============================================
专业信息如下:
专业名称: 计算机科学与技术
学科编号: J0001
学制年限: 4
专业学科报名学生人数: 3
```

实现方案：

- 在专业类中添加属性：学生数组、学生总人数
- 添加方法：新增学生。功能：将新增学生插入数组，并获取学生总人数。

---

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Subject01.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Subject01.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/model/Student04.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/model/Student04.java)

- [course-java2020/src/com/imooc/java2020/week03/schooldemo/test/Student04Test.java](course-java2020/src/pub/imooc/java2020/week03/schooldemo/test/Student04Test.java)

### 关于类型创建阶段常见问题

#### 为什么要写多个构造方法，只写一个不行么？或者不写构造方法，直接在类里写个带对象返回值的方法，不也能实现结果么？

类中可以存在多个构造方法，可以有无参，也可以有带参，也就是构造方法的重载方式有很多。

如果只是从上面案例的实现结果来看，只定义一个带参构造方法，或者，做一个带对象作为返回值的成员方法的确可实现功能，但有几点需要注意：

- 构造方法主要用于实现对象的实例初始化，即便没有手动定义，编译器也会默认提供一个该类的无参构造以供类型创建。基于职责单一的角度，如果只是对象的初始信息赋值，建议还是在构造方法中实现。
  - 从程序的可扩展性和维护性的考虑，建议在程序中，写一下无参构造，一方面给使用者可以提供更多的实例化对象的方式选择;另一方面也方便后续程序扩展，这点在后面章节进行继承相关内容讲解时会有详细介绍。

#### 怎么实现性别只允许为男或女的设置？

- 性别信息分别与字符串"男"，"女"进行比对，并进行逻辑判断
- 如果满足判断结果，则将数据存入性别属性；如不满足，可设置为默认性别值，譬如"男"。

```java
/**
* set 设置学生性别
*
* @param stuSex 学生性别
*/
public void setStuSex(String stuSex) {
    // this.stuSex = ((stuSex == "男") || (stuSex == "女")) ? stuSex : "男";
    this.stuSex = (("男".equals(stuSex)) || ("女".equals(stuSex))) ? stuSex : "男";
}
```

几点注意：

1. `setStuSex()` 中，如果将 `equals` 修改为 "`equals`"，虽然不影响本段程序的运行结果，但表示的是对象引用是否一致，此处建议用 `equals` 进行对象内容的比较，相关内容在后面的字符串课程中会有详细介绍。

2. 在目前的代码中 `setStuSex()` 中，通过 `||` 实现性别条件的判断，也可以通过 `&&` 判断，此时代码修订可参考，请注意其中!运算符的结合运用，表示不等于男，同时不等于女:

   ```java
   public void setStuSex(String stuSex) {
       // this.stuSex = ((stuSex == "男") || (stuSex == "女")) ? stuSex : "男";
       this.stuSex = ( !("男".equals(stuSex)) && !("女".equals(stuSex))) ?  "男" : stuSex;
   }
   ```

3. 如在构造方法执行时即进行信息验证，注章在构造方法中对于 `setStuSex()` 方法的调用。

#### 可以把 Student 和 Subject 放在一个类里面吗？为什么要写两个类？把所有的属性放在一个类里，还不用导包多简单？

基于单一职责设计原则，此处更推荐将 Student 与 Subject 设计为 2 个类，分别管理各自信息。毕竟，我们学习的终极目标不仅是能盖砖瓦房，而是能盖摩天大楼，各司其职才好的进行后续程序的维护和功能扩展。

#### 必须要在构造方法里调用 set/get 方法么？ get/set 方法有什么用？为什么不能直接放在一个方法里实现，调用多方便？

从 Java 封装设计的角度，建议将类内属性设置为私有，通过公有的 get/set 方法完成对外的取值和赋值操作（其中 set 是对属性赋值，get 是获取属性值）。同时，也是基于单一职责原则，建议每个方法完成各自独立的功能，而不是混在一起完成。因此，不建议将赋值和取值操作合并到一个方法中完成。

关于在类的构造方法中， set/get 的调用可以参考以下原则:

- 如果确定 get/set 方法中，对属性无特殊操作(譬如验证等)，只是简单的赋值取值，可以不调用，直接使用 `this.属性名 = 赋值;` 的形式
- 如果不能确保 get/set 方法中，一定无特殊操作；或已知方法中已进行了相关复杂操作时，推荐在构造方法中，通过 `this.set/get` 的形式操作属性，以避免错失验证过程。

### 关于类型关联阶段常见问题

#### 什么时候使用 this，看到几个方案中都用到了 this，他们代表什么含义?是否可以去掉呢?

this 在 Java 中主要代表当前对象的意思。结合下面中的代码，简单可以理解为，谁调用了这个 introduction 谁就是 this。

```java
/**
 * 学生自我介绍的方法
 *
 * @return 自我介绍的信息，包括姓名、学号、性别、年龄
 */
public String introduction () {
    String str = "学生信息如下：" +
        "\n姓名：" + this.getStudentName() +
        "\n学号：" + this.getStudentNo() +
        "\n性别：" + this.getStudentSex() +
        "\n年龄：" + this.getStudentAge() +
        "\n所报专业名称：" + this.getStudentSubject().getSubjectName() +
        "\n学制年限：" + this.getStudentSubject().getSubjectLife();
    return str;
}
```

如当主方法中以下面的代码中的方式完成方法调用时，执行过程中，stu1 就是对应的 this，可以在方法中进一步获取 stu1 的专业成员，并获取其专业名称和年限。

```java
//测试Student
Student stu1 = new Student("S01", "张三", "男", 200);
System.out.println(stu1.introduction());
```

此处的 this 可以省略，对于程序运行结果并无影响，在方法中加入 this，只是显示表示调用的是当前对象的某个特定成员信息。

但是有一种情况，this 不能省，即方法传参时，如果传入参数名与属性名相同，如需特定表明传入数值是赋值给类中属性时，譬如下面的代码所示：

```java
public void setSubjectNo(String subjectNo) {
    this.subjectNo = subjectNo;
}
```

当将 Subject 类型的对象作为 Student 类型的成员属性的应用时，为什么要在 `getStudentSubject()` 中实例化？而不是在 set 方法中？

关于 get/set 方法，我们先来回忆一下，两个方法的作用:

- set: 结合参数给类中的属性进行赋值。
- get: 结合返回值，将类中属性返回调用处

因此，如下所示: `getStudentSubject()` 方法最终是将属性 `studentSubject` 返回，之前的判断及实例化操作，只是为了确保返回的 `studentSubject` 属性是不为 Null 的，是有意义的。

```java
/**
 * 获取专业对象，如果没有实例化，先实例化后再返回
 * @return 专业对象信息
 */
public Subject getStudentSubject() {
    if(this.studentSubject == null)
        this.studentSubject = new Subject();
    return studentSubject;
}
```

也就是说，如果我们需要在赋值时判断，如果传入参数为 null，则需要属性自行完成实例化，不为空时，则将输入参数赋值给属性，此时就建议在 set 方法中完成啦，参考代码如下:

```java
public Subject getStudentSubject() {
    if(this.studentSubject == null) {
        this.studentSubject = new Subject();
    } else {
        this.studentSubject = studentSubject;
    }

}
```

由此可见，究竟是在 set 还是 get 方法中进行判断和实例化，是需要结合功能实现目标来确定的。

#### getStudentSubject()中为什么是 this.studentSubject = new Subject(); 之前不都是 类名 对象名 = new 类名(); 么?

此处在 get 方法中是针对类中已经定义的属性 `studentSubject` 进行实例化，所以直接写 `this.studentSubject = new Subject();` 就可以。当需要新定义一个对象的时候，就需要采用 `类名 对象名 = new 类名();` 的形式。

#### introduction 方法中为什么获取专业名称、年限要两次调用？其他数据一次就能调出来？

结合下图代码示例，简单来说，前 4 个属性，我们只需要获取单数据信息就可以，因此通过对应的 get 方法，也就是 `getStudentName()`、 `getStudentNo()`、 `getStudentSex()`、 `getStudentAge()` 方法就可以直接获取；而第五个属性 `studentSubject` 是一个对象，我们希望在 introduction 方法中进步获取 `studentSubject` 里面的名称和年限属性值时，就需要两步操作了。以获取专业名称为例

第一步: 获取类中 `studentSubject` 属性，即 `this.studentSubject =this.getStudentSubject();`

第二步: 获取 `studentSubject` 的名称属性，即 `this.studentSubject.getSubjectName();`

两步合并，即为 `this.getStudentSubject().getSubjectName();`

```java
public class Student {
    // 成员属性：学号、姓名、性别、年龄、专业
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;
    ...
}
```

```java
/**
 * 学生自我介绍的方法
 *
 * @return 自我介绍的信息，包括姓名、学号、性别、年龄
 */
public String introduction () {
    String str = "学生信息如下：" +
        "\n姓名：" + this.getStudentName() +
        "\n学号：" + this.getStudentNo() +
        "\n性别：" + this.getStudentSex() +
        "\n年龄：" + this.getStudentAge() +
        "\n所报专业名称：" + this.getStudentSubject().getSubjectName() +
        "\n学制年限：" + this.getStudentSubject().getSubjectLife();
    return str;
}
```

### 引用数据类型应用--成员属性

通过前面的学习，我们知道 Java 的类中可以包含属性和方法。其中，属性可以使用基本数据类型（int，float，double 等）定义，也可以使用引用数据类型（String，数组，自定义类等）定义。

下面将从多角度对比总结，应用引用数据类型声明属性时的特点和注意事项。

#### 作用

- 引用数据类型: 完成实例化后，可借由该类型对象获取其中非私有成员。
- 基本数据类型: 无需初始化，只能操作对应类型具体数值。

#### 初始值

- 引用数据类型: 未进行实例化时为 null；迸行实例化后，将依据对应的构造方法完成初始成员信息设置。
- 基本数据类型: 无需初始化，各类型有各自默认值（如: int 是 0，double 是 0.0 等）

#### 调用方式

**Ps: 此时指在类内方法中访问，暂不考虑 static 修饰的情况**

- 引用数据类型: 如未进行实例化，方法中调用对象非私有成员时会报空指针异常（具体内容，后面小节中会详细个绍）；当进行初始化后，可借由对象访问其非私有成员信息。
- 基本数据类型: 可直接调用获取具体数值。

示例: 现有公司类和员工类，在测试类中对员工信息进行测试。

```java
/**
 * 公司类 Company
 */
public class Company {
    /**
     * 公司名name、公司地址address
     */
    String name;
    String address;

    /**
     * 初始化全部属性
     *
     * @param name    公司名
     * @param address 公司地址
     */
    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
```

```java
/**
 * 员工类
 */
public class Staff {
    /**
     * 员工年龄age、员工姓名name、员工所在公司comp
     */
    int age;
    String name;
    Company comp;

    /**
     * 初始化全部属性
     *
     * @param age  员工年龄
     * @param name 员工姓名
     */
    public Staff(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 显示员工信息
     * @return 员工信息
     */
    public String display() {
        return "Staff {" +
                "\n \r age = " + this.age +
                "\n \r name = " + this.name +
                "\n \r compaName = " + this.comp.name +
                "\n \r compAddress = " + this.comp.address +
                "\n}";
    }
}
```

在测试类中生成公司、员工对象，但未对员工对象中的公司属性赋值：

```java
public class Test {
    public static void main(String[] args) {
        Company cp = new Company("niuniu", "加里敦");
        Staff st = new Staff(30, "huahua");
        System.out.println(st.display());
    }
}
```

运行结果：

```java
Exception in thread "main" java.lang.NullPointerException
    at pub.zxj.java2020.week03.packagedemo.practice.Staff.display(Staff.java:47)
    at pub.zxj.java2020.week03.packagedemo.practice.Test.main(Test.java:11)
```

如果修改员工类中代码：加入对员工公司属性的初始化设置。

```java
public class Staff {
    /**
     * 员工年龄age、员工姓名name、员工所在公司comp
     */
    int age;
    String name;
    Company comp = new Company("不知道啥公司~", "不知道啥位置~");

    ...
}
```

保持测试类代码和公司类代码不变。此时运行无异常，结果中将展示初始化的公司属性的默认值。运行代码结果：

```java
Staff {
 age = 30
 name = huahua
 compaName = 不知道啥公司~
 compAddress = 不知道啥位置~
}
```

如果员工类中，公司属性定义时未初始化，但在加入双参构造方法中时做信息判断：

```java
public class Staff {
    /**
     * 员工年龄age、员工姓名name、员工所在公司comp
     */
    int age;
    String name;
    Company comp;

    /**
     * 初始化全部属性
     *
     * @param age  员工年龄
     * @param name 员工姓名
     */
    public Staff(int age, String name) {
        this.age = age;
        this.name = name;
        if (this.comp == null){
            comp = new Company("不知道啥公司~", "不知道啥位置~");
        }
    }

    ...
}
```

保持测试类代码和公司类代码不变。此时，虽然员工类中的公司属性定义时未完成初始化，但是在构造方法中有相关判断，江湾城属性初始化操作，从而在 main 方法中调用时不会产生异常。运行代码结果：

```java
Staff {
 age = 30
 name = huahua
 compaName = 不知道啥公司~
 compAddress = 不知道啥位置~
}
```

如果保留员工类、公司类初始代码不变（即员工类中公司属性在定义时和构造方法中均未初始化），修改测试类中代码：加入对员工的公司属性赋值：

```java
public class Staff {
    /**
     * 员工年龄age、员工姓名name、员工所在公司comp
     */
    int age;
    String name;
    Company comp;

    /**
     * 初始化全部属性
     *
     * @param age  员工年龄
     * @param name 员工姓名
     */
    public Staff(int age, String name) {
        this.age = age;
        this.name = name;
    }

    ...
}
```

```java
public class Test {
    public static void main(String[] args) {
        Company cp = new Company("niuniu", "加里敦");
        Staff st = new Staff(30, "huahua");
        st.comp = cp;
        System.out.println(st.display());
    }
}
```

员工对象的公司属性，虽然在类定义时未初始化，但是在 main 方法中调用正确赋值，执行结果：

```java
Staff {
 age = 30
 name = huahua
 compaName = niuniu
 compAddress = 加里敦
}
```

### Java 中推荐的命名规范

#### 包名

- 包名命名，所有字母都小写。

- 包命名的路径建议符合所开发的系统模块的定义，以便看了包名就明白是哪个模块，从而直接到对应包里找相应的实现。

- 由于 Java 面向对象的特性，每名 Java 开发人员都可以编写属于自己的包，为了保障每个包命名的唯一性，在最新的 Java 编程规范中，要求开发人员在自己定义的包名前加上唯一的前缀。由于互联网上的域名称是不会重复的，所以多数开发人员采用 `自己公司的名称.项目名.模块名*.*.*`，在互联网上的域名称作为自己程序包的唯一前缀。例如: `com.imooc.base.类`。

- 个人项目包的推荐命名：

  - indi：个体项目。指个人发起，但非自己独自完成的项目，可公开或私有项目，版权主要属于发起者。例如：包名为 `indi.发起者名.项目名.模块名.*.*.*`。
  - pers：个人项目。指个人发起，独自完成，可分享的项目，版权主要属于个人。例如：包名为 `pers.个人名.项目名.模块名.*.*.*`。
  - priv：私有项目。指个人发起，独自完成，非公开的私人使用的项目，版权属于个人。例如包名为 `priv.个人名.项目名.模块名.*.*.*`。

- 团队项目包的推荐命名：

  - team：团队项目指由团队发起，并由该团队开发的项目，版权属于该团队所有。例如包名为 `team.团队名.项目名.模块名.*.*.*`。
  - com：公司项目。由项目发起的公司所有。例如：包名为 `com.公司名.项目名.模块名.*.*.*`。

#### 类名

- 类名命名，推荐单词的首字母大写。
- 如果类名称由多个单词组成，则每个单词的首字母均应为大写，例如：`TestPage`。如果类名中包含单词缩写，则这个所写词的每个字母均应大写，例如： `XMLExample`。还有一点命名技巧就是由于类是设计用来代表对象的，所以在命名类时应尽量选择名词，例如： `Graphics`。

#### 方法名

- 首字母小写，如果是由多个单词组成的话，第一个单词的首字母小写，其余的单词首字母应大写。

#### 变量名

推荐的命名规范有以下三种：

- Camel 标记法：首字母是小写的，接下来的单词都以大写字母开头。譬如：定义一个变量，用来记录文档数量： `docCount`。
- Pascal 标记法：首字母是大写的，接下来的单词都以大写字母开头。譬如上例中的文档数量记录的变量，则修订为： `DocCount`。
- 匈牙利标记法：在以 Pascal 标记法的变量前附加小写序列说明该变量的类型。基本结构为： `scope_typeVariableName`，它使用 1-3 字符前缀来表示数据类型，3 个字符的前缀必须小写，前缀后面是由表意性强的一个单词或多个单词组成的名字，而且每个单词的首写字母大写，其它字母小写。譬如，上例中的定义文档数量记录的变量是一个整形变量，则应修订为： `intDocCount` 。

通常在团队开发中，会预先设定统一的命名方式，以便于团队中项目的维护。

## 作业实践 - 办公信息化管理系统

### 题目要求

某公司要开发内部的"办公信息化管理系统"，请使用面向对象的思想描述以下员工信息。

| 姓名   | 工号 | 性别 | 年龄 | 所在部门 | 职务 |
| ------ | ---- | ---- | ---- | -------- | ---- |
| 张铭   | S001 | 男   | 29   | 人事部   | 经理 |
| 李艾爱 | S002 | 女   | 21   | 人事部   | 助理 |
| 孙超   | S003 | 男   | 29   | 人事部   | 职员 |
| 张美美 | S004 | 女   | 26   | 市场部   | 职员 |
| 蓝迪   | S005 | 男   | 37   | 市场部   | 经理 |
| 米莉   | S006 | 女   | 24   | 市场部   | 职员 |

| 部门编号 | 部门名称 | 员工数组         | 员工人数 |
| -------- | -------- | ---------------- | -------- |
| D001     | 人事部   | 张铭,李艾爱,孙超 | 3        |
| D002     | 市场部   | 张美美,蓝迪,米莉 | 3        |

| 职务编号 | 职务名称 |
| -------- | -------- |
| P001     | 经理     |
| P002     | 助理     |
| P003     | 职员     |

程序运行参考效果图如下：

```java
姓名: 张铭
工号: S001
性别: 男
年龄: 29
职务: 人事部经理
============================
姓名: 李艾爱
工号: S002
性别: 女
年龄: 21
职务: 人事部助理
============================
姓名: 孙超
工号: S003
性别: 男
年龄: 29
职务: 人事部职员
============================
姓名: 张美美
工号: S004
性别: 女
年龄: 26
职务: 市场部职员
============================
姓名: 蓝迪
工号: S005
性别: 男
年龄: 37
职务: 市场部经理
============================
姓名: 米莉
工号: S006
性别: 女
年龄: 24
职务: 市场部助理
============================
人事部总共有 3 名员工
市场部总共有 3 名员工
```

### 任务描述

#### 语言和环境

- 实现语言：Java 语言。
- 环境要求及开发工具：JDK、 Eclipse。

#### 程序整体要求

1. 划分功能模块，根据题目要求设置不同的类，在类中实现相应功能的管理。
2. 类的标识要漬楚易懂，代码结构要层次分明，代码编辑思路要清晰、整洁。
3. 要求 Java 代码书写、命名符合规范，属性所属数据类型要准确合理，在代码中添加必要的注释。
4. 程序运行效果与提供的页面效果图、结构保持致，信息间分隔符"="号数量不做统一要求，文字大小、颜色也不做统一要求。
5. 将作业项目形成压缩文件并提交。

### 思路分析

由场景和运行效果，可以分析出项目中可以抽取如下类(要求编码时注意面向对象思想及封装特性的应用)。

- 部门类

  - 类型描述：能够描述部门编号、部门名称、员工数组、统计部门中的员工个数。

    ```java
    /**
     * 部门编号departmentId，部门名称departmentName，员工数组departmentStaff和部门中的员工个数departmentStaffCount
     */
    private String departmentId;
    private String departmentName;
    private Staff[] departmentStaff;
    private int departmentStaffCount;
    ```

  - 要求：设定方法统计该部门员工个数。(将部门员工添加进部门并同时统计部门员工人数)

    ```java
    /**
     * 将部门员工添加进部门并同时统计部门员工人数。
    * @param departmentStaff 部门员工
     */
    public void addDepartmentStaff(Staff departmentStaff) {
        departmentStaff.setStaffDepartment(this);
        this.setDepartmentStaffCount(this.getDepartmentStaffCount() + 1);
    }
    ```

- 提示：部门类的属性有四个，分别是部门编号，部门名称，员工数组和统计变量。具体是市场部还是人事部，是通过部门类的对象来表示的，如果是市场部的对象，那么添加并统计的就是市场部的人数。同样如果是人事部的对象，添加并统计的就是人事部的人数。

- 职务类

  - 类型描述：能够描述职务编号、职务名称。

    ```java
    /**
     * 职务编号postId、职务名称postName
     */
    private String postId;
    private String postName;
    ```

- 员工类

  - 类型描述：能够描述员工姓名、工号、年龄、性别、所属部门、职务信息 。

    ```java
    /**
     * 员工姓名staffName、工号staffId、年龄staffAge、性别staffSex、所属部门staffDepartment、职务信息staffPost
     */
    private String staffName;
    private String staffId;
    private int staffAge;
    private String staffSex;
    private Department staffDepartment;
    private Post staffPost;
    ```

  - 要求：

    - 设定方法限定年龄只能是 18-65 之间，反之则设置默认为 18 岁。

      ```java
      /**
       * set 设置员工年龄
       *
       * @param staffAge 员工年龄
       */
      public void setStaffAge(int staffAge) {
          this.staffAge = ((staffAge < 18) || (staffAge > 65)) ? 18 : staffAge;
      }
      ```

    - 设定方法限定性别只能是"男"或者"女"，反之则设置默认为"男"。

      ```java
      /**
       * set 设置员工性别
       *
       * @param staffSex 员工性别
       */
      public void setStaffSex(String staffSex) {
          this.staffSex = (("男".equals(staffSex)) || ("女".equals(staffSex))) ? staffSex : "男";
      }
      ```

    - 设定方法，实现员工自我介绍信息，将员工信息作为字符串返回。

      ```java
      /**
       * 实现员工自我介绍信息，将员工信息作为字符串返回。
       *
       * @return 员工信息(姓名 、 工号 、 性别 、 年龄 、 职务)
       */
      public String showStaffInfo() {
          return "姓名: " + this.getStaffName()
                  + "\n工号: " + this.getStaffId()
                  + "\n性别: " + this.getStaffSex()
                  + "\n年龄: " + this.getStaffAge()
                  + "\n职务: " + this.getStaffPost()
                  + "\n============================\n";
      }
      ```

- 测试类

  - 类型描述：测试程序，并参照效果图输出结果。

注意：可以在属性上添加适当的信息验证，提高信息的安全性。

### 评分标准

- 规范【10 分】

  - 每个类都封装在自己独立的"java"文件中；
  - 文件、class、成员变量命名规范；
  - 代码结构要层次分明；
  - Java 代码规范及添加适量注释。

- 程序整体运行效果【10 分】

  - 程序正常运行效果，且满足效果图要求。信息间分隔符"="号数量不做统一要求。

- 部门类【22 分】

  - 能够描述部门编号、部门名称、获取所有该部门员工信息；
  - 设定方法，完成统计该部门员工个数的功能。

- 职务类【6 分】

  - 能够描述职务编号、职务名称。

- 员工类【34 分】

  - 能够描述员工姓名、工号、年龄、性别、所属部门、职务信息；
  - 设定方法来约束年龄的范围；
  - 设定方法来限定性别的选择；
  - 设定方法，实现员工自我介绍信息，将员工信息作为字符串返回。

- 测试类【18 分】

  - 测试程序，将题目中的员工信息传入到程序中，参照效果图输出结果。

---

- [course-java2020/src/com/imooc/java2020/week03/officemanagementsystem](course-java2020/src/pub/imooc/java2020/week03/officemanagementsystem)

## 继承

- 一种类与类之间的关系

- 使用已存在的类的定义作为基础建立新类

- 新类的定义可以增加新的数据或新的功能，也可以用父类的功能，但不能选择性地继承父类。

```java
父类（基类）
↑
子类（派生类）
```

### 特点

- 子类拥有父类非 private 的属性、方法。
- 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
- 子类可以用自己的方式实现父类的方法。
- Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 B 类继承 A 类，C 类继承 B 类，所以按照关系就是 B 类是 C 类的父类，A 类是 B 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。
- 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。

### 继承的关系

满足"A is a B "的关系就可以形成继承关系如：

- 猫、狗是动物 → 猫，狗继承自动物

- 学生、老师是人 → 学生，老师继承自人

- 小轿车、大卡车是汽车 → 小轿车，大卡车继承自汽车

### 实现继承

使用 extends 实现封装

- 写父类

  ```java
  class Animal{
      //公共的属性和方法
  }
  ```

- 编写子类，继承父类

  ```java
  class Dog extends Animal{
      //子类特有的属性和方法
  }
  class Cat extends Animal{    //只能继承一个父类
      //子类特有的属性和方法
  }
  ```

---

- [course-java2020/src/com/imooc/java2020/week03/inheritancedemo/animal/Animal.java](course-java2020/src/pub/imooc/java2020/week03/inheritancedemo/animal/Animal.java)

- [course-java2020/src/com/imooc/java2020/week03/inheritancedemo/animal/Cat.java](course-java2020/src/pub/imooc/java2020/week03/inheritancedemo/animal/Cat.java)

- [course-java2020/src/com/imooc/java2020/week03/inheritancedemo/animal/Dog.java](course-java2020/src/pub/imooc/java2020/week03/inheritancedemo/animal/Dog.java)

- [course-java2020/src/com/imooc/java2020/week03/inheritancedemo/animaltest/Test.java](course-java2020/src/pub/imooc/java2020/week03/inheritancedemo/animaltest/Test.java)

### 方法重写

#### 方法重写 PK 方法重载

- 方法重写 Override

  - 在满足继承关系的子类中
  - 方法名、参数个数、顺序、类型与父类相同
  - 返回值相同，访问修饰符的限定范围大于等于父类方法

- 方法重载 Overload

  - 在同一个类中

  - 方法名相同

  - 参数列表（个数、顺序、类型）不同。

    ```java
    public void sleep(int month, String name) {}

    public void sleep(String name,int month) {}  // ✔ 参数顺序不同
    public void sleep(int name, String month) {} // ✖ 与参数名无关，都是两个参数，前一个为 int 类型，后一个为 String 类型
    ```

  - 返回值类型、访问修饰符任意

| 区别点   | 重载方法 | 重写方法                                       |
| :------- | :------- | :--------------------------------------------- |
| 参数列表 | 必须修改 | 一定不能修改                                   |
| 返回类型 | 可以修改 | 一定不能修改                                   |
| 异常     | 可以修改 | 可以减少或删除，一定不能抛出新的或者更广的异常 |
| 访问     | 可以修改 | 一定不能做更严格的限制（可以降低限制）         |

#### 编程练习

编程练习：请使用面向对象的思想，设计自定义类完成如下功能要求：
接收用户输入的信息，选择需要完成的工作任务。其中，可供选择的有：测试工作和硏发工作。关于类型设定描述如下：

- 测试工作
  - 属性：工作名称、编写的测试用例个数、发现的 Bug 数量
  - 方法：工作描述
- 研发工作
  - 属性：工作名称、有效编码行数、目前没有解决的 Bug 个数
  - 方法：工作描述

程序运行参考效果图如下：

```java
父类信息测试: 开心工作！
测试工作类信息测试: 测试工作类 的日报是：今天编写了 10 个测试用例，发现了 5 个 bug。
研发工作类信息测试: 研发工作类 的日报是：今天编写了 1000 行代码，目前仍然有 10 个 bug 没有解决。
```

<CodeGroup>
<CodeGroupItem title="Job.java" active>

```java
package pub.zxj.java2020.week03.inheritancedemo.practice.model;

/**
 * 工作类
 *
 * @author Jaime
 */
public class Job {
    /**
     * 工作名称 jobName
     */
    private String jobName;

    /**
     * 无参构造初始化
     */
    public Job() {
    }

    /**
     * 有参构造初始化全部属性
     *
     * @param jobName 工作名称
     */
    public Job(String jobName) {
        this.setJobName(jobName);
    }

    /**
     * get 获取工作名称属性。
     *
     * @return 工作名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 设置工作名称
     *
     * @param jobName 工作名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 描述工作的方法。
     */
    public void showJob() {
        System.out.println("开心工作！");
    }
}
```

</CodeGroupItem>
<CodeGroupItem title="TestJob.java">

```java
package pub.zxj.java2020.week03.inheritancedemo.practice.model;

/**
 * 测试工作类
 *
 * @author Jaime
 */
public class TestJob extends Job {

    /**
     * 测试用例个数testCaseNum、发现 Bug 数量testBugNum
     */
    private int testCaseNum;
    private int testBugNum;

    /**
     * 有参构造初始化测试用例个数、发现 Bug 数量属性
     *
     * @param testBugNum  发现 Bug 数量
     * @param testCaseNum 测试用例个数
     */
    public TestJob(int testCaseNum, int testBugNum) {
        this.setTestCaseNum(testCaseNum);
        this.setTestBugNum(testBugNum);
    }

    /**
     * 有参构造初始化全部属性,调用父类相关赋值方法
     *
     * @param jobName     测试工作类的工作名称
     * @param testBugNum  发现 Bug 数量
     * @param testCaseNum 测试用例个数
     */
    public TestJob(String jobName, int testCaseNum, int testBugNum) {
        super(jobName);
        this.setTestCaseNum(testCaseNum);
        this.setTestBugNum(testBugNum);
    }

    public int getTestCaseNum() {
        return testCaseNum;
    }

    public void setTestCaseNum(int testCaseNum) {
        this.testCaseNum = testCaseNum;
    }

    public int getTestBugNum() {
        return testBugNum;
    }

    public void setTestBugNum(int testBugNum) {
        this.testBugNum = testBugNum;
    }

    /**
     * 重写描述工作的方法。
     */
    @Override
    public void showJob() {
        System.out.printf(" %s 的日报是：今天编写了 %d 个测试用例，发现了 %s 个 bug。\n", this.getJobName(), this.getTestCaseNum(), this.getTestBugNum());
    }
}
```

</CodeGroupItem>
<CodeGroupItem title="DevelopmentJob.java">

```java
package pub.zxj.java2020.week03.inheritancedemo.practice.model;

/**
 * 研发工作类
 *
 * @author Jaime
 */
public class DevelopmentJob extends Job {
    /**
     * 有效编码行数codingLineNum、目前没有解决的Bug数unsolvedBugNum
     */
    private int codingLineNum;
    private int unsolvedBugNum;

    /**
     * 有参构造初始化有效编码行数、目前没有解决的Bug数属性
     */
    public DevelopmentJob(int codingLineNum, int unsolvedBugNum) {
        this.setCodingLineNum(codingLineNum);
        this.setUnsolvedBugNum(unsolvedBugNum);
    }

    /**
     * 有参构造初始化全部属性,调用父类相关赋值方法
     *
     * @param jobName        开发工作类工作名称
     * @param codingLineNum  有效编码行数
     * @param unsolvedBugNum 目前没有解决的Bug数
     */
    public DevelopmentJob(String jobName, int codingLineNum, int unsolvedBugNum) {
        super(jobName);
        this.setCodingLineNum(codingLineNum);
        this.setUnsolvedBugNum(unsolvedBugNum);
    }

    public int getCodingLineNum() {
        return codingLineNum;
    }

    public void setCodingLineNum(int codingLineNum) {
        this.codingLineNum = codingLineNum;
    }

    public int getUnsolvedBugNum() {
        return unsolvedBugNum;
    }

    public void setUnsolvedBugNum(int unsolvedBugNum) {
        this.unsolvedBugNum = unsolvedBugNum;
    }

    /**
     * 重写描述工作的方法。
     */
    @Override
    public void showJob() {
        System.out.printf(" %s 的日报是：今天编写了 %d 行代码，目前仍然有 %s 个 bug 没有解决。\n", this.getJobName(), this.getCodingLineNum(), this.getUnsolvedBugNum());
    }
}
```

</CodeGroupItem>
<CodeGroupItem title="JobTest.java">

```java
package pub.zxj.java2020.week03.inheritancedemo.practice.test;

import pub.zxj.java2020.week03.inheritancedemo.practice.model.DevelopmentJob;
import pub.zxj.java2020.week03.inheritancedemo.practice.model.Job;
import pub.zxj.java2020.week03.inheritancedemo.practice.model.TestJob;

/**
 * 工作类 Job 的测试方法
 *
 * @author Jaime
 */
public class JobTest {
    public static void main(String[] args) {
        Job job = new Job("父类");
        System.out.print(job.getJobName() + "信息测试: ");
        job.showJob();

        TestJob tj = new TestJob("测试工作类", 10, 5);
        System.out.print(tj.getJobName() + "信息测试:");
        tj.showJob();

        DevelopmentJob dj = new DevelopmentJob("研发工作类", 1000, 10);
        System.out.print(dj.getJobName() + "信息测试:");
        dj.showJob();
    }
}
```

</CodeGroupItem>
</CodeGroup>

### 访问控制修饰符

#### 访问控制权限

Java 中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。

- **default** (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

- **private** : 在同一类内可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**

- **public** : 对所有类可见。使用对象：类、接口、变量、方法

- **protected** : 对同一包内的类和所有子类可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**。

我们可以通过以下表来说明访问权限：

| 修饰符      | 当前类 | 同一包内 | 子孙类(同一包) | 子孙类(不同包) | 其他包 |
| ----------- | ------ | -------- | -------------- | -------------- | ------ |
| `public`    | ✔      | ✔        | ✔              | ✔              | ✔      |
| `protected` | ✔      | ✔        | ✔              | ✔/✖            | ✖      |
| `default`   | ✔      | ✔        | ✔              | ✖              | ✖      |
| `private`   | ✔      | ✖        | ✖              | ✖              | ✖      |

::: tip 访问修饰符

- **default**：默认访问修饰符声明的变量和方法，对同一个包内的类是可见的。接口里的变量都隐式声明为 public static final,而接口里的方法默认情况下访问权限为 public。

- **private**：私有访问修饰符是最严格的访问级别，所以被声明为  **private**  的方法、变量和构造方法只能被所属类访问，并且类和接口不能声明为  **private**。

  声明为私有访问类型的变量只能通过类中公共的 getter 方法被外部类访问。

  Private 访问修饰符的使用主要用来隐藏类的实现细节和保护类的数据。

- **public**：公有访问修饰符。被声明为 public 的类、方法、构造方法和接口能够被任何其他类访问。

  如果几个相互访问的 public 类分布在不同的包中，则需要导入相应 public 类所在的包。由于类的继承性，类所有的公有方法和变量都能被其子类继承。

- **protected**：受保护的访问修饰符。protected 需要从以下两个点来分析说明：

  - **子类与基类在同一包中**：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；

  - **子类与基类不在同一包中**：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的 protected 方法。

  protected 可以修饰数据成员，构造方法，方法成员，**不能修饰类（内部类除外）**。

  接口及接口的成员变量和成员方法不能声明为 protected。

::: right

[Java 修饰符 - 菜鸟教程](https://www.runoob.com/java/java-modifier-types.html)

:::

#### 访问控制和继承

::: tip 方法继承的规则

- 父类中声明为 public 的方法在子类中也必须为 public。

- 父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。

- 父类中声明为 private 的方法，不能够被继承。

:::

### super 关键字

通过 super 关键字来实现对父类成员的访问，用来引用当前对象的父类。

#### 子类访问父类成员

- 访问父类成员方法 `super.print();`
- 访问父类属性 `super.name;`
- 访问父类构造方法 `super();`

::: tip super

- 子类的构造的过程中必须调用其父类的构造方法;
- 如果子类的构造方法中没有显示调用父类的构造方法，则系统系默认调用父类无参的构造方法;
- 如果子类构造方法中既没有显式调用父类的构造方法，而父类又没有无参的构造方法，则编译出错;
- 使用 super 调用父类指定构造方法，必须在子类的构造方法的第一行;
  :::

#### 继承后的实例初始化顺序

1. 父类静态成员
2. 子类静态成员
3. 父类对象构造（属性赋值、构造代码块、构造方法）
4. 子类对象构造（属性赋值、构造代码块、构造方法）

#### super PK this

- this 关键字：指向自己(当前类对象)的引用。

  - 访问当前类的成员方法；
  - 访问当前类的成员属性；
  - 访问当前类的构造方法；
  - 不能在静态方法中使用；

- super 关键字：我们可以通过 super 关键字来实现对父类对象成员的访问，用来引用当前对象的父类。

  - 访问父类的成员方法；
  - 访问父类的成员属性；
  - 访问父类的构造方法；
  - 不能再静态方法中使用；

- 构造方法调用时，super 和 this 不能同时出现。（super 和 this 都是必须在构造方法的第一行）

#### 关于 super 的常见问题

1. 子类构造默认调用父类无参构造方法，那么如果父类中没有无参的枃造方法只有有参的枃造方法，一定会编译报错吗？编译报错是否就代表无法正常运行？

   答案是: 此时一定会编译报错，但不一定会无法正常运行，需要看具体编码情况。

   下面我们结合示例来看一下。譬如设定自定义类: Paternal、Modern 为继承关系，且满足父类中只有带参构造方法。定义 Test 类为测试类，完成 Modern 对象构建。

   Ps: 此处由于展示篇幅有限，暂不考虑属性的访问权限。

   - 子类中没有任何构造方法，通过 super 调用父类指定带参构造。

     <CodeGroup>
     <CodeGroupItem title="Paternal.java" active>

     ```java
     package pub.zxj.java2020.week03.inheritancedemo.supertest.model;

     /**
      * 父辈类 Paternal
      *
      * @author Jaime
      */
     public class Paternal {
         /**
          * 血型blood、肤色complexion
          */
         String blood;
         String complexion;

         /**
          * 全参构造初始化。
          *
          * @param blood      血型
          * @param complexion 肤色
          */
         public Paternal(String blood, String complexion) {
             this.blood = blood;
             this.complexion = complexion;
         }
     }
     ```

     </CodeGroupItem>
     <CodeGroupItem title="Modern.java">

     ```java
     /**
     * 当代人类 Modern 继承于父辈类 Paternal
     *
     * @author Jaime
     */
     public class Modern extends Paternal {
        /**
         * 国籍nationality、
         */
        String nationality;

        // Error: 'Paternal' 中没有可用的默认构造函数。
        public Modern() {
        }

        // Error: 'Paternal' 中没有可用的默认构造函数。
        public Modern(String blood, String complexion, String nationality) {
            //super(blood, complexion);
            this.nationality = nationality;
            System.out.println("hahahaha~");
        }
     }
     ```

     </CodeGroupItem>
     <CodeGroupItem title="Test.java" active>

     ```java
     package pub.zxj.java2020.week03.inheritancedemo.supertest.test;

     import pub.zxj.java2020.week03.inheritancedemo.supertest.model.Modern;

     /**
      * @author Jaime
      */
     public class Test {
         public static void main(String[] args) {
             Modern two = new Modern("O型血", "黄皮肤", "中国");
         }
     }
     ```

     </CodeGroupItem>
     </CodeGroup>

     运行结果，产生异常，原因为：父类没有无参构造，因此必须调用其他构造方法，否则无法完成指定对象。

     由此可见，当父类中只有带参构造，子类中没有任何构造方法中通过 super 调用父类指定带参构造的时候，一定会编译报错，同时也会产生运行异常。

   - 子类中部分构造方法通过 super 调用了父类指定的带参构造：修改子类带参构造，使用 super 调用父类对应构造，无参构造不动。

     <CodeGroup>
     <CodeGroupItem title="Paternal.java" active>

     ```java
     package pub.zxj.java2020.week03.inheritancedemo.supertest.model;

     /**
      * 父辈类 Paternal
      *
      * @author Jaime
      */
     public class Paternal {
         /**
          * 血型blood、肤色complexion
          */
         String blood;
         String complexion;

         /**
          * 全参构造初始化。
          *
          * @param blood      血型
          * @param complexion 肤色
          */
         public Paternal(String blood, String complexion) {
             this.blood = blood;
             this.complexion = complexion;
         }
     }
     ```

     </CodeGroupItem>
     <CodeGroupItem title="Modern.java">

     ```java
     /**
     * 当代人类 Modern 继承于父辈类 Paternal
     *
     * @author Jaime
     */
     public class Modern extends Paternal {
        /**
         * 国籍nationality、
         */
        String nationality;

        // Error: 'Paternal' 中没有可用的默认构造函数。
        public Modern() {
        }

        public Modern(String blood, String complexion, String nationality) {
            super(blood, complexion);
            this.nationality = nationality;
            System.out.println("hahahaha~");
        }
     }
     ```

     </CodeGroupItem>
     <CodeGroupItem title="Test.java" active>

     ```java
     package pub.zxj.java2020.week03.inheritancedemo.supertest.test;

     import pub.zxj.java2020.week03.inheritancedemo.supertest.model.Modern;

     /**
      * @author Jaime
      */
     public class Test {
         public static void main(String[] args) {
             Modern two = new Modern("O型血", "黄皮肤", "中国");
         }
     }
     ```

     </CodeGroupItem>
     </CodeGroup>

     错误原因仍为：父类没有无参构造，因此必须调用其他构造方法，否则无法完成指定对象。

     由此可见，当父类中只有带参构造，子类中只有部分构造方法中通过 super 调用父类指定带参构造的时候，仍然会编译报错。但此时，如在测试类中，调用的是已经处理过的子类构造则不会产生运行时异常(Ps: 处理指应用 super 调用过指定父类构造)

     简单来说，可以理解为，编译出错只是提醒代码有漏洞，但是运行时如果不执行漏洞代码，则不彯响正常的运行结果。、

2. 如果子类通过 super 来调用父类的带参构造，那么是不是父类当中就可以不需要定义无参构造了？

   如果只是考虑当前功能实现，的确可以不在父类中定义无参构造方法了；但是如果考虑到后续功能扩展，还是建议大家在父类中保留无参构造的编码。

3. 请问如果子类构造方法调用了 this()，那么还会默认调用父类的 super() 吗？

   答案是：肯定会。

   因为，当子类的带参构造方法调用 this()，意思是，调用了同类中的无参构造方法。

   而在子类的无参构造方法中如果没有通过 super 设定，则默认会调用其父类的无参构造方法，也就是编译器会自动在子类无参构造方法中添加 super()。

   下面我们结合示例来看一下: 假如设定自定义类: Paternal、 Modern 为继承关系，且满足父类中只有带参构造方法。定义 Test 类为测试类，完成 Modern 对象构建。 （Ps:此处由于展示篇幅有跟，暂不考虑属性的访问权跟）

   <CodeGroup>
   <CodeGroupItem title="Paternal.java" active>

   ```java
   package pub.zxj.java2020.week03.inheritancedemo.supertest.model;

   /**
    * 父辈类 Paternal
    *
    * @author Jaime
    */
   public class Paternal {

       public Paternal() {
           System.out.println("我是父类的无参构造~");
       }
   }
   ```

   </CodeGroupItem>
   <CodeGroupItem title="Modern.java">

   ```java
   package pub.zxj.java2020.week03.inheritancedemo.supertest.model;

   /**
    * 当代人类 Modern 继承于父辈类 Paternal
    *
    * @author Jaime
    */
   public class Modern extends Paternal {
       /**
        * 国籍nationality、
        */
       String nationality;

       public Modern（）{
       }

       public Modern(String nationality) {
           this();
           this.nationality =
   nationality;
       }
   }
   ```

   </CodeGroupItem>
   <CodeGroupItem title="Test.java">

   ```java
   package pub.zxj.java2020.week03.inheritancedemo.supertest.test;

   import pub.zxj.java2020.week03.inheritancedemo.supertest.model.Modern;

   /**
    * @author Jaime
    */
   public class Test {
       public static void main(String[] args) {
           Modern two = new Modern("中国");
       }
   }
   ```

   </CodeGroupItem>
   </CodeGroup>

   运行结果

   ```java
   我是父类的无参构造~
   ```

#### 编程练习

编程练习:某公司要开发"XX 车行管理系统"，请使用面向对象的思想，设计自定义类描述自行车、电动车和三轮车。

程序参考运行效果图如下：

```java
父类信息测试：这是一辆 红 颜色的，天宇 牌的非机动车，有 4 个轮子，有 2 个座椅的非机动车。
自行车类信息测试：这是一辆 黄 颜色的，捷安特 牌的自行车。
电动车类信息测试：这是一辆使用 飞鸽 牌电池的电动车。
三轮车类信息测试：三轮车是一款有 3 个轮子的非机动车。
```

<CodeGroup>
<CodeGroupItem title="NonVehicle.java" active>

```java
package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class NonVehicle {
    /**
     * 品牌brand、颜色color、轮子wheel、座椅seat
     */
    private String brand;
    private String color;
    private int wheel = 2;
    private int seat = 1;

    /**
     * 无参构造方法
     */
    public NonVehicle() {
    }

    /**
     * 双参构造方法，实现对对品牌、颜色属性的初始化 赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     */
    public NonVehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    /**
     * 四参构造方法，实现对品牌、颜色、车轮、座椅属性进行初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     * @param wheel 车轮
     * @param seat  座椅
     */
    public NonVehicle(String brand, String color, int wheel, int seat) {
        this.setBrand(brand);
        this.setColor(color);
        this.setWheel(wheel);
        this.setSeat(seat);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    /**
     * 运行的方法。
     */
    public void showInfo() {
        System.out.printf("这是一辆 %s 颜色的，%s 牌的非机动车，有 %d 个轮子，有 %d 个座椅的非机动车。\n", this.getColor(), this.getBrand(), this.getWheel(), this.getSeat());
    }
}

```

</CodeGroupItem>
<CodeGroupItem title="Bicycle.java">

```java
package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 自行车类 Bicycle 继承于非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class Bicycle extends NonVehicle {
    /**
     * 无参构造方法
     */
    public Bicycle() {
    }

    /**
     * 双参构造方法，实现对自行车品牌、颜色属性的初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     */
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    /**
     * 四参构造方法，实现对自行车品牌、颜色、车轮、座椅属性进行初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     * @param wheel 车轮
     * @param seat  座椅
     */
    public Bicycle(String brand, String color, int wheel, int seat) {
        super(brand, color, wheel, seat);
    }

    /**
     * 重写运行的方法。
     */
    @Override
    public void showInfo() {
        System.out.printf("这是一辆 %s 颜色的，%s 牌的自行车。\n", this.getColor(), this.getBrand());
    }
}

```

</CodeGroupItem>
<CodeGroupItem title="ElectricVehicle.java">

```java
package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 电动车类 ElectricVehicle 继承于非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class ElectricVehicle extends NonVehicle {
    /**
     * 电池品牌batteryBrand
     */
    private String batteryBrand;

    /**
     * 单参构造方法，实现对对电动车电池品牌属性的初始化赋值操作
     */
    public ElectricVehicle(String batteryBrand) {
        this.setBatteryBrand(batteryBrand);
    }

    /**
     * 双参构造方法，实现对对电动车品牌、颜色、电池品牌属性的初始化赋值操作。
     *
     * @param brand        品牌
     * @param color        颜色
     * @param batteryBrand 电池品牌
     */
    public ElectricVehicle(String brand, String color, String batteryBrand) {
        super(brand, color);
        this.setBatteryBrand(batteryBrand);
    }

    /**
     * 四参构造方法，实现对电动车品牌、颜色、车轮、座椅、电池品牌属性进行初始化赋值操作。
     *
     * @param brand 品牌
     * @param color 颜色
     * @param wheel 车轮
     * @param seat  座椅
     */
    public ElectricVehicle(String brand, String color, int wheel, int seat, String batteryBrand) {
        super(brand, color, wheel, seat);
        this.setBatteryBrand(batteryBrand);
    }

    public String getBatteryBrand() {
        return batteryBrand;
    }

    public void setBatteryBrand(String batteryBrand) {
        this.batteryBrand = batteryBrand;
    }

    /**
     * 重写运行的方法。
     */
    @Override
    public void showInfo() {
        System.out.printf("这是一辆使用 %s 牌电池的电动车。\n", this.getBatteryBrand());
    }
}

```

</CodeGroupItem>
<CodeGroupItem title="Tricycle.java">

```java
package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model;

/**
 * 三轮车类 Tricycle 继承于非机动车类 NonVehicle
 *
 * @author Jaime
 */
public class Tricycle extends NonVehicle {

    /**
     * 无参构造方法
     */
    public Tricycle() {
        this.setWheel(3);
    }

    /**
     * 重写运行的方法。
     */
    @Override
    public void showInfo() {
        System.out.printf("三轮车是一款有 %d 个轮子的非机动车。\n", this.getWheel());
    }
}

```

</CodeGroupItem>
<CodeGroupItem title="Test.java">

```java
package pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.test;

import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.Bicycle;
import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.ElectricVehicle;
import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.NonVehicle;
import pub.zxj.java2020.week03.inheritancedemo.vehiclemanagementsystem.model.Tricycle;

/**
 * @author Jaime
 */
public class Test {
    public static void main(String[] args) {
        NonVehicle nonVehicle = new NonVehicle("天宇", "红", 4, 2);
        System.out.print("父类信息测试：");
        nonVehicle.showInfo();

        Bicycle bicycle = new Bicycle("捷安特", "黄");
        System.out.print("自行车类信息测试：");
        bicycle.showInfo();

        ElectricVehicle electricVehicle = new ElectricVehicle("飞鸽");
        System.out.print("电动车类信息测试：");
        electricVehicle.showInfo();

        Tricycle tricycle = new Tricycle();
        System.out.print("三轮车类信息测试：");
        tricycle.showInfo();
    }
}

```

</CodeGroupItem>
</CodeGroup>