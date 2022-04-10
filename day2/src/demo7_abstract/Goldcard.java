package demo7_abstract;

public class Goldcard extends Card{

    @Override
    public void pay(double money) {
        System.out.println("当前消费"+money);
        System.out.println("余额"+getMoney());
        double rs=money*0.8;
        System.out.println("实际支付"+rs);

        setMoney(getMoney()-rs);
    }
}
