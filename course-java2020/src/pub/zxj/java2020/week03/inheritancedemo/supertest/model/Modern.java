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

    // Error: 'Paternal' 中没有可用的默认构造函数。
    public Modern() {
    }

    /**
     * 全参构造初始化
     *
     * @param blood       血型
     * @param complexion  肤色
     * @param nationality 国籍
     */
    // Error: 'Paternal' 中没有可用的默认构造函数。
    public Modern(String blood, String complexion, String nationality) {
        super(blood, complexion);
        this.nationality = nationality;
        System.out.println("hahahaha~");
    }
}