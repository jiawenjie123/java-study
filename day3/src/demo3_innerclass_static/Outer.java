package demo3_innerclass_static;

public class Outer {
    public static int a=100;
    public static class inner{
        private String name;
        public static String shoolname;
//静态成员内部类与普通类无区别 只是位置在里面
        //静态类可以访问外部类静态成员
        //不可以访问外部类成员变量 只能通过创建对象访问
        public void show()
        {
            System.out.println("名字"+name);
            System.out.println(a);
        }

        public inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class inner1{}

}
