/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

public class Mechanic extends Staff{
    public Mechanic(String staffId, String staffName, String phoneNo) {
        super( staffId, staffName, phoneNo);
    }
    @Override
    public String getRoleDescription() {
    return "Mechanic (Handles vehicle repairs and maintenance.)";
}
    public void displayDetails() {
    System.out.println("Mechanic ID: " + getStaffID());
    System.out.println("Name: " + getStaffName());
    System.out.println("Phone: " + getPhoneNo());
    System.out.println("Role: " + getRoleDescription());
}
}