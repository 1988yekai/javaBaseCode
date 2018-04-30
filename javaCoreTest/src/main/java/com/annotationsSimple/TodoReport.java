package com.annotationsSimple;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018-04-18.
 */
public class TodoReport {
    public static void main(String[] args) {
        getTodoReportForBusinessLogic();

    }

    private static void getTodoReportForBusinessLogic() {
        Class businessLogicClass = BusinessLogic.class;
        Method[] methods = businessLogicClass.getMethods();
        for (Method method : methods) {
            Todo todoAnnotation = method.getAnnotation(Todo.class);
            if (todoAnnotation != null) {
                System.out.println("Method name: " + method.getName());
                System.out.println("Priority: " + todoAnnotation.priority());
                System.out.println("Author: " + todoAnnotation.author());
                System.out.println("Status: " + todoAnnotation.status());
                System.out.println("=========================");
            }
        }
    }
}
