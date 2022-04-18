package demo1_api_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo3 {
    public static void main(String[] args) throws ParseException {
        String startTime="2021-11-11 00:00:00";
        String endTime="2021-11-11 00:10:00";

        String rs1="2021-11-11 00:03:47";
        String rs2="2021-11-11 00:10:47";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse(startTime);
        Date date2 = sdf.parse(endTime);
        Date date3 = sdf.parse(rs1);
        Date date4 = sdf.parse(rs2);

        if(date3.after(date1)&&date3.before(date2))
        {
            System.out.println("1成功");
        }
        else{
            System.out.println("1失败");
        }

    }
}
