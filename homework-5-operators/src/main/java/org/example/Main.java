package org.example;

public class Main {
    public static void main(String[] args) {
        int intVal1 = 6;
        int intVal2 = 24;
        int intVal3 = 1;
        int intVal4 = 45;

        int sum1 = intVal1 + intVal2;
        int sum2 = intVal3 + intVal4;

        boolean isFirstSumLess = sum1 < sum2;
        System.out.println("Is the first sum less? " + isFirstSumLess);

        sum1++;
        sum2 -= 2;

        boolean isFirstSumGreater = sum1 > sum2;
        System.out.println("Is the first sum greater? " + isFirstSumGreater);

        boolean isAnySumMultipleOfTwo = sum1 % 2 == 0 || sum2 % 2 == 0;
        System.out.println("Is any sum multiple of two? " + isAnySumMultipleOfTwo);
    }
}
