package demo8_extends_override;

public class Test {
    public static void main(String[] args) {
        NewPhone hw=new NewPhone();
        hw.call();
    }
}

class Phone{
    public void call()
    {
        System.out.println("打电话");
    }
    public void send()
    {
        System.out.println("发短信");
    }
}
class NewPhone extends Phone{
    @Override//重写校验注解
    //提高可读性
    //重写的名称和参数列表必须一样
    //私有成员不能重写
    //不能重写父类静态方法
    //声明不变
    public void call()
    {//重写
        super.call();
        System.out.println("视频通话");
    }
}