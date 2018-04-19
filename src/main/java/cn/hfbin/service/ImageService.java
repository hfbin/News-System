package cn.hfbin.service;

import cn.hfbin.beans.BlogsImagePath;
import cn.hfbin.dao.BlogsImagePathMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    BlogsImagePathMapper blogsImagePathMapper;

    public Integer addImage(BlogsImagePath blogsImagePath ){

        return blogsImagePathMapper.insert(blogsImagePath);
    }
}
