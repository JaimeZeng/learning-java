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

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCat.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCat.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCatTest.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCatTest.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoPerson.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoPerson.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoPersonTest.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoPersonTest.java)

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

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCat01.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCat01.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCatTest01.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCatTest01.java)

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

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCat01.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCat01.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCatTest01.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoCatTest01.java)

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

```bash
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
5. run 方法执行第二句，将赋值结果后的 month 传入输出语句，打印输出。即输出结果的第一行：小猫已经 1 月大了，跑的很欢快
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

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoMonkey.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoMonkey.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoMonkeyTest.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassDemoMonkeyTest.java)

### this 关键字应用

this 是 Java 中常用的关键字，代表当前对象本身，可以理解为: 指向当前对象的一个引用。

this 在 Java 中可用于调用成员属性、成员方法、构造方法，也可以当作参数进行方法传参以及方法返回值。

#### this 调用成员属性

示例: 分别在 run 和 eat 方法中，通过 this 访问属性 month 和 name。

```java
package com.imooc.java2020.week03;

/**
 * 自定义类，通过 this 访问成员属性
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat01 {
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
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat01 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat01Test {
    public static void main(String[] args) {
        Sections01ClassThisCat01 one = new Sections01ClassThisCat01();
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

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat01.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat01.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat01Test.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat01Test.java)

#### this 调用成员方法

在类中的 run 方法中，分别通过 this 以及不加 this 为前缀调用的方式访问同类中的 eat 方法。

```java
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat02，通过 this 调用成员方法
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat02 {
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
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat02 的测试类
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat02Test {
    public static void main(String[] args) {
        Sections01ClassThisCat02 one = new Sections01ClassThisCat02();
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

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat02.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat02.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat02Test.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat02Test.java)

#### this 调用构造方法

在类中分别定义了属性 name 和 month，无参构造方法、单参构造方法以及双参构造方法；

在测试类中，定义多个类的类型引用，并分别应用不同构造方法进行实例化。

**在带参构造中调用无参构造**

```java
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat03，
 * 在单参构造中使用 this 调用无参构造，双参构造中调用单参构造
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat03 {
    String name;
    int month;

    public Sections01ClassThisCat03() {
        System.out.println("无参构造！");
    }

    public Sections01ClassThisCat03(String name) {
        // 调用无参构造
        // 构造方法的调用必须是构造函数本体中的第一条语句!!!
        /*this.name = name;
        this(); // Error: 'this()' 调用必须是构造函数本体中的第一条语句
        System.out.println("单参构造！");*/

        this();
        this.name = name;
        System.out.println("单参构造！");
    }

    public Sections01ClassThisCat03(String name, int month) {
        this(name);
        this.month = month;
        System.out.println("双参构造！");
    }
}

