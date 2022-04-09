package demo1_static;

public class user {
    public static int onlineNumber=100;
    //内存中只有一份//共享访问修改
    private String name;
    private int age;

    public static void main(String[] args) {
        System.out.println(user.onlineNumber);

        user u=new user();
        u.age=10;
        u.name="张三";
        u.onlineNumber++;
        user u1=new user();
        u1.age=11;
        u1.name="张w";
        u1.onlineNumber++;
        System.out.println(user.onlineNumber);
        System.out.println(u.onlineNumber);
        System.out.println(u1.onlineNumber);
    }
}
