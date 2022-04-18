package demo1_api_date;

import java.util.Calendar;
import java.util.Date;

public class Calendardemo {
    public static void main(String[] args) {
        //抽象类
        //日历对象
        Calendar cal = Calendar.getInstance();

        //获取日历信息
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        cal.add(Calendar.MINUTE,59);
        Date date =cal.getTime();
        System.out.println(date);
    }
}
