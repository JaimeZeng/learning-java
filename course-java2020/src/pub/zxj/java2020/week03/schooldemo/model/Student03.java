package pub.zxj.java2020.week03.schooldemo.model;

/**
 * 学生类 Student03，在学生类 Student 中，添加一个专业对象作为属性，从中获取专业名称、学制年限
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Student03 {
    /**
     * 姓名stuName、学号stuId、性别stuSex、年龄stuAge、专业学科 stuSub
     */
    private String stuName;
    private String stuId;
    private String stuSex;
    private int stuAge;
    private Subject stuSub;

    /**
     * 无参构造
     */
    public Student03() {
    }

    /**
     * 有参构造初始化
     *
     * @param stuName 学生姓名
     * @param stuId   学生学号
     * @param stuSex  学生性别
     * @param stuAge  学生年龄
     * @param stuSub  学生专业学科对象
     */
    public Student03(String stuName, String stuId, String stuSex, int stuAge, Subject stuSub) {
        // this.stuName = stuName;
        // this.stuId = stuId;
        // this.stuSex = stuSex;
        // this.stuAge = stuAge;
        // this.stuSub = stuSub;
        this.setStuName(stuName);
        this.setStuId(stuId);
        this.setStuSex(stuSex);
        this.setStuAge(stuAge);
        this.setStuSub(stuSub);
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
     * get 获取学生专业学科对象。如果专业学科对象未初始化，就先初始化然后再返回专业学科对象
     *
     * @return 专业学科对象
     */
    public Subject getStuSub() {
        if (this.stuSub == null) {
            this.stuSub = new Subject();
        }
        return stuSub;
    }

    /**
     * set 学生专业学科对象
     *
     * @param stuSub 专业学科对象
     */
    public void setStuSub(Subject stuSub) {
        this.stuSub = stuSub;
    }

    /**
     * 输出学生详细信息
     *
     * @param stu 学生类对象
     * @return 学生详细信息（学生姓名、学生学号、学生性别、学生年龄、学科名称、学制年限）
     */
    public String showStuInformation(Student03 stu) {
        return "==============================================="
                + "\n学生信息如下:"
                + "\n姓名: " + stu.getStuName()
                + "\n学号: " + stu.getStuId()
                + "\n性别: " + stu.getStuSex()
                + "\n年龄: " + stu.getStuAge()
                + "\n学科名称: " + stu.getStuSub().getSubName()
                + "\n学制年限: " + stu.getStuSub().getSubYear();
    }
}
