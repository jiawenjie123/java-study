package demo3_final;

public class Test1 {
    public static final String name="zhangsan";//静态成员+final=常量

    private final String name1="liwu";//实例成员变量 每个对象 name1 都是liwu 且无法修改  无意义

    public static void main(String[] args) {
        //修饰变量 有且只能修饰一次
        //1.局部变量
        //2.成员变量 实例 静态
        final double f=3.14;//保护数据
        buy(0.1);
        //final修饰基本类型 存储数值不能变化
//修饰的引用类型 变量存储的地址值不变 内容可变
        final Teacher teacher=new Teacher("学习授课");

        teacher.setHobby("运动");
        System.out.println(teacher.getHobby());
    }

    public static void buy(final double z){
        //z=0.1;第二次赋值了
    }
}

class Teacher{
    private String Hobby;

    public Teacher(String hobby) {
        Hobby = hobby;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }
}