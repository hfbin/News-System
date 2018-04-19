package cn.hfbin.controller;


import cn.hfbin.beans.*;
import cn.hfbin.service.BannerService;
import cn.hfbin.service.BlogsService;
import cn.hfbin.service.BlogsTypeService;
import cn.hfbin.service.ImageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BlogsController {

    @Autowired
    BlogsTypeService blogsTypeService;
    @Autowired
    BlogsService blogsService;
    @Autowired
    ImageService imageService;
    @Autowired
    BannerService bannerService;

    @RequestMapping("/blogs")
    @ResponseBody
    public Msg getEmpsWithJson(
            @RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        PageHelper.startPage(pn, 5);
        List<Blogs> emps = blogsService.getAll();
        System.out.println("emps"+emps.toString());
        PageInfo page = new PageInfo(emps, 5);
        System.out.println("page=="+page.getList().toString());
        return Msg.success().add("pageInfo", page);
    }
    @RequestMapping("/getBlogs")
    @ResponseBody
    public Msgs getJson() {
        List<Blogs> emps = blogsService.getAll();
        System.out.println("emps"+emps.toString());
        List<Banner> allBanner = bannerService.getAllBanner();

        BlogsWithBanner blogsWithBanner = new BlogsWithBanner();
        blogsWithBanner.setBlogs(emps);
        blogsWithBanner.setBanners(allBanner);

        return Msgs.success().add("results" , blogsWithBanner);
    }
    @RequestMapping(value = "/blogss" , method = RequestMethod.GET)
   // @ResponseBody
    public String selectId(@RequestParam(value = "id" , required = false)Integer id , Model model) {
        Blogs blogs = blogsService.getBlogsId(id);
        System.out.println(id+"===blogs"+blogs);
        model.addAttribute("blogs_info",blogs);
        //Msg.success().add("blogs", blogs);
        return "blogs_info";
    }

    @RequestMapping(value = "/allBlogsType" , method = RequestMethod.GET)
    @ResponseBody
    public Msg allBlogsType(@RequestParam(value="typeid" ,required=false)Integer typeid) {
        List<Blogs> blogs = blogsService.getBlogsWithTypeId(typeid);
        System.out.println(typeid+"===blogs"+blogs);
        return Msg.success().add("allBlogsType", blogs);
    }
}
