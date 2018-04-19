package cn.hfbin.beans;

public class Banner {
    private Integer bannerId;

    private String bannerName;

    private String bannerPath;

    public Banner() {
    }

    public Banner(Integer bannerId, String bannerName, String bannerPath) {
        this.bannerId = bannerId;
        this.bannerName = bannerName;
        this.bannerPath = bannerPath;
    }

    public Integer getBannerId() {
        return bannerId;
    }

    public String getBannerName() {
        return bannerName;
    }

    public String getBannerPath() {
        return bannerPath;
    }

    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public void setBannerPath(String bannerPath) {
        this.bannerPath = bannerPath;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "bannerId=" + bannerId +
                ", bannerName='" + bannerName + '\'' +
                ", bannerPath='" + bannerPath + '\'' +
                '}';
    }
}
