package demo5_extends;

public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("wa");
        s.setAge(10);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.querycourse();
        s.writeInfo();
    }
}