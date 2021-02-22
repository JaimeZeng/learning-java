package pub.zxj.java2020.week01;

/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections020308DataType {
    public static void main(String[] args) {
        byte byteNumber = 10;
        System.out.println("- byteNumber = " + byteNumber);
        short shortNumber = 123;
        System.out.println("- shortNumber = " + shortNumber);
        int intNumber = 15698;
        System.out.println("- intNumber = " + intNumber);
        long longNumber = 0Xa2cdf3ffL;
        System.out.println("- longNumber = " + longNumber);
        float floatNumber = 12.2f;
        System.out.println("- floatNumber = " + floatNumber);
        double doubleNumber = (double) floatNumber;
        System.out.println("- doubleNumber = " + doubleNumber);
        boolean isOk = true;
        System.out.println("- isOk = " + isOk);
        char maleSex = '男';
        char femaleSex = '女';
        System.out.println("- femaleSex = " + femaleSex);
        int maleSexNumber = (int) maleSex;
        System.out.println("- maleSexNumber = " + maleSexNumber);
        int femaleSexNumber = (int) femaleSex;
        System.out.println("- femaleSexNumber = " + femaleSexNumber);
    }
}
