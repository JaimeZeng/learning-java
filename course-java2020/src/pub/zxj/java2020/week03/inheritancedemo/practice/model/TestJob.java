package pub.zxj.java2020.week03.inheritancedemo.practice.model;

/**
 * 测试工作类
 *
 * @author Jaime
 */
public class TestJob extends Job {

    /**
     * 测试用例个数testCaseNum、发现 Bug 数量testBugNum
     */
    private int testCaseNum;
    private int testBugNum;

    /**
     * 有参构造初始化测试用例个数、发现 Bug 数量属性
     *
     * @param testBugNum  发现 Bug 数量
     * @param testCaseNum 测试用例个数
     */
    public TestJob(int testCaseNum, int testBugNum) {
        this.setTestCaseNum(testCaseNum);
        this.setTestBugNum(testBugNum);
    }

    /**
     * 有参构造初始化全部属性,调用父类相关赋值方法
     *
     * @param jobName     测试工作类的工作名称
     * @param testBugNum  发现 Bug 数量
     * @param testCaseNum 测试用例个数
     */
    public TestJob(String jobName, int testCaseNum, int testBugNum) {
        super(jobName);
        this.setTestCaseNum(testCaseNum);
        this.setTestBugNum(testBugNum);
    }

    public int getTestCaseNum() {
        return testCaseNum;
    }

    public void setTestCaseNum(int testCaseNum) {
        this.testCaseNum = testCaseNum;
    }

    public int getTestBugNum() {
        return testBugNum;
    }

    public void setTestBugNum(int testBugNum) {
        this.testBugNum = testBugNum;
    }

    /**
     * 重写描述工作的方法。
     */
    @Override
    public void showJob() {
        System.out.printf(" %s 的日报是：今天编写了 %d 个测试用例，发现了 %s 个 bug。\n", this.getJobName(), this.getTestCaseNum(), this.getTestBugNum());
    }
}
