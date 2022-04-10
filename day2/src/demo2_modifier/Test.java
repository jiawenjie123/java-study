package demo2_modifier;

public class Test {
    //权限修饰符作用范围
    public static void main(String[] args) {
        FU fu=new FU();
        fu.publicMethod();
        fu.protectedmethod();
        fu.method();
    }
}
