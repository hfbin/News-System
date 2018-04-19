package cn.hfbin.test;

import cn.hfbin.beans.Blogs;
import cn.hfbin.beans.BlogsImagePath;
import cn.hfbin.beans.BlogsType;
import cn.hfbin.dao.BlogsMapper;
import cn.hfbin.dao.BlogsTypeMapper;
import cn.hfbin.service.BannerService;
import cn.hfbin.service.BlogsService;
import cn.hfbin.service.BlogsTypeService;
import cn.hfbin.service.ImageService;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class BlogsTest {

    @Autowired
    BlogsMapper blogsMapper;

    @Autowired
    BlogsService blogsService;
    @Autowired
    BlogsTypeService blogsTypeService;
    @Autowired
    ImageService imageService;
    @Autowired
    BannerService bannerService;
    @Autowired
    SqlSession sqlSession;


    @Test
    public void test01(){
        /*List<Blogs> blogs = blogsMapper.selectBlogsWithImageWithPath(null);
        System.out.println(blogs);*/
        System.out.println(blogsService.getAll());
    }

    @Test
    public void test02(){
        /*List<Blogs> blogs = blogsMapper.selectBlogsWithImageWithPath(null);
        System.out.println(blogs);*/
        BlogsType blogsType  = new BlogsType();
        blogsType.setTypeName("jj部");
        blogsTypeService.addType(blogsType);
    }
    @Test
    public void test03(){
        /*List<Blogs> blogs = blogsMapper.selectBlogsWithImageWithPath(null);
        System.out.println(blogs);*/
        BlogsImagePath blogsimage  = new BlogsImagePath();
        blogsimage.setFileName("dadadadada");
        blogsimage.setFilePath("dadaadadada");
        imageService.addImage(blogsimage);
        System.out.println(blogsimage.getFileId());
        System.out.println(blogsimage);
    }

    public void test04(){
        PageHelper.startPage(1, 5);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<Blogs> emps = blogsService.getAll();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(emps, 5);
        System.out.println(page);
    }
    @Test
    public void test06(){
        System.out.println(bannerService.getAllBanner());
    }

    @Test
    public void test05(){
        System.out.println(blogsService.getBlogsWithTypeId(2).size());
    }
    /* @RequestMapping("/list")
    public String getToList(HttpServletRequest request , @RequestParam("file") MultipartFile file) throws IOException {

        System.out.println(request.getSession().getServletContext().getRealPath("/"));
        System.out.println(file.getInputStream());
        System.out.println(file.getName());
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                String filePath = request.getSession().getServletContext().getRealPath("/")
                        + file.getOriginalFilename();
                // 转存文件
                file.transferTo(new File(filePath));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return  "list";
    }

    @RequestMapping("/filesUpload")
    public String filesUpload(@RequestParam("files") MultipartFile[] files , HttpServletRequest  request) throws IOException {
        //判断file数组不能为空并且长度大于0
        Address address = new Address();
        System.out.println("address="+address.getIpAddr(request));
        SaveFile saveFile = new SaveFile();
        if(files!=null&&files.length>0){
            //循环获取file数组中得文件
            for(int i = 0;i<files.length;i++){
                MultipartFile file = files[i];
                //保存文件
                saveFile.save(file , request);
            }
        }
        return "list";
    }*/
}
