/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

public class InventoryItem {
    private String itemId;
    private String itemName;
    private double itemPrice;
    private int itemQty;
    private Supplier supplier; //Composition

    public InventoryItem(String itemId, String itemName, double itemPrice, int itemQty, Supplier supplier) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;
        this.supplier = supplier;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQty;
    }
    public Supplier getSupplier() {
        return supplier;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemQuantity(int itemQty) {
        this.itemQty = itemQty;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
