package com.hackerrank;

interface Foo {
    int bar = 42;
    void go();
    /*
     * Static interface methods
     * Declared by using static keyword
     * Are public by default and public is optional
     * cannot be marked private, protected, final or abstract
     * must have concrete body
     * when invoking, method's type (their interface) must be included
     */
    static void helloWorld() {
        System.out.println("hello world");
    }
}
