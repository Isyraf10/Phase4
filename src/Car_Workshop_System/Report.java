/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

public class Report {
    private String reportId;
    private double price;
    private int quantity;

    public Report(String reportId, double price, int quantity) {
        this.reportId = reportId;
        this.price = price;
        this.quantity = quantity;
    }

    public String getReportId() {
        return reportId;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}