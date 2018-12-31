package com.hackerrank;

import java.util.Arrays;
import static java.lang.System.*;

public class Main {
    static int number1 = 0;
    static int x = 013;
    static Integer I;
    {System.out.println("Whiz");}

    static {System.out.println("Static");}

    public static void main(String[] args) {
	// write your code here
        Main ma = new Main();
        ma.divisor(22);
    }

    void divisor(final int i) {
        System.out.println(i/x);
    }

    /*
     * String equals
     */
    public static void stringEquals() {
        String s1 = "Rekha";
        //String s2 = "Rekha";
        String s2 = new String("Rekha");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
    /*
     * Binary XOR Operator copies the bit if it is set in one operand but not both.
     */
    public static void binaryXor() {
        System.out.println(true^false);
        System.out.println(true ^ (true|false));
    }
    /*
     * printing numbers
     */
    public static void printingNumbers() {
        System.out.print(""+1+2);
        System.out.println(""+(1+2));
    }
    /*
     * if the else
     */
    public static void testIfThenElse() {
        String out = "0";
        int i = -1, j = -5;
        if (i < 5)
            if (j > 0)
                if (i < j)
                    out += "1";
                else out += "2";
            else out += "3";
        else out += "4";
        System.out.println(out);
    }

    /*
     * looping
     */

    public static void loopingQuesiton() {
        for (int x = 10, y = 20; x -->y;) {
            System.out.println(x);
            System.out.println(y);
        }
    }

    /*
     * Brain teaser
     */
    public static void brainTeaser() {
        for (int x = 9; x > 0; x--) {
            for (int y = 8; x > y; y++) {
                System.out.print(x+y);
            }
        }
    }
    /*
     * Casting
     */
    public static void upAndDownCast() {
        Object obj = new Double(3);
        Number num = (Number)obj;
        System.out.println(num);
    }

    /*
     * Program flow
     */
    public static void programFlow(String[] args) {
        String s;
        try {
            s = I.toString();
        } finally {
            try {
                int i = Integer.parseInt(args[0]);
            } catch (NumberFormatException nfe) {
                System.out.print("Number format exception ");
            } finally {
                System.out.println("Fin2");
            }
            System.out.println("Fin1");
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