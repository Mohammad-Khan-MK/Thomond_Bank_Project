package models;

import java.time.LocalDate;

public class DepositAccount extends Account {
    static double AIR=0.02;

    public DepositAccount(int id, int custNo, double balance, LocalDate dateCreated) {
        super(id, custNo, balance, dateCreated);
    }

    public static double getAIR() {
        return AIR;
    }

    public static void setAIR(double AIR) {
        DepositAccount.AIR = AIR;
    }

    @Override
    public void deposit(double amount) {
        if (amount >0) {
            setBalance(getBalance() + amount);
        }

    }

    @Override
    public void withdraw(double amount) {
        if (amount >0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
        else{
            System.out.println("Insufficient Balance!! Maximum you can withdraw $" + getBalance());
        }

    }
    @Override
    public String toString() {
        return String.format("""
                Deposit Account
                %s AIR: %.2f
                """,super.toString(),getAIR());
                

    }
}
