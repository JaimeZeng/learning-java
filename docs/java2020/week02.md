---
title: 第2周 Java 语法之循环、数组与方法
url: week02
---

# Java 语法之循环、数组与方法

## 一维数组

数组是相同类型的数据按顺序组成的一种引用数据类型

### 数组声明

- `数据类型[] 数组名; `
- `数据类型 数组名[];`

```java
int[] intArray;
int intAray[];
```

### 数组的创建

#### 先声明后创建

```java
数据类型[] 数组名;
数组名 = new 数据类型[数组长度];

int[] intArray;
intArray = new int[10]; // 创建长度为 10 的整型数组 intArray
```

### 声明的同时创建数组

**注意：数组长度必须指定。**

```java
数据类型[] 数组名 = new 数据类型[数组长度];

int[] arr = new int[10]; // 创建长度为 10 的整型数组 arr
```

### 数组的初始化

声明数组的同时给数组赋值，叫做数组的初始化。

例：`int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};`

数组的长度就是初始化时所给数组元素的个数。

### 数组元素的引用

`数组名[下标];`

注意：下标从 0 开始。

| 1    | 2    | 3    | 4    | 5    | 6    | 7    | 8     | 9    | 10   |
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ----- | ---- | ---- |
| a[0] | a[1] | a[2] | a[3] | a[4] | a[5] | a[6] | a[ 7] | a[8] | a[9] |

### 数组长度

- `int[] a = {1,2,3,4,5,6,7,8,9,10};`
- 属性 length 表示数组的长度，如 `a. length`

### 遍历数组元素

```java
int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

for (int i = 0; i < intArray.length; i++) {
System.out.print(intArray[i] + " ");
}
System.out.println();
```

### 增强型 for 循环

也称为 foreach 循环。

```java
int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

for (int j : intArray) {
System.out.print(j + " ");
}
```

[course-java2020/src/com/imooc/java2020/week02/Sections02ArrayDemo.java](course-java2020/src/pub/imooc/java2020/week02/Sections02ArrayDemo.java)

### 冒泡排序

```java
int[] intArray = {34, 53, 56, 17, 89, 2, 23, 66, 88};
// 增强型循环遍历数组
// System.out.print("排序前数组元素为：");
System.out.print("第 0 次排序后数组元素为：");
for (int intNumber : intArray) {
    System.out.print(intNumber + " ");
}
System.out.println();

int temp = 0;
for (int i = 0; i < intArray.length; i++) {
    for (int j = 0; j < intArray.length - i - 1; j++) {
        if (intArray[j] > intArray[j + 1]) {
            temp = intArray[j];
            intArray[j] = intArray[j + 1];
            intArray[j + 1] = temp;
        }
    }
    System.out.print("第 " + (i + 1) + " 次排序后数组元素为：");
    for (int intNumber : intArray) {
        System.out.print(intNumber + " ");
    }
    System.out.println();
}
```

[course-java2020/src/com/imooc/java2020/week02/Sections02BubbleSort.java](course-java2020/src/pub/imooc/java2020/week02/Sections02BubbleSort.java)

### 数组练习

[course-java2020/src/com/imooc/java2020/week02/Sections02ArrayPractice.java](course-java2020/src/pub/imooc/java2020/week02/Sections02ArrayPractice.java)

## 二维数组

二维数组也是存放相同数据类型的数据，可以看成是由多个一维数组组成。二维数组可以包含行和
列，和表格很相似。而每一行就是一个一维数组。

### 二维数组的声明

二维数组的声明有三种形式，格式如下：

- `数据类型[][] 数组名;`
- `数据类型 数组名[][];`
- `数据类型[] 数组名[];`

```java
// 声明 int 类型的二维数组
int[][] intArray;

//声明 float 类型的二维数组
float floatArray[][];

//声明 double 类型的二维数组
double[] doubleArray[];
```

### 二维数组的创建

`数组名 数据类型 = new [行][列];`

```java
// 创建一个三行三列的 int 类型的数组
// 先声明后创建
int[][] intArray;
intArray = new int[3][3];
```

### 声明的数组的同时进行创建

```java
数据类型[][] 数组名 = new [行][列];

// or
数据类型[][] 数组名 = new [行][];
数组名[行] = new 数据类型[列];
```

```java
// 创建三行三列的二维数组
int[][] intArray = new int[3][3];

// 创建三行多列的二维数组
int[][] intArray = new int[3][];
int[0] = new int[3];    // 第一行有三列
int[1] = new int[2];    // 第二行有二列
int[2] = new int[1];    // 第三行有一列
```

### 数组元素的使用

与一维数组相似，行列的 index 值均从 0 开始。

如：已知一个三行三列的整型二维数组 `intArray`，它的第三行第二列元素为 `intArray[2][1]`。

