package demo5_extends;
//继承，提高代码复用性
//子类相同特征放在父类中定义
public class Student extends People {
    //独有行为
    public void writeInfo()
    {
        System.out.println(getName()+"学习很开心");
    }
}
