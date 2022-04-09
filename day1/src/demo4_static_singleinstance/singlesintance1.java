package demo4_static_singleinstance;

public class singlesintance1 {
    //懒汉单例
    private static singlesintance1 instance;
    public static singlesintance1 getInstance(){
        if(instance==null){
            instance=new singlesintance1();
        }
        return instance;
    }
    private singlesintance1(){}
}
