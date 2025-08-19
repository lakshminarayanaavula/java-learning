package com.aln.day1;

public class MultiplicationOfTable {

    public static void main(String[] args) {
        int inputNum = 15;
        multiplicationOfTable(inputNum);
        NumberOperations numberOperations = new NumberOperations();
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int biggestNumber = numberOperations.biggest(num1, num2, num3);
        System.out.println("Biggest of " + num1 + ", " + num2 + " and " + num3 + " is " + biggestNumber);

    }

    public static void multiplicationOfTable(int num) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
