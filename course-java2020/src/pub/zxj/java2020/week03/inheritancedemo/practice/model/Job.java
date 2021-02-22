package pub.zxj.java2020.week03.inheritancedemo.practice.model;

/**
 * 工作类
 *
 * @author Jaime
 */
public class Job {
    /**
     * 工作名称 jobName
     */
    private String jobName;

    /**
     * 无参构造初始化
     */
    public Job() {
    }

    /**
     * 有参构造初始化全部属性
     *
     * @param jobName 工作名称
     */
    public Job(String jobName) {
        this.setJobName(jobName);
    }

    /**
     * get 获取工作名称属性。
     *
     * @return 工作名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * set 设置工作名称
     *
     * @param jobName 工作名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 描述工作的方法。
     */
    public void showJob() {
        System.out.println("开心工作！");
    }
}
