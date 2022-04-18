package demo1_api_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 86130
 */
public class Datedemo2 {
    //格式化时间
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        //EEE周几
        String rs=sdf.format(d);
        System.out.println(rs);
        System.out.println("============");
        long time=System.currentTimeMillis()+121*1000;
        String rs1=sdf.format(time);
        System.out.println(rs1);

        System.out.println("------解析时间----");
        //计算2021年08月06日11点11分11秒 往后走2天14小时49分06秒后时间是多少
        String datestr="2021年08月06日 11:11:11";
        //解析
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //格式一样
        Date d1=sdf1.parse(datestr);
        //自己抛出异常
        long time1=d1.getTime()+(2*24*60*60+14*60*60+49*60+6)*1000;
        System.out.println(sdf1.format(time1));
    }
}
