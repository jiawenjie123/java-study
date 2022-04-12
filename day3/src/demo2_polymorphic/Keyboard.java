package demo2_polymorphic;

public class Keyboard implements Usb{
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }



    @Override
    public void connect() {
        System.out.println(name+"连接电脑");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"键盘拔出");
    }

    public void keyDown(){
        System.out.println(name+"键盘敲击");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
