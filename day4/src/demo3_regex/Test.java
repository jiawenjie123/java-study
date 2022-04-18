package demo3_regex;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //校验手机号 邮箱电话号
        //checkphones();
        //checkemail();
        checktelephone();
    }

    public static void checkphones(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入手机号");
            String phone = scanner.next();
            if(phone.matches("1[3-9]\\d{9}"))
            {
                System.out.println("正确");
                break;
            }
            else{
                System.out.println("有误");
            }
        }
    }

    public static void checkemail(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入邮箱号");
            String email = scanner.next();
            if(email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}"))
            {
                System.out.println("正确");
                break;
            }
            else{
                System.out.println("有误");
            }
        }
    }

    public static void checktelephone(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入电话号");
            String telephone = scanner.next();
            if(telephone.matches("0\\d{2,6}-?\\d{5,20}"))
            {
                System.out.println("正确");
                break;
            }
            else{
                System.out.println("有误");
            }
        }
    }
}
