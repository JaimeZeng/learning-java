package pub.zxj.java2020.week03.inheritancedemo.practice.test;

import pub.zxj.java2020.week03.inheritancedemo.practice.model.DevelopmentJob;
import pub.zxj.java2020.week03.inheritancedemo.practice.model.Job;
import pub.zxj.java2020.week03.inheritancedemo.practice.model.TestJob;

/**
 * 工作类 Job 的测试方法
 *
 * @author Jaime
 */
public class JobTest {
    public static void main(String[] args) {
        Job job = new Job("父类");
        System.out.print(job.getJobName() + "信息测试: ");
        job.showJob();

        TestJob tj = new TestJob("测试工作类", 10, 5);
        System.out.print(tj.getJobName() + "信息测试:");
        tj.showJob();

        DevelopmentJob dj = new DevelopmentJob("研发工作类", 1000, 10);
        System.out.print(dj.getJobName() + "信息测试:");
        dj.showJob();
    }
}
