package demo5_innerclass_anonymous;

public class Test {
    public static void main(String[] args) {
        Swimming s =new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生在游泳");
            }
        };//内部匿名类创业对象，不是接口创建对象
        go(s);
        Swimming s1 =new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳快");
            }
        };
        go(s1);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员在游泳");
            }
        });
    }

    public static void go(Swimming s)
    {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

//class Student implements Swimming {
//    @Override
//    public void swim() {
//        System.out.println("学生游泳");
//    }
//}

interface Swimming {
    void swim();
}