package com.aln.day2;
public class AccountManager {

    public static void main(String[] args) {
        // TODO Account number : "SB101" deposit 1000 and show details of account
       String accNumber = "SB101";
       double amount = 1000;
       Account account = getAccount(accNumber);
       if(account != null) {
           account.deposit(amount);
           account.showDetails();
       }
       // Get all accounts total balance
        double totalBalance = 0;
        Account[] accounts = getAccounts();
        for(Account account1 : accounts) {
            totalBalance += account1.getBalance();
        }
        System.out.println("Total Balance: " + totalBalance);

        // Add annual fee 5000 if account is having balance less than 50000  otherwise ignore

    }

    public static Account getAccount(String accNumber) {
        Account[] accounts = getAccounts();
        for(Account account : accounts) {
            if(account.getAccNumber().equals(accNumber)) {
                return account;
            }
        }
        return null;
    }

    public static Account[] getAccounts() {
        Account account1 = new Account("SB101", "Krish", 1000000);
        Account account2 = new Account("SB102", "Rajesh", 200000);
        Account account3 = new Account("SB103", "Ramesh", 300000);
        Account account4 = new Account("SB104", "Raj", 400000);
        Account account5 = new Account("SB105", "Ravi", 500000);
        Account account6 = new Account("SB106", "Rahul", 600000);
        Account[] accounts = new Account[]{account1, account2, account3, account4, account5, account6};
        return accounts;
    }
}
