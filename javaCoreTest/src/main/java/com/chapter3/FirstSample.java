package com.chapter3;

/**
 * Created by yek on 2018-2-28.
 */
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("We will not use \"Hello, World\"");
        long round = Math.round(-5.1);
        int round1 = Math.round(5.5f);
        System.out.println(round+" Math.round(double)返回 Long！");
        System.out.println(round1+" Math.round(float)返回 int！");
        class A {
            int a = 10;
        }
        Object o = new A();
        A aa = (A)o;
        System.out.println(aa.a);

        String str = "abc";
        if ("abc" == str){
            System.out.println("==");
        }
        if ("abc".equals(str) ){
            System.out.println("equals");
        }
    }
}
