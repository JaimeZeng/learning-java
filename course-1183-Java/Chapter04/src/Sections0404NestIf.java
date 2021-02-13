/**
 * @author Jaime
 * @project_name learning-java
 */
public class Sections0404NestIf {
    public static void main(String[] args) {
        int score = 94;
        char sex = '女';
        if (score > 80) {
            if (sex == '男') {
                System.out.println("进入男子组决赛");
            } else {
                System.out.println("进入女子组决赛");
            }
        }
    }
}
