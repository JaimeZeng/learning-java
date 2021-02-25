---
title: CSS 入门
url: week08-css
---

## CSS 入门

### CSS 简介

CSS: **C**ascading(层叠) **S**tyle(样式) **S**heets(列表)。

::: tip CSS

Cascading Style Sheets (CSS) is a style sheet language used for describing the presentation of a document written in a markup language such as HTML. CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.

::: right

[CSS - Wikipedia](https://en.wikipedia.org/wiki/CSS)

:::

::: tip 层叠样式表

层叠样式表 (Cascading Style Sheets，缩写为 CSS），是一种 样式表 语言，用来描述 HTML 或 XML（包括如 SVG、MathML、XHTML 之类的 XML 分支语言）文档的呈现。CSS 描述了在屏幕、纸质、音频等其它媒体上的元素应该如何被渲染的问题。

::: right

[CSS（层叠样式表） | MDN](https://developer.mozilla.org/zh-CN/docs/Web/CSS)

:::

### CSS 的作用

- 结构与样式分离的方式,便于后期维护与改版;
- 可以用多套样式,使网页有任意样式切换的效果;
- 使页面载入得更快、降低服务器的成本;

课程目标

- CSS 在 HTML 页面设计的必要作用
- CSS 语法格式、选择器及分类
- 使用 CSS 设置字体、文本、背景、链接等
- 使用 CSS 列表，显示隐藏的方法、各种伪类用法

### CSS 语法格式

CSS 由多组"规则"组成。每个规则由"选择器"（selector）、"属性"（property）和"值"（value）组成：

- 选择器（**Selector**）：多个选择器可以半角逗号（,）隔开。
- 属性（ **property）**是一个标识符，用可读的名称来表示其特性。
- 值（**value）**则描述了浏览器引擎如何处理该特性。每个属性都包含一个有效值的集合，它有正式的语法和语义定义，被浏览器引擎实现。 

在 CSS 中，无论是属性名还是属性值都是对大小写不敏感的。属性与值之间以英文冒号 ':' （U+003A COLON）隔开。属性与值前面、后面与两者之间的空白不是必需的，会被自动忽略。属性和值合称为"特性"。多个特性间用";"隔开，最后用"{ }"括起来。

```css
/* 样式的选择器 p */
p {
  /* 属性background-color 分隔符: 属性值red */
  background-color: red;
  /* 属性font-size 分隔符: 属性值20px */
  font-size: 20px;
}
```

### CSS 创建

#### 插入样式表

插入样式表的方法有三种:

- 外部样式表(External style sheet)：外部式，当样式需要应用于很多页面时，外部样式表将是理想的选择。在使用外部样式表的情况下，你可以通过改变一个文件来改变整个站点的外观。每个页面使用 `<link>` 标签链接到样式表。 `<link>` 标签在（文档的）头部。浏览器会从文件 mystyle.css 中读到样式声明，并根据它来格式文档。
- 内部样式表(Internal style sheet)：嵌入式，当单个文档需要特殊的样式时，就应该使用内部样式表。你可以使用 `<style>` 标签在文档头部定义内部样式表。
- 内联样式(Inline style)：内联式，由于要将表现和内容混杂在一起，内联样式会损失掉样式表的许多优势。请慎用这种方法，例如当样式仅需要在一个元素上应用一次时。要使用内联样式，你需要在相关的标签内使用样式（style）属性。Style 属性可以包含任何 CSS 属性。

<CodeGroup>
<CodeGroupItem title="index.html" active>

```html{7-8,10-16,20-21}
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>Hello World</title>

    <!-- 外部样式表 -->
    <link rel="stylesheet" type="text/css" href="style.css" />

    <!-- 内部样式表 -->
    <style type="text/css">
      p {
        background-color: red;
        font-size: 20px;
      }
    </style>
  </head>

  <body>
    <!-- 内联样式 -->
    <p style="background-color: red; font-size: 20px;">Hello World</p>
  </body>
</html>
```

</CodeGroupItem>
<CodeGroupItem title="style.css">

```css
p {
  background-color: red;
  font-size: 20px;
}
```

</CodeGroupItem>
</CodeGroup>

#### 三种链接方式的优先级

**一般情况下** 三种样式优先级：就近原则（离被设置元素越近优先级别越高）。

1. 三种样式顺序：外部样式表 - 内部样式表 - 内部样式。

   `内部样式(内联式) > 内部样式表(嵌入式)> 外部样式表(外部式)`。

   <CodeGroup>
   <CodeGroupItem title="index.html" active>

   ```html
   <!DOCTYPE html>
   <html lang="en">
     <head>
       <meta charset="UTF-8" />
       <meta http-equiv="X-UA-Compatible" content="IE=edge" />
       <meta name="viewport" content="width=device-width, initial-scale=1.0" />
       <title>CSS 中三种引入方式优先级</title>
       <!-- 外部样式表 -->
       <link rel="stylesheet" href="style.css" />
       <!-- 内部样式表 -->
       <style type="text/css">
         span {
           color: yellow;
           text-align: right;
         }
       </style>
     </head>

     <body>
       <!-- 内联样式 -->
       <p>
         <span style="color: blue; text-align: center">慕课网（IMOOC）</span
         >是IT技能学习平台。慕课网(IMOOC)课程涉及JAVA、前端、Python、大数据等60类主流技术语言，覆盖了面试就业、职业成长、自我提升等需求场景，帮助用户实现从技能提升到岗位提升的能力闭环。
       </p>
     </body>
   </html>
   ```

   </CodeGroupItem>
   <CodeGroupItem title="style.css">

   ```css
   span {
     color: red;
     text-align: left;
   }
   ```

   </CodeGroupItem>
   </CodeGroup>

   文本颜色为蓝色（内联样式）。

2. 两种种样式顺序：外部样式表 - 内部样式表。

   `内部样式表(嵌入式)> 外部样式表(外部式)`。

   <CodeGroup>
   <CodeGroupItem title="index.html" active>

   ```html
   <!DOCTYPE html>
   <html lang="en">
     <head>
       <meta charset="UTF-8" />
       <meta http-equiv="X-UA-Compatible" content="IE=edge" />
       <meta name="viewport" content="width=device-width, initial-scale=1.0" />
       <title>CSS 中三种引入方式优先级</title>
       <!-- 外部样式表 -->
       <link rel="stylesheet" href="style.css" />
       <!-- 内部样式表 -->
       <style type="text/css">
         span {
           color: yellow;
           text-align: right;
         }
       </style>
     </head>

     <body>
       <p>
         <span>慕课网（IMOOC）</span
         >是IT技能学习平台。慕课网(IMOOC)课程涉及JAVA、前端、Python、大数据等60类主流技术语言，覆盖了面试就业、职业成长、自我提升等需求场景，帮助用户实现从技能提升到岗位提升的能力闭环。
       </p>
     </body>
   </html>
   ```

   </CodeGroupItem>
   <CodeGroupItem title="style.css">

   ```css
   span {
     color: red;
     text-align: left;
   }
   ```

   </CodeGroupItem>
   </CodeGroup>

   文本颜色为黄色（内部样式表）。

3. 两种种样式顺序：内部样式表 - 外部样式表。

   `外部样式表(外部式) > 内部样式表(嵌入式)` 。

   <CodeGroup>
   <CodeGroupItem title="index.html" active>

   ```html
   <!DOCTYPE html>
   <html lang="en">
     <head>
       <meta charset="UTF-8" />
       <meta http-equiv="X-UA-Compatible" content="IE=edge" />
       <meta name="viewport" content="width=device-width, initial-scale=1.0" />
       <title>CSS 中三种引入方式优先级</title>
       <!-- 内部样式表 -->
       <style type="text/css">
         span {
           color: yellow;
           text-align: right;
         }
       </style>
       <!-- 外部样式表 -->
       <link rel="stylesheet" href="style.css" />
     </head>

     <body>
       <p>
         <span>慕课网（IMOOC）</span
         >是IT技能学习平台。慕课网(IMOOC)课程涉及JAVA、前端、Python、大数据等60类主流技术语言，覆盖了面试就业、职业成长、自我提升等需求场景，帮助用户实现从技能提升到岗位提升的能力闭环。
       </p>
     </body>
   </html>
   ```

   </CodeGroupItem>
   <CodeGroupItem title="style.css">

   ```css
   span {
     color: red;
     text-align: left;
   }
   ```

   </CodeGroupItem>
   </CodeGroup>

   文本颜色为红色（外部样式表）。

### CSS背景

CSS 背景属性用于定义HTML元素的背景。

| 属性                  | 描述                                                         |
| :-------------------- | :----------------------------------------------------------- |
| background            | 简写属性，用于一次性集中定义各种背景属性，包括 color, image, origin 与 size, repeat 方式等等。 |
| background-attachment | 属性决定背景图像的位置是在视口内固定，或者随着包含它的区块滚动。 |
| background-clip       | 属性设置元素的背景（背景图片或颜色）是否延伸到边框、内边距盒子、内容盒子下面。 |
| background-origin     | 属性规定了指定背景图片background-image 属性的原点位置的背景相对区域.<br/>注意：当使用 background-attachment 为fixed时，该属性将被忽略不起作用。 |
| background-color      | 属性设置元素的背景色, 属性的值为颜色值或关键字"transparent"二者选其一. |
| background-image      | 属性用于为一个元素设置一个或者多个背景图像。                 |
| background-position   | 属性为每一个背景图片设置初始位置。 这个位置是相对于由 `background-origin` 定义的位置图层的。 |
| background-repeat     | 属性定义背景图像的重复方式。背景图像可以沿着水平轴，垂直轴，两个轴重复，或者根本不重复。 |
| background-size       | 属性设置背景图片大小。图片可以保有其原有的尺寸，或者拉伸到新的尺寸，或者在保持其原有比例的同时缩放到元素的可用空间的尺寸。 |

#### background-attachment

**`background-attachment`** CSS 属性决定背景图像的位置是在视口内固定，或者随着包含它的区块滚动。

**取值：**

- `fixed` 此关键属性值表示背景相对于视口固定。即使一个元素拥有滚动机制，背景也不会随着元素的内容滚动。
- `local` 此关键属性值表示背景相对于元素的内容固定。如果一个元素拥有滚动机制，背景将会随着元素的内容滚动， 并且背景的绘制区域和定位区域是相对于可滚动的区域而不是包含他们的边框。
- `scroll` 此关键属性值表示背景相对于元素本身固定， 而不是随着它的内容滚动（对元素边框是有效的）。



#### background-clip

`background-clip` 设置元素的背景（背景图片或颜色）是否延伸到边框、内边距盒子、内容盒子下面。

如果没有设置背景图片（`background-image`）或背景颜色（`background-color`），那么这个属性只有在边框（ `border`）被设置为非固实（soild）、透明或半透明时才能看到视觉效果（与 `border-style` 或 `border-image` 有关），否则，本属性产生的样式变化会被边框覆盖。

取值：

- `border-box` 背景延伸至边框外沿（但是在边框下层）。
- `padding-box` 背景延伸至内边距（padding）外沿。不会绘制到边框处。
- `content-box` 背景被裁剪至内容区（content box）外沿。
- `text ` 背景被裁剪成文字的前景色。





#### background-origin

 `background-origin` 规定了指定背景图片`background-image` 属性的原点位置的背景相对区域.

注意：当使用 `background-attachment` 为fixed时，该属性将被忽略不起作用。

::: tip background-origin

假如`background`简写中没有设置该值，那么在 background 简写值后指定background-origin，那么后面的值就会覆盖简写值，其实说白了，就是后出现的值会覆盖前面的值。

:::

**取值：**

- `border-box` 背景图片的摆放以border区域为参考
- `padding-box` 背景图片的摆放以padding区域为参考
- `content-box` 背景图片的摆放以content区域为参考



#### background-color

` background-color` 会设置元素的背景色, 属性的值为颜色值或关键字"transparent"二者选其一.

**取值：**

`<color>`
一个描述背景统一颜色的 CSS `<color>` 值。即使一个或几个的 `background-image` 被定义，如果图像是不透明的，通过透明度该颜色也能影响到渲染。在 CSS 中，`transparent` 是一种颜色。



#### background-image

 **`background-image`** 属性用于为一个元素设置一个或者多个背景图像。

**取值：**

- `none` 是一个表示无背景图的关键字。
- `<image>` `<image>` 用来标记将要显示的图片. 支持多背景设置，背景之间以逗号隔开.





#### background-position

**`background-position`** 为每一个背景图片设置初始位置。 这个位置是相对于由 `background-origin` 定义的位置图层的。

**取值：**

- 关键字 `center`，用来居中背景图片。
- 关键字 `top`, `left`, `bottom`, `right` 中的一个。用来指定把这个项目*（原文为 item）放在哪*一个边缘。另一个维度被设置成 50%，所以这个项目（原文为 item）被放在指定边缘的中间位置。
- `<length>`  或  `<percentage>`。指定相对于左边缘的 x 坐标，y 坐标被设置成 50%。

- 如果一个值是 `top` 或 `bottom`，那么另一个值不应该是 `top` 或 `bottom`。
- 如果一个值是 `left` 或  `right`，那么另一个值不应该是 `left` 或 `right` 。

- +50px（将图片的左边界对齐容器的中线）
- 0px（图片的左边界与容器左边界重合）
- -100px（将图片相对容器左移100px，这意味着图片中部的100px内容将出现在容器中）
- -200px（将图片相对容器左移200px，这意味着图片右部分的100px内容将出现在容器中）
- -250px（将图片相对容器左移250px，这意味着图片的右边界对齐容器的中线）

  另外需要注意，如果背景图片的大小和容器一样，那设置百分比的值将永远无效，因为“容器和图片的差”为0（图片永远填满容器，并且图片的相对位置和容器的相对位置永远重合）。在这种情况下，需要为偏移使用绝对值（例如px）。

---

- `<position>`

    一个 `<position>` 定义一组 x/y 坐标（相对于一个元素盒子模型的边缘），来放置这个项目（原文为 item）。它可以被定义为一个值或者两个值。如果被定义为两个值，那么第一个值代表水平位置，第二个代表垂直垂直位置。如果只指定一个值，那么第二个值默认为 `center`。

  **两个值的语法:** 一个定义 x 坐标，另一个定义 y 坐标。每个值可以是：

  关键字 top, left, bottom, right 中的一个。 如果这里给出 left 或 right，那么这个值定义 x 轴位置，另一个值定义 y 轴位置。如果这里给出 top 或  bottom，那么这个值定义 y 轴位置，另一个值定义 x 轴位置。
  `<length>` 或 `<percentage>`。如果另一个值是  left 或  right，那么这个值（指 `<length>` 或 `<percentage>`）定义相对于上边缘的 y 轴位置。 如果两个值都是 `<length>` 或 `<percentage>`，那么第一个值定义 x 轴位置，第二个定义 y 轴位置。

  **注意：也就是说，top top 和 left left 是无效的。**

- 至于百分比：

   百分比值的偏移指定图片的相对位置和容器的相对位置重合。值0%代表图片的左边界（或上边界）和容器的左边界（上边界）重合。值100%代表图片的右边界（或下边界）和容器的右边界（或下边界）重合。值50%则代表图片的中点和容器的中点重合。  

  当指定百分比值的时候，实际上执行了以下的计算公式（该公式可以用数学方式定义图片和容器相对位置重合）：

  `(container width - image width) * (position x%) = (x offset value)`

  `(container height - image height) * (position y%) = (y offset value)`  

  

  使用X坐标来举个例子，假设有一个300px宽的图片，将这个图片使用到一个100px宽的容器中，并且将background-size设置成自动： 

   `100px - 300px = -200px (容器和图片的宽度差)`  

  当对background-position设置值依次为-25%，0%，50%，100%，125%，得到图片相对容器的偏移值为： 

  `-200px * -25% = 50`

  `px-200px * 0% = 0px`

  `-200px * 50% = -100px`

  `-200px * 100% = -200px`

  `-200px * 125% = -250px`





#### background-repeat

**`background-repeat`** CSS 属性定义背景图像的重复方式。背景图像可以沿着水平轴，垂直轴，两个轴重复，或者根本不重复。

默认情况下，重复的图像被剪裁为元素的大小，但它们可以缩放 (使用 `round`) 或者均匀地分布 (使用 `space`).

**取值：**

`<repeat-style>` 单值语法是完整的双值语法的简写:

| **单值**    | **等价于双值**        |
| ----------- | --------------------- |
| `repeat-x`  | `repeat no-repeat`    |
| `repeat-y`  | `no-repeat repeat`    |
| `repeat`    | `repeat repeat`       |
| `space`     | `space space`         |
| `round`     | `round round`         |
| `no-repeat` | `no-repeat no-repeat` |

在双值语法中, 第一个值表示水平重复行为, 第二个值表示垂直重复行为. 下面是关于每一个值是怎么工作的具体说明:

| `repeat`    | 图像会按需重复来覆盖整个背景图片所在的区域. 最后一个图像会被裁剪, 如果它的大小不合适的话. |
| ----------- | ------------------------------------------------------------ |
| `space`     | 图像会尽可能得重复, 但是不会裁剪. 第一个和最后一个图像会被固定在元素(element)的相应的边上, 同时空白会均匀地分布在图像之间. `background-position`属性会被忽视, 除非只有一个图像能被无裁剪地显示. 只在一种情况下裁剪会发生, 那就是图像太大了以至于没有足够的空间来完整显示一个图像. |
| `round`     | 随着允许的空间在尺寸上的增长, 被重复的图像将会伸展(没有空隙), 直到有足够的空间来添加一个图像. 当下一个图像被添加后, 所有的当前的图像会被压缩来腾出空间. 例如, 一个图像原始大小是260px, 重复三次之后, 可能会被伸展到300px, 直到另一个图像被加进来. 这样他们就可能被压缩到225px.译者注: 关键是浏览器怎么计算什么时候应该添加一个图像进来, 而不是继续伸展. |
| `no-repeat` | 图像不会被重复(因为背景图像所在的区域将可能没有完全被覆盖). 那个没有被重复的背景图像的位置是由`background-position`属性来决定. |



#### background-size

`background-size` 设置背景图片大小。图片可以保有其原有的尺寸，或者拉伸到新的尺寸，或者在保持其原有比例的同时缩放到元素的可用空间的尺寸。

注意：没有被背景图片覆盖的背景区域仍然会显示用`background-color`属性设置的背景颜色。此外，如果背景图片设置了透明或者半透明属性，衬在背景图片后面的背景色也会显示出来。

**取值：**

- `<length>` `<length>` 值，指定背景图片大小，不能为负值。
- `<percentage>` `<percentage>` 值，指定背景图片相对背景区（background positioning area）的百分比。背景区由`background-origin`设置，默认为盒模型的内容区与内边距，也可设置为只有内容区，或者还包括边框。如果`attachment` 为`fixed`，背景区为浏览器可视区（即视口），不包括滚动条。不能为负值。
- `auto` 以背景图片的比例缩放背景图片。
- `cover` 缩放背景图片以完全覆盖背景区，可能背景图片部分看不见。和 `contain` 值相反，`cover` 值尽可能大的缩放背景图像并保持图像的宽高比例（图像不会被压扁）。该背景图以它的全部宽或者高覆盖所在容器。当容器和背景图大小不同时，背景图的 左/右 或者 上/下 部分会被裁剪。
- `contain` 缩放背景图片以完全装入背景区，可能背景区部分空白。`contain` 尽可能的缩放背景并保持图像的宽高比例（图像不会被压缩）。该背景图会填充所在的容器。当背景图和容器的大小的不同时，容器的空白区域（上/下或者左/右）会显示由 background-color 设置的背景颜色。

位图一定有固有尺寸与固有比例，矢量图可能两者都有，也可能只有一个。渐变视为只有固有尺寸或者只有固有比例的图片。

---

背景图片大小计算：

- 如果指定了 `background-size` 的两个值并且不是`auto`：背景图片按指定大小渲染。
- `contain` 或 `cover`: 保留固有比例，最大的包含或覆盖背景区。如果图像没有固有比例，则按背景区大小。
- `auto` 或 `auto auto`: 图像如果有两个长度，则按这个尺寸。如果没有固有尺寸与固有比例，则按背景区的大小。如果没有固有尺寸但是有固有比例， 效果同 `contain`。如果有一个长度与比例，则由此长度与比例计算大小。如果有一个长度但是没有比例，则使用此长度与背景区相应的长度。
- 一个为 `auto` 另一个不是auto: 如果图像有固有比例，则指定的长度使用指定值，未指定的长度由指定值与固有比例计算。如果图像没有固有比例，则指定的长度使用指定值，未指定的长度使用图像相应的固有长度，若没有固有长度，则使用背景区相应的长度。









### CSS 选择器

每一条 css 样式声明（定义）由两部分组成，形式如下：

```css
选择器{
    样式;
}
```

在`{}`之前的部分就是"选择器"，"选择器"指明了`{}`中的"样式"的作用对象，也就是"样式"作用于网页中的哪些元素。

#### 元素/标签选择器

标签选择器，也称元素选择器。其实就是 html 代码中的标签。如 `<html>、<body>、<h1>、<p>、<img>`。例如下面代码：

```css
p {
  font-size: 12px;
  line-height: 1.6em;
}
```

上面的 css 样式代码的作用：为 p 标签设置 12px 字号，行间距设置 1.6em 的样式。

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>CSS 元素选择器</title>
    <style type="text/css">
      html {
        color: red;
      }

      h1 {
        color: saddlebrown;
        text-align: center;
      }

      span {
        color: deepskyblue;
        text-align: right;
      }
    </style>
  </head>

  <body>
    <h1>CSS 选择器</h1>
    <p>
      <span>慕课网（IMOOC）</span
      >是IT技能学习平台。慕课网(IMOOC)课程涉及JAVA、前端、Python、大数据等60类主流技术语言，覆盖了面试就业、职业成长、自我提升等需求场景，帮助用户实现从技能提升到岗位提升的能力闭环。
    </p>
  </body>
</html>
```

#### 类 Class 选择器

**语法：**

```css
.类选择器名称{
    css样式代码;
}
```

**注意：**

1. **英文圆点 . 开头**
2. 其中**类选择器名称** 可以任意起名（但不要起中文噢）

**使用方法：**

第一步：使用合适的标签把要修饰的内容标记起来，如下：

```html
<span> 胆小如鼠 </span>
```

第二步：使用 class="类选择器名称"为标签设置一个类，如下：

```html
<span class="stress"> 胆小如鼠 </span>
```

第三步：设置类选器 css 样式，如下：

```css
.stress {
  color: red;
} /*类前面要加入一个英文圆点*/
```

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CSS 类选择器</title>
    <style type="text/css">
      .favorites-tips {
        color: chocolate;
        font-size: 12px;
      }

      .desc {
        color: darkcyan;
        font-size: 18px;
      }
    </style>
  </head>
  <body>
    <h1>CSS 类选择器</h1>
    <div class="favorites-tips">
      <span class="imv2-star-revert"></span>
      使用<b> Ctrl+D </b>可将网站添加到书签
    </div>
    <br />
    <div class="desc">
      2020版本课程全新升级，从0基础到高薪就业，不需脱产学习，冲击互联网高薪岗位<br />无论你是未就业的学生还是想转行的在职人员，不需要基础，只要你有梦想，想高薪！
    </div>
  </body>
</html>
```

#### ID 选择器

**语法：**

```css
.id选择器名称{
    css样式代码;
}
```

**注意：**

1. **井号 # 开头**
2. 其中 id 属性的值既为当前标签的 id，尽量见名思意，语义化。

**使用方法：**

第一步：使用合适的标签把要修饰的内容标记起来，如下：

```html
<div>我是一个 div</div>
```

第二步：使用 id="ID 选择器名称"为标签设置一个 ID，如下：

```html
<div id="box">我是一个 div</div>
```

第三步：设置 ID 选器 css 样式，如下：

```css
#box {
  color: red;
}
```

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CSS Id选择器</title>
    <style type="text/css">
      h1 {
        text-align: center;
      }

      #footer {
        color: chocolate;
        font-size: 18px;
      }

      #imv2-star-revert {
        color: blueviolet;
        font-size: 12px;
      }
    </style>
  </head>
  <body>
    <h1>CSS Id 选择器</h1>
    <div id="footer">
      <p id="imv2-star-revert">使用<b> Ctrl+D </b>可将网站添加到书签</p>
      <p>Copyright &copy; 2021 imooc.com All Rights Reserved</p>
    </div>
  </body>
</html>
```

**类和 ID 选择器的区别**

**相同点：** 可以应用于任何元素
**不同点：**

1. **ID 选择器只能在文档中使用一次**。与类选择器不同，在一个 HTML 文档中，ID 选择器只能使用一次，而且仅一次。而类选择器可以使用多次。

   下面代码是正确的：

   ```html
   <p>
     三年级时，我还是一个<span class="stress">胆小如鼠</span
     >的小女孩，上课从来不敢回答老师提出的问题，生怕回答错了老师会批评我。就一直没有这个<span
       class="stress"
       >勇气</span
     >来回答老师提出的问题。
   </p>
   ```

   而下面代码是错误的：

   ```html
   <p>
     三年级时，我还是一个<span id="stress">胆小如鼠</span
     >的小女孩，上课从来不敢回答老师提出的问题，生怕回答错了老师会批评我。就一直没有这个<span
       id="stress"
       >勇气</span
     >来回答老师提出的问题。
   </p>
   ```

2. **可以使用类选择器词列表方法为一个元素同时设置多个样式**。 我们可以为一个元素同时设多个样式，但只可以用类选择器的方法实现，ID 选择器是不可以的（**不能使用 ID 词列表）**。

   下面的代码是**正确**的。

   ```html
   .stress{ color:red; } .bigsize{ font-size:25px; }
   <p>
     到了<span class="stress bigsize">三年级</span
     >下学期时，我们班上了一节公开课...
   </p>
   ```

   上面代码的作用是为"三年级"三个文字设置文本颜色为红色并且字号为 25px。

   下面的代码是**不正确** 的。

   ```html
   #stressid{ color:red; } #bigsizeid{ font-size:25px; }
   <p>
     到了<span id="stressid bigsizeid">三年级</span
     >下学期时，我们班上了一节公开课...
   </p>
   ```

   上面代码不可以实现为"三年级"三个文字设置文本颜色为红色并且字号为 25px 的作用。

#### 子选择器

选择器**子选择器**，即大于符号(>)，用于选择指定标签元素的**第一代子元素**。

```css
.food > li {
  border: 1px solid red;
}
```

这行代码会使 class 名为 food 下的子元素 li（水果、蔬菜）加入红色实线边框。

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CSS 子选择器</title>
    <style type="text/css">
      html {
        width: 266px;
      }

      .food > li {
        border: 1px solid red;
      }
    </style>
  </head>
  <body>
    <h1>CSS 子选择器</h1>
    <ul class="food">
      <li>
        水果
        <ul>
          <li>香蕉</li>
          <li>苹果</li>
          <li>梨</li>
        </ul>
      </li>
      <li>
        蔬菜
        <ul>
          <li>白菜</li>
          <li>油菜</li>
          <li>蒜台</li>
        </ul>
      </li>
    </ul>
  </body>
</html>
```

#### 包含选择器

**包含选择器**，也称后代选择器。即加入空格,用于选择指定标签元素下的**后辈元素。**

```css
.food li {
  border: 1px solid red;
}
```

这行代码会使 class 名为 food 下的所有元素 li 都加入红色实线边框。

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CSS 后代选择器</title>
    <style type="text/css">
      html {
        width: auto;
      }
      h1 {
        text-align: center;
      }
      .food li {
        border: 1px solid red;
      }
    </style>
  </head>
  <body>
    <h1>CSS 后代/包含选择器</h1>
    <ul class="food">
      <li>
        水果
        <ul>
          <li>苹果</li>
          <li>香蕉</li>
          <li>梨</li>
        </ul>
      </li>
      <li>
        蔬菜
        <ul>
          <li>白菜</li>
          <li>油菜</li>
          <li>蒜台</li>
        </ul>
      </li>
    </ul>
  </body>
</html>
```

**包含选择器与子选择器的区别**

子选择器（child selector）仅是指它的直接后代，或者你可以理解为作用于子元素的第一代后代。而包含/后代选择器是作用于所有子后代元素。后代选择器通过空格来进行选择，而子选择器是通过">"进行选择。

总结：**>** 作用于元素的第一代后代，**空格** 作用于元素的所有后代。

#### 通用选择器

通用选择器是功能最强大的选择器，它使用一个（\*）号指定，它的作用是匹配 html 中所有标签元素，如下使用下面代码使用 html 中任意标签元素字体颜色全部设置为红色：

```css
* {
  color: red;
}
```

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CSS 通用选择器</title>
    <style type="text/css">
      * {
        color: chocolate;
        font-size: 18px;
      }
    </style>
  </head>
  <body>
    <h1>CSS 通用选择器</h1>
    <div class="favorites-tips">使用<b> Ctrl+D </b>可将网站添加到书签</div>
    <div id="footer">
      <p id="imv2-star-revert">使用<b> Ctrl+D </b>可将网站添加到书签</p>
      <p>Copyright &copy; 2021 imooc.com All Rights Reserved</p>
    </div>
  </body>
</html>
```

#### 伪类选择器

更有趣的是伪类选择符，为什么叫做伪类选择符，它允许给 html 不存在的标签（标签的某种状态）设置样式，比如说我们给 html 中一个标签元素的鼠标滑过的状态来设置字体颜色：

```css
a:hover {
  color: red;
}
```

上面一行代码就是为 a 标签鼠标滑过的状态设置字体颜色变红。这样就会使第一段文字内容中的"胆小如鼠"文字加入 **鼠标滑过** 字体颜色变为红色特效。

**关于伪选择符：**

关于伪类选择符，到目前为止，可以兼容所有浏览器的"伪类选择符"就是 a 标签上使用 :hover 了（其实伪类选择符还有很多，尤其是 css3 中，但是因为不能兼容所有浏览器，本教程只是讲了这一种最常用的）。其实 :hover 可以放在任意的标签上，比如说 p:hover，但是它们的兼容性也是很不好的，所以现在比较常用的还是 a:hover 的组合。

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CSS 伪类选择器</title>
    <style type="text/css">
      a:link {
        color: chocolate;
      }
      a:visited {
        color: red;
      }
      a:hover {
        color: darkcyan;
      }
      a:active {
        color: darkgreen;
      }
    </style>
  </head>
  <body>
    <h1>CSS 伪类选择器</h1>
    <p>
      <a href="https://www.baidu.com" target="_blank"><b>百度一下</b></a>
    </p>
  </body>
</html>
```

#### 分组选择器

当你想为 html 中多个标签元素设置同一个样式时，可以使用分组选择符（，），如下代码为右侧代码编辑器中的 h1、span 标签同时设置字体颜色为红色：

```css
h1,
span {
  color: red;
}
```

它相当于下面两行代码：

```css
h1 {
  color: red;
}
span {
  color: red;
}
```

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>分组选择器</title>
    <style type="text/css">
      h1,
      h2,
      h3,
      h4,
      h5,
      h6 {
        color: chocolate;
        background: aliceblue;
        border: 1px solid black;
        font-family: "Fira Code Medium", monospace;
      }
    </style>
  </head>
  <body>
    <h1>CSS 分组选择器</h1>
    <br />
    <h1>This is heading 1</h1>
    <h2>This is heading 2</h2>
    <h3>This is heading 3</h3>
    <h4>This is heading 4</h4>
    <h5>This is heading 5</h5>
    <h6>This is heading 6</h6>
  </body>
</html>
```

#### 相邻兄弟选择器

如果需要选择紧接在另一个元素后的元素，而且二者有相同的父元素，可以使用相邻兄弟选择器（Adjacent sibling selector）。

相邻兄弟选择器使用了加号（+），即相邻兄弟结合符（Adjacent sibling combinator）。

**注释：** 与子结合符一样，相邻兄弟结合符旁边可以有空白符。

例如，如果要增加紧接在 h1 元素后出现的段落的上边距，可以这样写：

```
h1 + p {margin-top:50px;}
```

这个选择器读作："选择紧接在 h1 元素后出现的段落，h1 和 p 元素拥有共同的父元素"。

注意：**用一个结合符只能选择两个相邻兄弟中的第二个元素。**

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <title>CSS 相邻兄弟选择器</title>
    <style type="text/css">
      h1 + p {
        margin-top: 20px;
        border: 1px solid red;
      }

      p + p {
        font-family: "Fira Code Medium", monospace;
        font-weight: bold;
        color: chocolate;
      }
    </style>
  </head>
  <body>
    <div>
      <h1>CSS 相邻兄弟选择器</h1>
      <p>
        2020版本课程全新升级，从0基础到高薪就业，不需脱产学习，冲击互联网高薪岗位
      </p>
      <h2>Imooc Java</h2>
      <p>
        无论你是未就业的学生还是想转行的在职人员，不需要基础，只要你有梦想，想高薪！
      </p>
      <p>使用<b> Ctrl+D </b>可将网站添加到书签</p>
      <p>Copyright &copy; 2021 imooc.com All Rights Reserved</p>
    </div>
  </body>
</html>
```

#### 选择器优先级

下面列表中，选择器类型的优先级是递增的：

1. 类型选择器（例如，`h1`）和伪元素（例如，`::before`）
2. 类选择器 (例如，`.example`)，属性选择器（例如，`[type="radio"]`）和伪类（例如，`:hover`）
3. ID 选择器（例如，`#example`）。

**通配选择符**（universal selector）（`*`）**关系选择符**（combinators）（`+`, `>`, `~`, '` `', `||`）和 **否定伪类**（negation pseudo-class）（`:not()`）对优先级没有影响。（但是，在 `:not()` 内部声明的选择器会影响优先级）。

给元素添加的**内联样式** (例如，`style="font-weight:bold"`) 总会覆盖外部样式表的任何样式 ，因此可看作是具有最高的优先级。