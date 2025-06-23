/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

public class Customer {
    private String custId;
    private String custName;
    private String phoneNo;

    public Customer(String custId, String custName, String phoneNo) {
        this.custId=custId;
        this.custName = custName;
        this.phoneNo = phoneNo;
    }
    
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void displayDetails() {
    System.out.println("Customer ID: " + custId);
    System.out.println("Name: " + custName);
    System.out.println("Phone: " + phoneNo);
}
}
