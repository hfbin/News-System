package cn.hfbin.controller;

import cn.hfbin.beans.Blogs;
import cn.hfbin.beans.BlogsType;
import cn.hfbin.beans.Msg;
import cn.hfbin.service.BlogsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BlogsTypeController {

    @Autowired
    BlogsTypeService blogsTypeService;

    @RequestMapping(value = "/blogsType" , method = RequestMethod.GET)
    @ResponseBody
    public Msg getAllType() {
        List<BlogsType> types = blogsTypeService.getAllType();
        return Msg.success().add("types", types);
    }
}
