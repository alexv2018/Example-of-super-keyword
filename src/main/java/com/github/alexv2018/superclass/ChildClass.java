package com.github.alexv2018.superclass;

/**
 * Created by vendin on 18.10.2017.
 */
public class ChildClass extends SuperClass {
    private String str;

    public ChildClass(String str) {
        super();
        this.str = str;
        this.test();
        super.test();
    }

    @Override
    public void test() {
        System.out.println("child class test method");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
