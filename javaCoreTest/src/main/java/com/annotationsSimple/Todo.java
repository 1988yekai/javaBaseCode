package com.annotationsSimple;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2018-04-18.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    public enum Priority {LOW,MEDIUM,HIGH}
    public enum Status {RUN,NO_RUN}

    String author() default "yek";
    Priority priority() default Priority.LOW;
    Status status() default Status.RUN;

}
