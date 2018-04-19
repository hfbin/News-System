package cn.hfbin.beans;

import java.util.Date;
import java.util.List;

public class Blogs {
    private Integer blogsId;

    private String blogsTitle;

    private String blogsType;

    private String blogsCopr;

    private String blogBoss;

    private Integer blogsPageView;

    private Date blogsData;

    private String blogsContent;

    private Integer fileId;
    private Integer typeId;

    private BlogsImagePath blogsImagePath;

    private BlogsType blogsTypes;

    public Blogs() {
    }

    public Blogs(Integer blogsId, String blogsTitle, String blogsType, String blogsCopr, String blogBoss, Integer blogsPageView, Date blogsData, String blogsContent, Integer fileId, Integer typeId, BlogsImagePath blogsImagePath, BlogsType blogsTypes) {
        this.blogsId = blogsId;
        this.blogsTitle = blogsTitle;
        this.blogsType = blogsType;
        this.blogsCopr = blogsCopr;
        this.blogBoss = blogBoss;
        this.blogsPageView = blogsPageView;
        this.blogsData = blogsData;
        this.blogsContent = blogsContent;
        this.fileId = fileId;
        this.typeId = typeId;
        this.blogsImagePath = blogsImagePath;
        this.blogsTypes = blogsTypes;
    }

    public Integer getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(Integer blogsId) {
        this.blogsId = blogsId;
    }

    public String getBlogsTitle() {
        return blogsTitle;
    }

    public void setBlogsTitle(String blogsTitle) {
        this.blogsTitle = blogsTitle == null ? null : blogsTitle.trim();
    }

    public String getBlogsType() {
        return blogsType;
    }

    public void setBlogsType(String blogsType) {
        this.blogsType = blogsType == null ? null : blogsType.trim();
    }

    public String getBlogsCopr() {
        return blogsCopr;
    }

    public void setBlogsCopr(String blogsCopr) {
        this.blogsCopr = blogsCopr == null ? null : blogsCopr.trim();
    }

    public String getBlogBoss() {
        return blogBoss;
    }

    public void setBlogBoss(String blogBoss) {
        this.blogBoss = blogBoss == null ? null : blogBoss.trim();
    }

    public Integer getBlogsPageView() {
        return blogsPageView;
    }

    public void setBlogsPageView(Integer blogsPageView) {
        this.blogsPageView = blogsPageView;
    }

    public Date getBlogsData() {
        return blogsData;
    }

    public void setBlogsData(Date blogsData) {
        this.blogsData = blogsData;
    }

    public String getBlogsContent() {
        return blogsContent;
    }

    public void setBlogsContent(String blogsContent) {
        this.blogsContent = blogsContent == null ? null : blogsContent.trim();
    }


    public Integer getFileId() {
        return fileId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public BlogsImagePath getBlogsImagePath() {
        return blogsImagePath;
    }

    public void setBlogsImagePath(BlogsImagePath blogsImagePath) {
        this.blogsImagePath = blogsImagePath;
    }

    public void setBlogsTypes(BlogsType blogsTypes) {
        this.blogsTypes = blogsTypes;
    }

    public BlogsType getBlogsTypes() {
        return blogsTypes;
    }

    @Override
    public String toString() {
        return "Blogs{" +
                "blogsId=" + blogsId +
                ", blogsTitle='" + blogsTitle + '\'' +
                ", blogsType='" + blogsType + '\'' +
                ", blogsCopr='" + blogsCopr + '\'' +
                ", blogBoss='" + blogBoss + '\'' +
                ", blogsPageView=" + blogsPageView +
                ", blogsData=" + blogsData +
                ", blogsContent='" + blogsContent + '\'' +
                ", fileId=" + fileId +
                ", typeId=" + typeId +
                ", blogsImagePath=" + blogsImagePath +
                ", blogsTypes=" + blogsTypes +
                '}';
    }

    /*
<resultMap id="BaseResultBlogsWithImageWithPath" type="cn.hfbin.beans.Blogs" >
    <id column="blogs_id" property="blogsId" jdbcType="INTEGER" />
    <result column="blogs_title" property="blogsTitle" jdbcType="VARCHAR" />
    <result column="blogs_type" property="blogsType" jdbcType="VARCHAR" />
    <result column="blogs_copr" property="blogsCopr" jdbcType="VARCHAR" />
    <result column="blog_boss" property="blogBoss" jdbcType="VARCHAR" />
    <result column="blogs_page_view" property="blogsPageView" jdbcType="INTEGER" />
    <result column="blogs_data" property="blogsData" jdbcType="DATE" />
    <result column="file_id" property="fileId" jdbcType="INTEGER" />
    <result column="type_id" property="typeId" jdbcType="INTEGER" />
    <association property="blogsImagePath" javaType="cn.hfbin.beans.BlogsImagePath">
      <id column="file_id" property="fileId"/>
      <result column="file_name" property="fileName"/>
      <result column="file_path" property="filePath"/>
    </association>
    <association property="blogsTypes" javaType="cn.hfbin.beans.BlogsType">
      <id column="type_id" property="typeId"/>
      <result column="type_name" property="typeName"/>
    </association>
  </resultMap>


<sql id="Base_Column_List_With" >
    a.blogs_id, a.blogs_title, a.blogs_type, a.blogs_copr, a.blog_boss, a.blogs_content, a.blogs_page_view, a.blogs_data,
    a.file_id,a.type_id,
    e.file_id, e.file_name , e.file_path, b.type_id , b.type_name
  </sql>
  <!--带类型以及图片的博客 List<Blogs> selectBlogsWithImageWithPath(BlogsExample example);-->
  <select id="selectBlogsWithImageWithPath" resultMap="BaseResultBlogsWithImageWithPath"  >
    select
    <if test="distinct" >
      distinct
    </if>
    <include refid="Base_Column_List_With" />
    FROM blogs a
    left join blogs_type b on b.`type_id`=a.`type_id`
    left join blogs_image_path e on e.`file_id`=a.`file_id`
    <if test="_parameter != null" >
      <include refid="Example_Where_Clause" />
    </if>
    <if test="orderByClause != null" >
      order by a.blogs_page_view
    </if>
  </select>*/
}