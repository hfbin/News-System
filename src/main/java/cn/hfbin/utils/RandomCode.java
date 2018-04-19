package cn.hfbin.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class RandomCode {

    public String getRandem(String forma){
        /*yyyyMMddhhmmss*/
        String str = getData();
        Random random = new Random();
        UUID uuid = UUID.randomUUID();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;
        String filenames = str +"-"+ uuid;
        System.out.println("filenames+forma="+filenames+forma);
        return filenames+forma;
    }
    public String  getData(){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        return  str;
    }

}
