package pub.zxj.java2020.week03.officemanagementsystem.model;

/**
 * 职务类 Post
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Post {
    /**
     * 职务编号postId、职务名称postName
     */
    private String postId;
    private String postName;

    /**
     * 无参构造初始化
     */
    public Post() {
    }

    /**
     * 有参构造初始化全部属性
     *
     * @param postId   职务编号
     * @param postName 职务名称
     */
    public Post(String postId, String postName) {
        this.setPostId(postId);
        this.setPostName(postName);
        // this.postId = postId;
        // this.postName = postName;
    }

    /**
     * get 获取职务编号
     *
     * @return 职务编号
     */
    public String getPostId() {
        return postId;
    }

    /**
     * set 设置职务编号
     *
     * @param postId 职务编号
     */
    public void setPostId(String postId) {
        this.postId = postId;
    }

    /**
     * get 获取职务名称
     *
     * @return 职务名称
     */
    public String getPostName() {
        return postName;
    }

    /**
     * set 设置职务名称
     *
     * @param postName 职务名称
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }
}
