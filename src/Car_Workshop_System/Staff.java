/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Car_Workshop_System;

public abstract class Staff {
    private String staffId;
    private String staffName;
    private String phoneNo;

    public Staff(String staffId, String staffName, String phoneNo) {
        this.staffId=staffId;
        this.staffName = staffName;
        this.phoneNo = phoneNo;
    }
    
    public String getStaffID() {
        return staffId;
    }

    public void setStaffID(String staffId) {
        this.staffId = staffId;
    }
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getRoleDescription() {
    return "Staff role: General duties.";
}
}
