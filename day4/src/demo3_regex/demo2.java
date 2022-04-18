package demo3_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo2 {
    public static void main(String[] args) {
        String name = "小deahuff大sfifi中";
        String[]array=name.split("\\w+");
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }

        String name1 = name.replaceAll("\\w+"," ");
        System.out.println(name1);

        String regex=("0\\d{2,6}-?\\d{5,20}");
        Pattern pattern = Pattern.compile(regex);
        //爬取内容 背

        Matcher matcher=pattern.matcher(name);
        while(matcher.find()) {
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
