package demo4_innerclass_anonymous;

public class Test {
    public static void main(String[] args) {
        Animal a=new Animal(){
            public void run()
            {
                System.out.println("老虎跑的快");
            }//匿名类
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}


//class Tiger extends Animal{
//
//    @Override
//    public void run() {
//        System.out.println("老虎跑的快");
//    }
//}
