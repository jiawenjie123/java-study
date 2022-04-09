package demo2_static_util;

import java.util.Random;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        String code="";
        String data="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random r=new Random();
        for (int i = 0; i <5 ; i++) {
            //获取随机索引对应的字符
            int index=r.nextInt(data.length());
            code+= data.charAt(index);
        }
        System.out.println("验证码"+code);
    }
}
