package demo1_api_date;

import java.util.Date;

public class Datedemo1 {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        //毫秒

        System.out.println("--------------");

        long time3=System.currentTimeMillis();
        time3+=(60*60+121)*1000;
        Date date1=new Date(time3);
        System.out.println(date1);

    }
}
