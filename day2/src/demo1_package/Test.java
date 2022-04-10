package demo1_package;

import demo1_package.it.Student;

import java.util.Scanner;

public class Test {
    //同一个包下的类可以互相直接访问
    public static void main(String[] args) {
        System.out.println(User.number);
        //不同包下的类必须先导包
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        //类中使用不同包下相同的类名，默认只能导入一个，另一个类要用全名访问
        Student  student1=new Student();
        demo1_package.it1.Student student2=new demo1_package.it1.Student();
    }
}
