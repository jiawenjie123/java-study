package demo11_api_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        //解决字符精度问题

        System.out.println(0.09+0.01);
        double a=0.09;
        double b=0.01;
        BigDecimal a1= BigDecimal.valueOf(a);
        BigDecimal b1= BigDecimal.valueOf(b);
        BigDecimal c1=a1.add(b1);
        System.out.println(c1);

        //一定会进行精度计算
        BigDecimal a2= BigDecimal.valueOf(10.0);
        BigDecimal b2= BigDecimal.valueOf(3.0);
        BigDecimal c2=a2.divide(b2, 2,RoundingMode.HALF_UP);//解决  保留小数  舍入模式
        System.out.println(c2);//3.333333 无法得到结果
    }
}
