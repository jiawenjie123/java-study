package demo9_abstract_template;

public class Test {
    public static void main(String[] args) {
        //模版思想使用步骤
        StudentChild s1=new StudentChild();
        s1.write();
        StudentMiddle s2=new StudentMiddle();
        s2.write();
    }
}
