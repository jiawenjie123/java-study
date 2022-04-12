package demo9_api_math;

public class Test {
    public static void main(String[] args) {
        //math中方法都是静态的 直接用类名调用
        System.out.println(Math.abs(-1));
//随机生成3-9    0-6  +3
        System.out.println((int)(Math.random()*7)+3);
    }
}
