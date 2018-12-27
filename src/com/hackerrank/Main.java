package com.hackerrank;

import java.util.Arrays;

public class Main {
    static int number1 = 0;
    public static void main(String[] args) {
	// write your code here
        Zap apple = new Zap();
        Class toCompare = Zap.class;
        if (apple.getClass().equals(toCompare)) {
            System.out.println("matches");
        }
        else {
            System.out.println("bongi");
        }
    }

    /*
     *
     */
    public static void getsCastExceptionWhenTriesToCastStringArray() {
        String[][] strings = {{"A", "Z"}, {"C", "D", "S"}, {"L"}};
        Arrays.sort(strings);
        for(String[] str : strings) {
            for (String s : str) {
                System.out.print(s);
            }
        }
    }

    /*
     * Given int[] ints = new int[0b101];
     * has initialized that to length 5
     */

    public static void intInitializationWithBin() {
        int[] ints = new int[0b101];
        int len = ints.length;

        System.out.println(ints.length);
        for (int i : ints) {
            System.out.println(i);
        }
    }

    /*
     * Adding a leading 0 with int initialization will give an octal number
     */
    public static void javaLesson0Prefix() {
        int[] a = {1, 2, 053, 4};
        int b[][] = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};
        System.out.print(a[3] == b[0][2]);
        System.out.println(" " + (a[2] == b[2][1]));
        System.out.println(a[2]);
        System.out.println(b[2][1]);

        int c = 011;
        System.out.print(c);
    }
}
