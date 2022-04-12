package demo1_polymorphic;

public class Dog extends Animal{
    public String name="子类狗";
    @Override
    public void run() {
        System.out.println("狗跑的快");
    }
    public void lookdoor(){
        System.out.println("看门");
    }


}
