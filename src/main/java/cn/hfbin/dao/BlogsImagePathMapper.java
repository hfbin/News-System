package cn.hfbin.dao;

import cn.hfbin.beans.BlogsImagePath;
import cn.hfbin.beans.BlogsImagePathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsImagePathMapper {
    int countByExample(BlogsImagePathExample example);

    int deleteByExample(BlogsImagePathExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(BlogsImagePath record);

    int insertSelective(BlogsImagePath record);

    List<BlogsImagePath> selectByExample(BlogsImagePathExample example);

    BlogsImagePath selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") BlogsImagePath record, @Param("example") BlogsImagePathExample example);

    int updateByExample(@Param("record") BlogsImagePath record, @Param("example") BlogsImagePathExample example);

    int updateByPrimaryKeySelective(BlogsImagePath record);

    int updateByPrimaryKey(BlogsImagePath record);
}