package demo3_final;

public class Test {
    public static void main(String[] args) {
        //final
        //最终类 不可继承
        //方法不能被重写
        //变量有且只能赋值一次
    }
}

final class Animal
{

}
//工具类前可加final

class People{
    public final void eat()
    {
        System.out.println("eat");
    }
}