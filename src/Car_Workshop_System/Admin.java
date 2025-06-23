/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

   public class Admin extends Staff {
       
    public Admin(String staffId, String staffName, String phoneNo) {
        super( staffId, staffName, phoneNo);
    }
    @Override
    public String getRoleDescription() {
    return "Admin (Manages bookings, inventory, and schedules.)";
}
}