### 二维数组的初始化

与一维数组类似，创建的同时为数组元素赋值，即为数组的初始化。

```java
int [][] scoreArray = {{89,92,93}, {85,90,96}, {95,93,98}};
```

### 数组的遍历

```java
int [][] scoreArray = {{89,92,93}, {85,90,96}, {95,93,98}};

for (int i = 0; i < scoreArray.length; i++) {
    for (int j = 0; j < scoreArray[i].length; j++) {
        System.out.print(scoreArray[i][j] + " ");
    }
    System.out.println();
}

for (int[] scores : scoreArray) {
    for (int score : scores) {
        System.out.print(score + " ");
    }
    System.out.println(scores.length);
}
```

[course-java2020/src/com/imooc/java2020/week02/Sections03ArrayDemo.java](course-java2020/src/pub/imooc/java2020/week02/Sections03ArrayDemo.java)

### 练习

[course-java2020/src/com/imooc/java2020/week02/Sections03ArrayPractice.java](course-java2020/src/pub/imooc/java2020/week02/Sections03ArrayPractice.java)

> 注意：
>
> - 数组是引用数据类型
> - 创建数组时,会开辟连续的内存空间
> - 数组长度使用 length 属性获取
> - 数组元素的下标从 0 开始
> - 数组下标越界问题

## 方法

所谓方法，就是用来解决一类问题的代码的有序组合，是一个功能模块。

### 方法声明

```java
访问修饰符 返回类型 方法名(参数列表){
    方法体
}
```

### 方法分类

根据方法是否带参数、是否返回值，可分为四类：

- 无参无返回值方法 `public void printStar()`
- 无参带返回值方法 `public int gatRectangleArea()`
- 带参无返回值方法 `public void getMaxNumber(double a, double b)`
- 带参带返回值方法 `public int getFactorial(int n)`

[course-java2020/src/com/imooc/java2020/week02/Sections04MethodDemo01.java](course-java2020/src/pub/imooc/java2020/week02/Sections04MethodDemo01.java)

### 数组作为方法参数

- `public void printArray(int[] arr){}`
- `public boolean search(int n,int[] arr){}`
- `public void bubbleSort(int[] intArray){}`

[course-java2020/src/com/imooc/java2020/week02/Sections04MethodDemo02.java](course-java2020/src/pub/imooc/java2020/week02/Sections04MethodDemo02.java)

### 方法重载

方法名相同，参数列表不同。

- `public int getSum(int a, int b) {}`
- `public double getSum(double a, double b) {}`
- `public int getSum(int[] intArray) {}`

```java
- public void hello(){}

- public int hello(){}
- public void hello(String s){}    //√
- public void hello(int n){}    //√
- public void hello(float f1,float f2){} //√
- public void hello1(){}
```

[course-java2020/src/com/imooc/java2020/week02/Sections04MethodDemo03.java](course-java2020/src/pub/imooc/java2020/week02/Sections04MethodDemo03.java)

### 参数的传递问题

- 普通变量参数在传递过程中，主方法的的参数值是不会改变的。
- 数组参数在传递过程中，主方法的的参数值会改变。
- 区别在于：参数在内存中是否指向同一片内存空间。

[course-java2020/src/com/imooc/java2020/week02/Sections04MethodDemo04.java](course-java2020/src/pub/imooc/java2020/week02/Sections04MethodDemo04.java)

### 可变参数列表

`public void sum(int… n) {}`

- 可变参数一定是方法中的最后一个参数。参数列表中如果有两个以上的参数，可变参数一定是在最后的。

- 数组可以传递给可变参数的方法，反之不行。可以将数组传递给可变参数列表，但是可变参数不能传递给数组参数。

- 在重载中，含有可变参数的方法是最后被选中的。

  ```java
  public void searchNumber(int number, int... n) {} //和下面的冲突
  public void searchNumber(int number, int[] intArray) {}
  ```

[course-java2020/src/com/imooc/java2020/week02/Sections04MethodDemo05.java](course-java2020/src/pub/imooc/java2020/week02/Sections04MethodDemo05.java)

## 综合案例: 数组移位与统计

需求: 定义一个类，对数组中的数据进行管理。

方法 ：

- 插入数据: `public int[] insertData(){}` (少接收一个数据，为在指定位置处插入数据做准备)
- 显示所有数据: `public void showData(int[] a, int length){}`
- 在指定位置处插入数据: `public void insertAtArray(int[] a, int n, int k){}`
- 查询能被 3 整除的数据: `public void diyThree(int[] a){}`
- 提示信息: `public void promptMessage(){}`

[course-java2020/src/com/imooc/java2020/week02/Sections05DataManage.java](course-java2020/src/pub/imooc/java2020/week02/Sections05DataManage.java)
