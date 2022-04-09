package demo3_static_code;

import java.util.ArrayList;

public class Staticdemo3 {

    public static  ArrayList<String> cards=new ArrayList<>();

    static {//点数
        String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //花色
        String[]  colors={"♥","♠","♦","♣"};
        //组合
        //遍历点数
        for (int i = 0; i < sizes.length; i++) {
            //遍历花色
            for (int i1 = 0; i1 < colors.length; i1++) {
                //牌
                String card=sizes[i]+colors[i1];
                cards.add(card);
            }
        }
        cards.add("King小");
        cards.add("King大");
    }
    public static void main(String[] args) {
        //模拟游戏启动前初始化54张牌
        //系统只需要一套牌
        System.out.println("牌"+cards);
    }
}
