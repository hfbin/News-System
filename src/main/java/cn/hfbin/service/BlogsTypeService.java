package cn.hfbin.service;

import cn.hfbin.beans.Blogs;
import cn.hfbin.beans.BlogsImagePath;
import cn.hfbin.beans.BlogsType;
import cn.hfbin.dao.BlogsImagePathMapper;
import cn.hfbin.dao.BlogsMapper;
import cn.hfbin.dao.BlogsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class BlogsTypeService {


    @Autowired
    BlogsTypeMapper blogsTypeMapper;

    @Autowired
    BlogsImagePathMapper blogsImagePathMapper;

    @Autowired
    BlogsMapper blogsMapper;


    public List<BlogsType> getAllType(){
        return blogsTypeMapper.selectByExample(null);
    }



    public void addType(BlogsType blogsType ){
        blogsTypeMapper.insert(blogsType);
    }
}
