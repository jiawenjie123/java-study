package demo2_integer;
//包装类

//实现一切皆对象
public class Test {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        Integer a1=11;
        System.out.println(a1);
        //自动装箱自动拆箱
        Integer a2=a;
        int a3=a1;
        //灵活 随意互换
        //int age=null;
        Integer age=null;
        //容错率高
        String rs=Integer.toString(1);
        //转为字符串(没什么用)
        System.out.println(rs+1);
        //把字符串类型的数值转为真实的数据类型（有用）
        String number="123";
        String number1="99.9";
        System.out.println(Integer.parseInt(number)+1);
        System.out.println(Double.valueOf(number1));
        //直接用valueofOf


    }
}
