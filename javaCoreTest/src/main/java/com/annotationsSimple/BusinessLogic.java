package com.annotationsSimple;

/**
 * Created by Administrator on 2018-04-18.
 */
public class BusinessLogic {
    public void completedMethod(){
        System.out.println("completedMethod");
    }

    @Todo(priority = Todo.Priority.HIGH)
    public void notYetStarted(){
        // No Code Written yet
    }
    @Todo(priority = Todo.Priority.MEDIUM,author = "yek11",status = Todo.Status.RUN)
    public void incompleteMethod1(){
         //Some business logic is written
        //But its not complete yet
    }
    @Todo(priority = Todo.Priority.LOW, status = Todo.Status.NO_RUN)
    public void incompleteMethod2(){
        //Some business logic is written
        //But its not complete yet
    }
}
