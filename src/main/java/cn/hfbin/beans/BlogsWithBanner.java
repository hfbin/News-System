package cn.hfbin.beans;

import java.util.List;

public class BlogsWithBanner {
    private List<Blogs> blogs;

    private List<Banner> banners ;

    public BlogsWithBanner() {
    }

    public BlogsWithBanner(List<Blogs> blogs, List<Banner> banners) {
        this.blogs = blogs;
        this.banners = banners;
    }

    public List<Blogs> getBlogs() {
        return blogs;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBlogs(List<Blogs> blogs) {
        this.blogs = blogs;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    @Override
    public String toString() {
        return "BlogsWithBanner{" +
                "blogs=" + blogs +
                ", banners=" + banners +
                '}';
    }
}
