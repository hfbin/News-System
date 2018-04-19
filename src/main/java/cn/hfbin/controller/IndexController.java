package cn.hfbin.controller;


import cn.hfbin.beans.Blogs;
import cn.hfbin.beans.BlogsImagePath;
import cn.hfbin.service.BlogsService;
import cn.hfbin.service.BlogsTypeService;
import cn.hfbin.service.ImageService;
import cn.hfbin.beans.Msg;
import cn.hfbin.utils.SaveFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    BlogsTypeService blogsTypeService ;
    @Autowired
    BlogsService blogsService;

    @Autowired
    ImageService imageService;

    @RequestMapping("/indexss")
    public String index(Model model){
        System.out.println("indexss");
        model.addAttribute("alltype",blogsTypeService.getAllType());
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/indexs" , method= RequestMethod.POST)
    public Msg addBlogs( @RequestParam("filePath") MultipartFile filePath ,Blogs blogs , HttpServletRequest request){
        System.out.println("RequestMethod.1" );
        //Date date = new Date();
        /*yyyy-MM-dd HH:mm:ss*/
       // String nowTime = new SimpleDateFormat("yyyy-MM-dd").format(date);
       // Timestamp goodsC_date = Timestamp.valueOf(nowTime);
        //blogs.setBlogsData(goodsC_date);
        blogs.setBlogsPageView(1);
        System.out.println("blogs.blogs"+blogs );
        blogs.setTypeId(Integer.parseInt(blogs.getBlogsType()));
        SaveFile saveFile = new SaveFile();
        BlogsImagePath saves = saveFile.saves(filePath, request);
        imageService.addImage(saves);
        blogs.setFileId(saves.getFileId());
        blogsService.addBlogs(blogs);
        return Msg.success();
    }
    @RequestMapping("/banner_fabu")
    public String bannerFabu(){
        System.out.println("banner_fabu");
        return "banner_fabu";
    }
    @RequestMapping("/banner_chakan")
    public String bannerChakan(){
        System.out.println("banner_chakan");
        return "banner_chakan";
    }
    @RequestMapping("/blogs_fabu")
    public String blogsFabu(Model model){
        System.out.println("blogs_fabu"+blogsTypeService.getAllType().toString());
        model.addAttribute("alltype",blogsTypeService.getAllType());
        return "index";
    }

    @RequestMapping("/blogs_chakan")
    public String blogschakan(){
        System.out.println("blogs_chakan");
        return "blogs_chakan";
    }
    @RequestMapping("/type_edit")
    public String typeEdit(){
        System.out.println("type_edit");
        return "type_edit";
    }
}
