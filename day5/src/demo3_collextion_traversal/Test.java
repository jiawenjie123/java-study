package demo3_collextion_traversal;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Moive> moive = new ArrayList<Moive>();
        moive.add(new Moive("i",10,"jia"));
        moive.add(new Moive("j",9,"wen"));
        moive.add(new Moive("k",8,"jie"));

        for (Moive moive1 : moive) {
            System.out.println(moive1.getName() + moive1.getScore()+moive1.getActor());
        }

    }
}
