/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;


public class Supplier {
    private String supplierId;
    private String supplierName;
    private String phoneNo;

    public Supplier(String supplierId, String supplierName, String phoneNo) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.phoneNo = phoneNo;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }   
}
