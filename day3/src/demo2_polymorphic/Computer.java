package demo2_polymorphic;

public class Computer {
    public String name;

    public void installUSB(Usb usb)//多态
    {
        usb.connect();

        if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.dick();
        }
        usb.unconnect();
    }
    public void run(){
        System.out.println(name+"开机");
    }


    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
