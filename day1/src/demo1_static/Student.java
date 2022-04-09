package demo1_static;

public class Student {
    private String name;
    //静态成员方法 有static修饰 归属于类 可以共享访问 用类名和对象名都可以访问
    //该方法以实现公用功能为目的，则加static
    //静态方法只能访问静态的成员 不可直接访问实例成员
    //静态方法不可以出现this关键字--this代表当前对象
    public static  int getmax(int age1,int age2)
    {
        return age1>age2 ? age1:age2;
    }
//实例方法 属于对象 只能用对象访问
    //表示对象自己的行为，且要访问实例成员则必须要用实例方法
    //实例方法可以访问静态成员和实例成员
    public void study(){
        System.out.println(name+"在学校");
    }
    public static void main(String[] args) {
        System.out.println(Student.getmax(10,12));
        Student s=new Student();
        s.name="zhangsan";
        s.study();
    }
}
