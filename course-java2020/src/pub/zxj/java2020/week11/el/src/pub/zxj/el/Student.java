package pub.zxj.el;

/**
 * @author Jaime
 */
public class Student {
    /**
     * 学生姓名 name、学生手机号mobile
     */
    private String name;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return name + " : " + mobile;
    }
}
