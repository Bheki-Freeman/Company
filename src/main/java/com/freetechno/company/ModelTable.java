package com.freetechno.company;

public class ModelTable {
    private String first_name;
    private String middle_name;
    private String last_name;
    private String address;
    private char gender;
    private String ssn;
    private String mgr_ssn;
    private int department_no;
    private String birthday;
    private double salary;

    //Constructor
    public ModelTable(String first_name, String middle_name, String last_name,  String ssn, String birthday, String address, char gender, String mgr_ssn, double salary, int department_no){
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.address = address;
        this.gender = gender;
        this.ssn = ssn;
        this.mgr_ssn = mgr_ssn;
        this.department_no = department_no;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMgr_ssn() {
        return mgr_ssn;
    }

    public void setMgr_ssn(String mgr_ssn) {
        this.mgr_ssn = mgr_ssn;
    }

    public int getDepartment_no() {
        return department_no;
    }

    public void setDepartment_no(int department_no) {
        this.department_no = department_no;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
