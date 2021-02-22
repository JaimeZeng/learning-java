package pub.zxj.java2020.week03.inheritancedemo.practice.model;

/**
 * 研发工作类
 *
 * @author Jaime
 */
public class DevelopmentJob extends Job {
    /**
     * 有效编码行数codingLineNum、目前没有解决的Bug数unsolvedBugNum
     */
    private int codingLineNum;
    private int unsolvedBugNum;

    /**
     * 有参构造初始化有效编码行数、目前没有解决的Bug数属性
     */
    public DevelopmentJob(int codingLineNum, int unsolvedBugNum) {
        this.setCodingLineNum(codingLineNum);
        this.setUnsolvedBugNum(unsolvedBugNum);
    }

    /**
     * 有参构造初始化全部属性,调用父类相关赋值方法
     *
     * @param jobName        开发工作类工作名称
     * @param codingLineNum  有效编码行数
     * @param unsolvedBugNum 目前没有解决的Bug数
     */
    public DevelopmentJob(String jobName, int codingLineNum, int unsolvedBugNum) {
        super(jobName);
        this.setCodingLineNum(codingLineNum);
        this.setUnsolvedBugNum(unsolvedBugNum);
    }

    public int getCodingLineNum() {
        return codingLineNum;
    }

    public void setCodingLineNum(int codingLineNum) {
        this.codingLineNum = codingLineNum;
    }

    public int getUnsolvedBugNum() {
        return unsolvedBugNum;
    }

    public void setUnsolvedBugNum(int unsolvedBugNum) {
        this.unsolvedBugNum = unsolvedBugNum;
    }

    /**
     * 重写描述工作的方法。
     */
    @Override
    public void showJob() {
        System.out.printf(" %s 的日报是：今天编写了 %d 行代码，目前仍然有 %s 个 bug 没有解决。\n", this.getJobName(), this.getCodingLineNum(), this.getUnsolvedBugNum());
    }
}
