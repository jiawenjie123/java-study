package demo2_modifier;

public class FU {
    private void privateMehod()
    {//只能本类访问
        System.out.println("private");
    }
    void method()
    {//同包下其他类访问（包访问权限）
        System.out.println("缺省");
    }

    protected void protectedmethod()
    {//本类。同包的其他类 其他包子类
        System.out.println("protect");
    }
    //本类 同包其他类 其他包子类 其他包无关类
    public void publicMethod()
    {
        System.out.println("public");
    }

    public static void main(String[] args) {
        FU fu=new FU();
        fu.method();
        fu.privateMehod();
        fu.protectedmethod();
        fu.publicMethod();
    }
}
