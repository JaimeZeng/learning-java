package pub.zxj.java2020.week03.schooldemo.model;

/**
 * 学生类 Student02,在学生类 Student 的自我介绍方法中，添加一个专业对象作为参数，从中获取专业名称、学制年限
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Student02 {
    /**
     * 姓名stuName、学号stuId、性别stuSex、年龄stuAge
     */
    private String stuName;
    private String stuId;
    private String stuSex;
    private int stuAge;

    /**
     * 无参构造
     */
    public Student02() {
    }

    /**
     * 有参构造初始化
     *
     * @param stuName 学生姓名
     * @param stuId   学生学号
     * @param stuSex  学生性别
     * @param stuAge  学生年龄
     */
    public Student02(String stuName, String stuId, String stuSex, int stuAge) {
        // this.stuName = stuName;
        // this.stuId = stuId;
        // this.stuSex = stuSex;
        // this.stuAge = stuAge;
        this.setStuName(stuName);
        this.setStuId(stuId);
        this.setStuSex(stuSex);
        this.setStuAge(stuAge);
    }

    /**
     * get 获取学生姓名
     *
     * @return 学生姓名
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 设置学生姓名
     *
     * @param stuName 学生姓名
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * get 获取学生学号
     *
     * @return 学生学号
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * set 学生学号
     *
     * @param stuId 学生学号
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    /**
     * get 获取学生性别
     *
     * @return 学生性别
     */
    public String getStuSex() {
        return stuSex;
    }

    /**
     * set 设置学生性别
     *
     * @param stuSex 学生性别
     */
    public void setStuSex(String stuSex) {
        // this.stuSex = ((stuSex == "男") || (stuSex == "女")) ? stuSex : "男";
        this.stuSex = (("男".equals(stuSex)) || ("女".equals(stuSex))) ? stuSex : "男";
    }

    /**
     * get 获取学生年龄
     *
     * @return 学生年龄
     */
    public int getStuAge() {
        return stuAge;
    }

    /**
     * set 设置学生年龄
     *
     * @param stuAge 学生年龄
     */
    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    /**
     * 输出学生详细信息
     *
     * @param stuSub 学科类对象
     * @return 学生详细信息（学生姓名、学生学号、学生性别、学生年龄、学科名称、学制年限）
     */
    public String showStuInformation(Subject stuSub) {
        return "==================================="
                + "\n学生信息如下:"
                + "\n姓名: " + this.getStuName()
                + "\n学号: " + this.getStuId()
                + "\n性别: " + this.getStuSex()
                + "\n年龄: " + this.getStuAge()
                + "\n学科名称: " + stuSub.getSubName()
                + "\n学制年限: " + stuSub.getSubYear();
    }
}
