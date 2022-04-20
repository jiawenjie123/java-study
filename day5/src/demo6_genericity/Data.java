package demo6_genericity;

public interface Data<E> {
    //泛型接口 便于操作
    void add(E e);
    void delete(int id);
    void update(E e);
    E query(E e);
}
//通配符 ？
//通配符上下限 ？extends Car