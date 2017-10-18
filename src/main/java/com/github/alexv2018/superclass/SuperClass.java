package com.github.alexv2018.superclass;

/**
 * Created by vendin on 18.10.2017.
 */
public class SuperClass implements DefaultInterface {
    private int i;

    public SuperClass() {
    }

    public SuperClass(int i) {
        this.i = i;
    }


    @Override
    public void test() {
        System.out.println("super class test method");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
