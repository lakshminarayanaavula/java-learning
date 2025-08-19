package com.aln.day1;

public class EmiCalculator {

    public static void main(String[] args) {
            double loanAmount = 1000000.0;
            int tenureInMonths = 36;
            double interestRate = 16.0;
            calculateAndShowEmiDetails(loanAmount, tenureInMonths, interestRate);
    }

    public static void calculateAndShowEmiDetails(double loanAmount, int tenureInMonths, double interestRate) {
            double r = interestRate / (12 * 100);
            double emi =loanAmount * r * (Math.pow(1 + r, tenureInMonths) / (Math.pow(1 + r, tenureInMonths) - 1));
            double totalInterest = emi * tenureInMonths - loanAmount;
            System.out.println("EMI: " + Math.round(emi));
            System.out.println("Total Interest: " + Math.round(totalInterest));
            System.out.println("Total Payment: " + Math.round(emi * tenureInMonths));
    }
}