```

```java
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat03 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat03Test {
    public static void main(String[] args) {
        Sections01ClassThisCat03 one, two, three;

        System.out.println("--------- 调用无参构造 ---------");
        one = new Sections01ClassThisCat03();

        System.out.println("--------- 单参构造调用无参构造 ---------");
        two = new Sections01ClassThisCat03("huahua");

        System.out.println("--------- 双参构造调用单参构造 ---------");
        three = new Sections01ClassThisCat03("huahua", 2);
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

**在普通成员方法内调用构造**

```java
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat03，
 * 在单参构造中使用 this 调用无参构造，双参构造中调用单参构造
 * 在普通成员方法内调用构造
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat03 {
    String name;
    int month;

    public Sections01ClassThisCat03() {
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

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat03.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat03.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat03Test.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat03Test.java)

#### this 方法调用时作为参数传递

在类中，定义 run 方法，方法参数为类对象。类方法中，调用 run 方法，并通过 this 指代，传入当前对象。

```java
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

```

```java
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat04 的测试类。
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat04Test {
    public static void main(String[] args) {
        Sections01ClassThisCat04 one;
        one = new Sections01ClassThisCat04("huahua");
        one.call();
    }
}

```

```java
昵称为 huahua 的小猫在奔跑！
```

**总结：**this 可以作为方法参数进行传递，代表调用方法的当前对象。

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat04.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat04.java)

[course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat04Test.java](course-java2020/src/com/imooc/java2020/week03/Sections01ClassThisCat04Test.java)

#### this 方法调用时作为返回值传递

在类中，定义 call 方法，方法中通过 this 返回类对象。

```java
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat05，在成员方法中通过 this 返回类对象。
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat05 {
    String name;

    public Sections01ClassThisCat05() {
    }

    public Sections01ClassThisCat05(String name) {
        this.name = name;
    }

    public Sections01ClassThisCat05 call(String name) {
        this.name = name;
        //通过 this 返回类对象
        return this;
    }
}

```

```java
package com.imooc.java2020.week03;

/**
 * 自定义类 Sections01ClassThisCat05 的测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections01ClassThisCat05Test {
    public static void main(String[] args) {
        Sections01ClassThisCat05 one = new Sections01ClassThisCat05();
        System.out.println(one.call("huahua"));
        System.out.println(one.call("huahua").name);
    }
}

```

```java
com.imooc.java2020.week03.Sections01ClassThisCat05@1b6d3586
huahua
```

**总结：** this 可以作为方法返回值，代表返回当前调用对象。

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

[course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationDemoCat.java](course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationDemoCat.java)

[course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationDemoCatTest.java](course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationDemoCatTest.java)

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

[course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationPracticeBook.java](course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationPracticeBook.java)

[course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationPracticeBookTest.java](course-java2020/src/com/imooc/java2020/week03/Sections02EncapsulationPracticeBookTest.java)

#### 引用数据类型的应用 -- 方法参数

Java 中的方法包含无参、有参、无返回值、带返回值多种形态。其中，方法中的参数和返回值，可以使用基本数据类型(譬如：int， float， double 等)定义，也可以使用引用数据类型(譬如：String，数组，自定义类等)定义。

如应用的是基本数据类型的变量，则传递的是数据的值；当为引用数据类型的变量时，传递的则是对象的引用。

现有宠物猫类，包含属性：昵称和年龄。

```java
package com.imooc.java2020.week03;

/**
 * 宠物猫类 Sections02EncapsulationPracticeCat
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationPracticeCat {
    /**
     * 昵称name、年龄age
     */
    private String name;
    private int age;

    /**
     * 有参构造初始化
     * @param name 昵称
     * @param age 年龄
     */
    public Sections02EncapsulationPracticeCat(String name, int age) {
        // this.name = name;
        // this.age = age;
        this.setName(name);
        this.setAge(age);
    }

    /**
     * get 获取昵称
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * set 设置昵称
     * @param name 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 获取年龄
     * @return 年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * set 设置年龄
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }
}

```

宠物猫管理类，包含年龄比较的方法 catMonthPK

```java
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
    public Sections02EncapsulationPracticeCat catMonthPK(Sections02EncapsulationPracticeCat one, Sections02EncapsulationPracticeCat two) {
        return (one.getAge() > two.getAge()) ? one : two;
    }
}

```

宠物猫测试类，包含主方法

```java
package com.imooc.java2020.week03;

/**
 * 自定义 Sections02EncapsulationPracticeCat 类的测试类：宠物猫测试类
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Sections02EncapsulationPracticeCatTest {
    public static void main(String[] args) {
        Sections02EncapsulationPracticeCat one, two;
        one = new Sections02EncapsulationPracticeCat("huahua", 3);
        two = new Sections02EncapsulationPracticeCat("fanfan", 6);
        Sections02EncapsulationPracticeCatManage manage = new Sections02EncapsulationPracticeCatManage();
        System.out.println("优胜者 name = " + manage.catMonthPK(one, two).getName() + ", age = " + manage.catMonthPK(one, two).getAge());
    }
}

```

运行结果：

```java
优胜者 name = fanfan, age = 6
```

执行流程

1. 宠物猫测试类中包含主方法，启动后，实例化产生宠物猫类类型的 one，two 两个对象，并通过构造方法完成对象初始化。

2. 完成宠物猫管理类类型实例化操作，并调用 catMonthPK 方法，实现两只宠物猫年龄的对比。

3. 在 catMonthPK 方法中，由于方法参数是自定义类型宠物 o 猫类类型，因此传入 one，two 两个对象的引用，并借由引用获取到对象的年龄，进而进行判断，将年龄大的对象作为返回值返回主方法。

4. 主方法中的局部变量 max 接收到 catMonthPK 返回的最大值的引用，并获取对应信息打印输出。

**请注意：**当方法参数是引用数据类型对象时，方法调用时，也需传入与之匹配的类型的对象。

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

#### 常用系统包

java.lang 包含 java 语言基础的类
java.util 包含 java 语言中各种工具类
java.io 包含输入、输出相关功能的类

### static

- static+属性---静态属性
- static+方法---静态方法
- static+类---不存在
- static+方法内局部变量---不存在

静态成员随类加载产生，直至类销毁才回收

### 静态方法

1. 可以直接调用同类中的静态成员
2. 不可以直接调用同类中的非静态成员
3. 可以通过实例化对象后，对象调用的方式完成非静态成员调用

### 代码块

1. 通过{}可以形成代码块
2. 方法内的代码块称为：普通代码块
3. 类内的代码块称为：构造代码块
4. 构造代码块前+static：静态代码块

### 代码块执行顺序那边

1. 无论实例产生多少对象，静态代码块只执行一次
2. 构造代码块随实例化过程调用
3. 普通代码块随方法调用执行
