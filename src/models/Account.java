package models;

import java.time.LocalDate;

public abstract class Account {
    private int id;
    private int custNo;
    private double balance;
    private LocalDate dateCreated;

    public Account(int id, int custNo, double balance, LocalDate dateCreated) {
        this.id = id;
        this.custNo = custNo;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustNo() {
        return custNo;
    }

    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return String.format("""
                id: %d, custNo: %d, balance: %.2f , dateCreated: %s
                """,getId(),getCustNo(),getBalance(),getDateCreated());
    }
}

