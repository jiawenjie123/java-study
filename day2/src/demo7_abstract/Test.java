package demo7_abstract;

public class Test {
    public static void main(String[] args) {
        Goldcard goldcard=new Goldcard();
        goldcard.setMoney(10000);
        goldcard.pay(100);
        System.out.println("剩余"+goldcard.getMoney());
    }
}
