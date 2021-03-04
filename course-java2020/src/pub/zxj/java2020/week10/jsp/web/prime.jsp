<%--
  Created by IntelliJ IDEA.
  User: Jaime
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.List, java.util.ArrayList, java.io.IOException" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>prime 质数</title>
</head>
<body>
<%!

    /**
     * @param out Jsp 页面默认内建对象 out(javax.servlet.jsp.JspWriter out)
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    void costTime(JspWriter out, long startTime, long endTime) throws IOException {
        out.println("Time cost " + (endTime - startTime) + "ms.<br/><hr/><br/>");
    }

    /**
     * @param out Jsp 页面默认内建对象 out(javax.servlet.jsp.JspWriter out)
     * @param listPrime 质数 List 集合
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    void printPrime(JspWriter out, int num, List<Integer> listPrime) throws IOException {
        out.println("0 ~ " + num + " prime: {");
        for (Integer prime : listPrime) {
            out.println(prime + " ");
        }
        out.println("}<br/>");
    }

    /**
     * 双重 for 循环，使除数与被除数个个计算，效率极低
     * @param out Jsp 页面默认内建对象 out(javax.servlet.jsp.JspWriter out)
     * @param num 质数范围
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    void prime1(JspWriter out, int num) throws IOException {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                primeList.add(i);
            }
        }

        printPrime(out, num, primeList);
        costTime(out, startTime, System.currentTimeMillis());

    }

    /**
     * 双重 for 循环吗，考虑 2 ~ i/2 之间的数 ，效率比第一种提高一半
     * @param out Jsp 页面默认内建对象 out(javax.servlet.jsp.JspWriter out)
     * @param num 质数范围
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    void prime2(JspWriter out, int num) throws IOException {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                primeList.add(i);
            }
        }

        printPrime(out, num, primeList);
        costTime(out, startTime, System.currentTimeMillis());
    }

    /**
     * 双重 for 循环吗，使用开方去过滤 Math.sqrt(i)
     * @param out Jsp 页面默认内建对象 out(javax.servlet.jsp.JspWriter out)
     * @param num 质数范围
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    void prime3(JspWriter out, int num) throws IOException {
        long startTime = System.currentTimeMillis();
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                primeList.add(i);
            }
        }

        printPrime(out, num, primeList);
        costTime(out, startTime, System.currentTimeMillis());
    }


    /**
     * 埃氏筛法，把 [2, Math.sqrt(n)] 内的所有质数的倍数剔除，剩下的就是质数
     * @param out Jsp 页面默认内建对象 out(javax.servlet.jsp.JspWriter out)
     * @param num 质数范围
     * @throws IOException Signals that an I/O exception of some sort has occurred.
     */
    void prime4(JspWriter out, int num) throws IOException {
        long startTime = System.currentTimeMillis();
        // numArray 数组存放 1 - num 是否为质数的标记（0 为质数，1 为合数），下标为 0 - （num - 1）
        int[] numArray = new int[num];
        // 1 不是质数
        numArray[0] = 1;
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            for (int j = i * i; j <= num; j += i) {
                numArray[j - 1] = 1;
            }
        }

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == 0) {
                primeList.add(i + 1);
            }
        }

        printPrime(out, num, primeList);
        costTime(out, startTime, System.currentTimeMillis());
    }
%>
<%
    prime1(out, 10000);
    prime2(out, 10000);
    prime3(out, 10000);
    prime4(out, 10000);
%>
</body>
</html>
