package com.yek.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018-4-17.
 */
public class LambdaTest {
    @Test
    public void test1(){
        new Thread(() -> System.out.println("I am good man!")).start();
        // Java 8之后：
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
        // 看起来像C++的作用域解析运算符
        features.forEach(System.out::println);
    }
}
