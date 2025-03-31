package models;


import java.time.LocalDate;

public abstract class BankStaff extends Person {

    private int empNo;
    private String jobTitle;
    public BankStaff(String firstName, String lastName, String address, LocalDate dob, int empNo, String jobTitle) {
        super(firstName, lastName, address, dob);
        this.empNo = empNo;
        this.jobTitle = jobTitle;


    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }



    @Override
    public String toString() {
        return String.format("""
                Bank Staff
                %s
                Emp No:%d
                Job Title:%s
                """,super.toString(),getEmpNo(),getJobTitle());


    }
}
