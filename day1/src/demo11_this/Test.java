package demo11_this;

public class Test {
    public static void main(String[] args) {
        //this 本类构造器访问本类兄弟构造器

        Student s1=new Student("zhangsan", "tjlg");
        System.out.println(s1.getSchoolname());
        Student s2=new Student("wangwu");
        System.out.println(s2.getSchoolname());
        //this，super都放在第一行
        //不能同时出现在一个构造器中
    }
}

class Student{
    private String name;
    private String schoolname;

    public Student() {
    }
    public Student(String name){
        this(name,"tjlg");//访问本类兄弟构造器
    }

    public Student(String name, String schoolname) {
        this.name = name;
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
}
