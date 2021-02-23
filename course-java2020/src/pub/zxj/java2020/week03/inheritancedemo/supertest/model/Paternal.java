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