package demo2_polymorphic;

public class Mouse implements Usb{
    public  String name;

    public Mouse(String name) {
        this.name = name;
    }
    public void dick(){
        System.out.println(name+"敲击");
    }


    @Override
    public void connect() {
        System.out.println(name+"连接电脑");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"拔出电脑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
