package demo12_interface_extends;

public interface Sportman extends Law,People{
    void run();
    void competition();
//类可以多继承
    //合并，便于实现
}
