package demo6_api_object;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("jia","男",10);
        System.out.println(student.toString());//toString可以省略 返回地址
        //意义在于给子类重写
        Student student1=new Student("jia","男",10);
        System.out.println(student.equals(student1));//比较地址
        //重写 内容一样
    }
}
