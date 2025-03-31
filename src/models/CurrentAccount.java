package models;

import java.time.LocalDate;

public  class CurrentAccount extends Account {

  static double AIR=0.005;
  static double overdraft=0;

    public CurrentAccount(int id, int custNo, double balance, LocalDate dateCreated) {
        super(id, custNo, balance, dateCreated);


    }

    public static double getOverdraft() {
        return overdraft;
    }

    public static void setOverdraft(double overdraft) {
        CurrentAccount.overdraft = overdraft;
    }

    public static double getAIR() {
        return AIR;
    }

    public static void setAIR(double AIR) {
        CurrentAccount.AIR = AIR;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public String toString() {
       return String.format("""
               Current Account
               %s AIR : %.2f
               """,super.toString(),getAIR());
    }
}
