package demo2_static_util;

import java.util.Random;
//工具类
//无需创建对象 将构造类私有-----专业
public class Utildemo {
    private Utildemo() {};

    public static String createVerifyCode(int n){

            String code="";
            String data="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
            Random r=new Random();
            for (int i = 0; i <n ; i++) {
                //获取随机索引对应的字符
                int index=r.nextInt(data.length());
                code+= data.charAt(index);
            }
          return code;

    }
}
