package com.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employee_details")
public class Employee {
    
    @Id
    @Column(name="employee_id")
    private int employee_id;
    
    @Column(name="employee_firstname")
    private String employee_firstname;
    
    @Column(name="employee_lastname")
    private String employee_lastname;
    
    @Column(name="address")
    private String address;
    
    @Column(name="pincode")
    private int pincode;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_firstname() {
        return employee_firstname;
    }

    public void setEmployee_firstname(String employee_firstname) {
        this.employee_firstname = employee_firstname;
    }

    public String getEmployee_lastname() {
        return employee_lastname;
    }

    public void setEmployee_lastname(String employee_lastname) {
        this.employee_lastname = employee_lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
