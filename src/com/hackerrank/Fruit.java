package com.hackerrank;

public class Fruit {
    static void someMethod() {
        System.out.println("some method in parent");
    }

    public Fruit() {
        super();
        System.out.println("fruit from parent");
    }

    public Fruit(String fruitName) {
        System.out.println("fruit name: "+fruitName);
    }

    /*
     * setting default in parent and protected in child will override
     * Since default is weaker access than protected, therefore it will work
     * on the other hand - other way around will not work.
     */
    protected void someOtherMethod() {
        System.out.println("Some other method");
    }

    {System.out.println("block from parent");}
}
