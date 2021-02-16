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
