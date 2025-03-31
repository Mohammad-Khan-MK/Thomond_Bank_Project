package models;

import java.time.LocalDate;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate dob;


    public Person(String firstName, String lastName, String address, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return String.format("""
                First Name: %s
                Last Name: %s
                Address: %s
                Dob: %s
                """,getFirstName(),getLastName(),getAddress(),getDob());
    }
}
