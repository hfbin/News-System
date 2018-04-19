package cn.hfbin.service;

import cn.hfbin.beans.Banner;
import cn.hfbin.dao.BannerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {
    @Autowired
    BannerMapper bannerMapper;

    public List<Banner> getAllBanner(){
        return bannerMapper.getAllBanner();
    }

}
