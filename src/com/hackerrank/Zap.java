package com.hackerrank;

class Zap extends Fruit implements Run, Foo{
    protected static void someMethod() {
        System.out.println("Some method in child class");
    }

    public Zap() {
        System.out.println("fruit from child");
    }

    public final void someOtherMethod() {
        System.out.println("Some other method in child");
    }

    public int getSpeed() {
        return 9;
    }

    {System.out.println("block from child");}

    static {System.out.println("static from child");}
}
