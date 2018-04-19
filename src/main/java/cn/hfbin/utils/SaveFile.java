package cn.hfbin.utils;

import cn.hfbin.beans.BlogsImagePath;
import cn.hfbin.beans.BlogsType;
import org.springframework.web.multipart.MultipartFile;

import javax.print.DocFlavor;
import javax.servlet.http.HttpServletRequest;
import java.io.File;

public class SaveFile {
    public boolean save(MultipartFile file , HttpServletRequest request) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                //得到文件格式 带.
                String fileNameAll = file.getOriginalFilename();
                String filename = fileNameAll.substring(fileNameAll.lastIndexOf("."));
                RandomCode randomCode = new RandomCode();
                String lastFildName = randomCode.getRandem(filename);
                String str = randomCode.getData();

                String Path = request.getSession().getServletContext().getRealPath("/image/" + str + "/") + "\\";
                File autoPath = new File(Path);
                //判断目录是否存在  不存在则创建
                if (!autoPath.exists()) {
                    autoPath.mkdir();
                }
                // 文件保存路径
                String filePath = autoPath + "\\" + lastFildName;

                System.out.println("文件路径:: " + filePath);
                // 转存文件
                file.transferTo(new File(filePath));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
    BlogsImagePath blogsImagePath = new BlogsImagePath();
    public BlogsImagePath saves(MultipartFile file , HttpServletRequest request) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                //得到文件格式 带.

                String fileNameAll = file.getOriginalFilename();
                String filename = fileNameAll.substring(fileNameAll.lastIndexOf("."));
                RandomCode randomCode = new RandomCode();
                String lastFildName = randomCode.getRandem(filename);
                String str = randomCode.getData();

                String path = request.getContextPath();
                String Path =request.getSession().getServletContext().getRealPath("/image/" + str + "/") + "\\";
                        //request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/image/" + str + "/";
                File autoPath = new File(Path);
                //判断目录是否存在  不存在则创建
                if (!autoPath.exists()) {
                    autoPath.mkdir();
                }

                String Path2 = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/image/" + str + "/";
                // 文件保存路径
                String filePath1 = "/" + str + "/"  + lastFildName;
                String filePath = Path + "\\" + lastFildName;
               // String lastfilePath =  filePath.substring(0, filePath.indexOf("\\",filePath.indexOf("\\",filePath.indexOf("\\",filePath.indexOf("\\")+1)) ));
              //  System.out.println("lastfilePath=="+ lastfilePath);
               // String path = request.getContextPath();
               // System.out.println("adafaffas=="+request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/image/" + str + "/");
                blogsImagePath.setFileName(fileNameAll);
                blogsImagePath.setFilePath(filePath1);

                System.out.println("文件路径:: " + filePath);
                // 转存文件
                file.transferTo(new File(filePath));
                return blogsImagePath;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
