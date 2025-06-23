/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

import java.util.List;

public class Booking {
    private String bookingId;
    private String date;
    private String time;
    private String status;

    private Customer customer;//Composition
    
    private Vehicle vehicle; //association (not composition)
    private Staff staff;
    private Supplier supplier;
    private Repair repair;
    private Report report;
    private List<InventoryItem> carParts;

    public Booking(String bookingId, String date, String time, String status, Customer customer) {
        this.bookingId = bookingId;
        this.date = date;
        this.time = time;
        this.status = status;
        this.customer = customer; //Composition (Booking owns Customer
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setRepair(Repair repair) {
        this.repair = repair;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public void setInventoryItem(List<InventoryItem> inventoryItem) {
        this.carParts = inventoryItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Staff getStaff() {
        return staff;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Repair getRepair() {
        return repair;
    }

    public Report getReport() {
        return report;
    }

    public List<InventoryItem> getInventoryItem() {
        return carParts;
    }
}

   