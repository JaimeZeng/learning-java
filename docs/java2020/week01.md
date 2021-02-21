---
title: 第1周 环境搭建与语法入门
url: week01
---

# 环境搭建与语法入门

## 标识符

常见标识符：类名。

标识符命名规则：

- 标识符可以由字母、数字、下划线(\_)和美元符(\$)组成，不能以数字开头
- 标识符严格区分大小写
- 标识符不能是 Java 关键字和保留字
- 标识符的命名最好能反映出其作用

## 关键字和保留字

### 关键字

Java 中的关键字是对编译器有特殊意义的词。

| abstract  | boolean   | break        | byte    | case     | catch   |
| --------- | --------- | ------------ | ------- | -------- | ------- |
| char      | class     | continue     | default | do       | double  |
| else      | extends   | false        | final   | finally  | float   |
| for       | if        | implements   | import  | native   | int     |
| interface | long      | instanceof   | new     | null     | package |
| private   | protected | public       | return  | short    | static  |
| super     | switch    | synchronized | this    | throw    | throws  |
| transient | true      | try          | void    | volatile | while   |

### 保留字

保留字是 Java 预留的关键字。虽然现在还没有作为关键字，但是以后的升级版本中会成为关键字。

保留字包括：goto、const。

## 变量

变量的三个元素：变量类型、变量名和变量值。

变量名的命名规则：

- 满足标识符命名规则

- 符合驼峰法命名规范（第一个单词首字母小写，之后的大写。如：isOk，floatNumber）
- 尽量简单，做到见名知意
- 变量名的长度没有限制

> 类的命名规则：
>
> - 满足 Pascal 命名法规范（每个单词首字母大写。如：HelloWorld，DataTypeDemo）

## 数据类型

|        | 数据类型 | 说明         | 位  | 字节 | 最小范围       | 最大范围      |
| ------ | -------- | ------------ | --- | ---- | -------------- | ------------- |
| 整型   | byte     | 字节型       | 8   | 1    | -2^7           | 2^7-1         |
|        | short    | 短整型       | 16  | 2    | -2^15          | 2^15-1        |
|        | int      | 整型         | 32  | 4    | -2^31          | 2^31-1        |
|        | long     | 长整型       | 64  | 8    | -2^63          | 2^63-1        |
| 浮点型 | float    | 单精度浮点型 | 32  | 4    | -3.40 x 10^38  | 3.40 x 10^38  |
|        | double   | 双精度浮点型 | 64  | 8    | -1.79 x 10^308 | 1.79 x 10^308 |
| 字符型 | char     | 字符型       | 16  | 2    |                |               |
| 布尔型 | boolean  | 布尔型       | 8   | 1    |                |               |

```java
int octal=037;    //定义 int 类型变量存放八进制数据
long longNumber=0Xa2cdf3ffL;    //定义变量存放十六进制 long 长整型数据
short shortNumber=123;    //定义变量存放 short 短整型数据
byte b=10;    //定义变量存放 byte 类型数据
float floatNumber=12.1f;    //定义变量存放 float 类型数据
double floatNumber=12.13;    //定义变量存放 double 类型数据
char sex='男';    //定义变量存放 sex 类型数据
boolean isOk=true;    //定义变量存放 boolean 类型数据
```
