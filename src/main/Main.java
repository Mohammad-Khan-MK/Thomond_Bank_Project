package main;

import models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DepositAccount d1= new DepositAccount(1,101,0, LocalDate.now());
        System.out.println(d1);
        d1.deposit(1000.00);
        d1.withdraw(1550.00);
        System.out.println(d1);



        Customer c1= new Customer("mohammad", "khan", "504 Richmond Court",LocalDate.of(1983,10,13),101);

        Customer c2= new Customer("moh", "saif", "500 Richmond Court",LocalDate.of(1980,10,11),102);
        System.out.println(c2);

        System.out.println(c1);

        BankManager b1=new BankManager("hella","uddin","504 Richmond court",LocalDate.of(1980,10,27),108,"Senior Bank Manager");
        System.out.println(b1);

        BankOfficer bo1=new BankOfficer("nasier","uddin","101 nakhal para",LocalDate.of(1980,2,24),1001,"Office Secretary");
        System.out.println(bo1);


    }
}
