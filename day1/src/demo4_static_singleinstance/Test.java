package demo4_static_singleinstance;

public class Test {
    public static void main(String[] args) {
        singleinstance s1=singleinstance.instance;
        singleinstance s2=singleinstance.instance;
        System.out.println(s1==s2);
        singlesintance1 instance=singlesintance1.getInstance();
        singlesintance1 instance1=singlesintance1.getInstance();
        System.out.println(instance);
        System.out.println(instance1);
    }
}
