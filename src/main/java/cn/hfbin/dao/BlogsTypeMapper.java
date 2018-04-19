package cn.hfbin.dao;

import cn.hfbin.beans.BlogsType;
import cn.hfbin.beans.BlogsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsTypeMapper {
    int countByExample(BlogsTypeExample example);

    int deleteByExample(BlogsTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(BlogsType record);

    int insertSelective(BlogsType record);

    List<BlogsType> selectByExample(BlogsTypeExample example);

    BlogsType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") BlogsType record, @Param("example") BlogsTypeExample example);

    int updateByExample(@Param("record") BlogsType record, @Param("example") BlogsTypeExample example);

    int updateByPrimaryKeySelective(BlogsType record);

    int updateByPrimaryKey(BlogsType record);
}