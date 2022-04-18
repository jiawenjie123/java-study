package demo6_lambda;

public class Lambaddemo1 {
    public static void main(String[] args) {
        Animal animal = new Animal(){

            @Override
            public void run() {
                System.out.println("跑");
            }
        };
//        Swim s1=new Swim() {
//            @Override
//            public void swim() {
//                System.out.println("游泳");
//            }
//        };
        Swim s1=()->
        {
            System.out.println("游泳");
        };

    }

}
abstract class Animal{
    public abstract void run();
    //只能简化接口中只有一个抽象方法的匿名内部类形式
}
@FunctionalInterface
//加上表示里面只有一个抽象方法
interface Swim{
    void swim();
}

