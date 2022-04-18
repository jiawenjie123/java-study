package demo3_regex;

public class demo1 {
    public static void main(String[] args) {
        //校验q号 6-20位
        System.out.println(checkqq("12324124"));
        System.out.println(checkqq1("12324124"));
    }
    public static boolean checkqq1(String qq){
        return qq!=null&&qq.matches("\\d{6,20}");
    }


    public static boolean checkqq(String qq)
    {//正则表达式 学会查文档
        if(qq==null||qq.length()<6||qq.length()>20){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch=qq.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;

    }
}
