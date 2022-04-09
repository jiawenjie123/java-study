package demo9_extends_constructor;

public class Test {
    public static void main(String[] args) {
        //子类的全部默认构造器会先访问父类的无参构造器再执行自己
        //子类初始化之前，一定要调用父类构造器完成数据空间的初始化
        dog d=new dog();
        System.out.println(d);
        dog d1=new dog("jingmao");
        System.out.println(d1);
    }
}
class Animal {
    public Animal(){
        System.out.println("父类无参构造器执行");
    }

}

class dog extends Animal{
    public dog(){
        super();//写不写都有，默认父类构造器执行
        System.out.println("子类无参构造器执行");
    }
    public dog(String name){
        System.out.println("子类有参构造器执行");
    }
}

