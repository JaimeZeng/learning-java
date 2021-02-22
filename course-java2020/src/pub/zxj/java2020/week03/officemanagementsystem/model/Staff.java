package pub.zxj.java2020.week03.officemanagementsystem.model;

/**
 * 员工类 Staff
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Staff {
    /**
     * 员工姓名staffName、工号staffId、年龄staffAge、性别staffSex、所属部门staffDepartment、职务信息staffPost
     */
    private String staffName;
    private String staffId;
    private int staffAge;
    private String staffSex;
    private Department staffDepartment;
    private Post staffPost;

    /**
     * 无参构造初始化
     */
    public Staff() {
    }

    /**
     * 有参构造初始化全部属性
     *
     * @param staffName       员工姓名
     * @param staffId         员工工号
     * @param staffAge        员工年龄
     * @param staffSex        员工性别
     * @param staffDepartment 员工所属部门
     * @param staffPost       员工职务
     */
    public Staff(String staffName, String staffId, int staffAge, String staffSex, Department staffDepartment, Post staffPost) {
        this.setStaffName(staffName);
        this.setStaffId(staffId);
        this.setStaffAge(staffAge);
        this.setStaffSex(staffSex);
        this.setStaffDepartment(staffDepartment);
        this.setStaffPost(staffPost);
        // this.staffName = staffName;
        // this.staffId = staffId;
        // this.staffAge = staffAge;
        // this.staffSex = staffSex;
        // this.staffDepartment = staffDepartment;
        // this.staffPost = staffPost;
    }

    /**
     * get 获取员工姓名
     *
     * @return 员工姓名
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * set 设置员工姓名
     *
     * @param staffName 员工姓名
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * get 获取员工工号
     *
     * @return 员工工号
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * set 设置员工工号
     *
     * @param staffId 员工工号
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    /**
     * get 获取员工年龄
     *
     * @return 员工年龄
     */
    public int getStaffAge() {
        return staffAge;
    }

    /**
     * set 设置员工年龄
     *
     * @param staffAge 员工年龄
     */
    public void setStaffAge(int staffAge) {
        this.staffAge = ((staffAge < 18) || (staffAge > 65)) ? 18 : staffAge;
    }

    /**
     * get 获取员工性别
     *
     * @return 员工性别
     */
    public String getStaffSex() {
        return staffSex;
    }

    /**
     * set 设置员工性别
     *
     * @param staffSex 员工性别
     */
    public void setStaffSex(String staffSex) {
        this.staffSex = (("男".equals(staffSex)) || ("女".equals(staffSex))) ? staffSex : "男";
    }

    /**
     * get 获取员工所属部门，如果员工部门未初始化就先初始化员工部门。
     *
     * @return 员工所属部门
     */
    public Department getStaffDepartment() {
        if (staffDepartment == null) {
            this.staffDepartment = new Department();
        }
        return staffDepartment;
    }

    /**
     * 设置员工所属部门
     *
     * @param staffDepartment 员工所属部门
     */
    public void setStaffDepartment(Department staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    /**
     * get 获取员工职务信息，如果员工职务未初始化就先初始化员工职务。
     *
     * @return 员工职务信息
     */
    public Post getStaffPost() {
        if (staffPost == null) {
            this.staffPost = new Post();
        }
        return staffPost;
    }

    /**
     * set 设置员工职务
     *
     * @param staffPost 员工职务信息
     */
    public void setStaffPost(Post staffPost) {
        this.staffPost = staffPost;
    }

    /**
     * 实现员工自我介绍信息，将员工信息作为字符串返回。
     *
     * @return 员工信息(姓名 、 工号 、 性别 、 年龄 、 职务)
     */
    public String showStaffInfo() {
        return "姓名: " + this.getStaffName()
                + "\n工号: " + this.getStaffId()
                + "\n性别: " + this.getStaffSex()
                + "\n年龄: " + this.getStaffAge()
                + "\n职务: " + this.getStaffDepartment().getdepartmentName() + this.staffPost.getPostName()
                + "\n============================";
    }
}
