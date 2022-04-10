package demo7_abstract;

public abstract class Card {
    private String name;
    private double money;
    public abstract void pay(double money);//抽象方法

    public Card() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
