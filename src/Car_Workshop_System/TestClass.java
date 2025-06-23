package Car_Workshop_System;

import java.io.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TestClass {
    public static void main(String[] args) {
        // Step 1: Create core objects
        Customer customer = new Customer("0001", "Aiman", "0186517890");
        Booking booking = new Booking("0001", "30-04-2025", "10:00 AM", "Confirmed", customer);

        Vehicle vehicle = new Car("V001", "Mazda", "TCX-3701");
        booking.setVehicle(vehicle);

        Staff mechanic = new Mechanic("M001", "Smokey Nagata", "017-654-3210");
        booking.setStaff(mechanic);

        Supplier supplier = new Supplier("S001", "AutoParts Inc.", "06-458-4536");

        InventoryItem item1 = new InventoryItem("I001", "Brake Pad", 150.0, 2, supplier);
        InventoryItem item2 = new InventoryItem("I002", "Oil Filter", 30.0, 1, supplier);
        List<InventoryItem> inventoryList = new ArrayList<>();
        inventoryList.add(item1);
        inventoryList.add(item2);
        booking.setInventoryItem(inventoryList);

        Repair repair = new Repair("R001", "30-04-2025", "10:30 AM");
        booking.setRepair(repair);

        Report report = new Report("REP001", 180.0, 3);
        booking.setReport(report);

        // Step 2: Print detailed console output
        System.out.println("===== Booking Details =====");
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Customer: " + customer.getCustName() + " (" + customer.getPhoneNo() + ")");
        System.out.println("Vehicle: " + vehicle.getVehicleInfo());
        System.out.println("Mechanic: " + mechanic.getStaffName());
        System.out.println("Staff Role Description: " + mechanic.getRoleDescription());
        System.out.println("Repair Scheduled: " + repair.getDate() + " at " + repair.getTime());
        System.out.println("Supplier: " + supplier.getSupplierName());
        System.out.println("Parts Used:");
        for (InventoryItem item : inventoryList) {
            System.out.println("- " + item.getItemName() + " x" + item.getItemQuantity() + " @ RM" + item.getItemPrice());
        }
        System.out.println("Total Price (from report): RM" + report.getPrice());

        // Step 3: Save booking to file (for GUI viewing later)
        saveBookingToFile(booking);
    }

    private static void saveBookingToFile(Booking booking) {
        String filePath = "bookings.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String bookingDetails = String.format(
                "BookingID: %s | Customer: %s | Vehicle: %s %s | Date: %s | Time: %s\n",
                booking.getBookingId(),
                booking.getCustomer().getCustName(),
                booking.getVehicle().getVehicleModel(),
                booking.getVehicle().getPlateNo(),
                booking.getDate(),
                booking.getTime()
            );
            writer.write(bookingDetails);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving booking to file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}