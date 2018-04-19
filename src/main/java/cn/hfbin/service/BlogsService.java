package cn.hfbin.service;

import cn.hfbin.beans.Blogs;
import cn.hfbin.beans.BlogsExample;
import cn.hfbin.dao.BlogsImagePathMapper;
import cn.hfbin.dao.BlogsMapper;
import cn.hfbin.dao.BlogsTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BlogsService {


    @Autowired
    BlogsTypeMapper blogsTypeMapper;

    @Autowired
    BlogsImagePathMapper blogsImagePathMapper;

    @Autowired
    BlogsMapper blogsMapper;

    @Autowired
    ImageService imageService;

    public List<Blogs> getAll(){
        return blogsMapper.selectBlogsWithImageWithPath(null);
    }
    @Transactional
    public Integer addBlogs(Blogs blogs) {
        System.out.println("blogs"+blogs);
        return blogsMapper.insert(blogs);
    }
    public Blogs getBlogsId(Integer id) {
        return blogsMapper.selectBlogsWithType(id);
    }

    /*andTypeIdEqualTo*/
    public List<Blogs> getBlogsWithTypeId(Integer id) {
        BlogsExample blogsExample = new BlogsExample();
        BlogsExample.Criteria criteria = blogsExample.createCriteria();
        //criteria.andTypeIdEqualTo(id);
        criteria.andBlogsTypeEqualTo(id+"");
        return blogsMapper.selectBlogsWithImageWithPath(blogsExample);
        //selectBlogsWithImageWithPath
    }
}
