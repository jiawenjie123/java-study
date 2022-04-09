package demo10_extends_constructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("li",10);

        System.out.println(teacher.getAge());
        System.out.println(teacher.getName());
    }
}

class People{
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Teacher extends People{
    public Teacher(String name,int age)
    {
        //调用父类有参构造器
        super(name,age);
    }
}
