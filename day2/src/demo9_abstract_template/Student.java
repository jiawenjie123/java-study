package demo9_abstract_template;

public abstract class Student {
    public final void write()
    {//模版方法应该用final修饰
        //模版方法
        System.out.println("my dad");
        System.out.println("talk about your father");
        //正文（每个子类都要写，但情况不一样）
        //模版把正文定义成抽象方法，交给具体的子类完成
        System.out.println(writeMain());
        System.out.println("hao");

    }
    public abstract String writeMain();
}
