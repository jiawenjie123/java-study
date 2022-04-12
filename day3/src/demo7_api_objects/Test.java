package demo7_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1=null;
        String s2=new String("jia");
        //System.out.println(s1.equals(s2));//会出现异常
        System.out.println(Objects.equals(s1, s2));//更加安全准确
        System.out.println(Objects.isNull(s1));
    }
}
