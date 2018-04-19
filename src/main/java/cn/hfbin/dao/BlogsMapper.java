package cn.hfbin.dao;

import cn.hfbin.beans.Blogs;
import cn.hfbin.beans.BlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsMapper {
    int countByExample(BlogsExample example);

    int deleteByExample(BlogsExample example);

    int deleteByPrimaryKey(Integer blogsId);

    int insert(Blogs record);

    int insertSelective(Blogs record);

    List<Blogs> selectByExampleWithBLOBs(BlogsExample example);

    List<Blogs> selectByExample(BlogsExample example);

    Blogs selectByPrimaryKey(Integer blogsId);

    int updateByExampleSelective(@Param("record") Blogs record, @Param("example") BlogsExample example);

    int updateByExampleWithBLOBs(@Param("record") Blogs record, @Param("example") BlogsExample example);

    int updateByExample(@Param("record") Blogs record, @Param("example") BlogsExample example);

    int updateByPrimaryKeySelective(Blogs record);

    int updateByPrimaryKeyWithBLOBs(Blogs record);

    int updateByPrimaryKey(Blogs record);

    //带类型以及图片的博客
    List<Blogs> selectBlogsWithImageWithPath(BlogsExample example);

    Blogs selectBlogsWithType(Integer blogsId);


}