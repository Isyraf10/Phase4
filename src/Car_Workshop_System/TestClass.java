package Car_Workshop_System;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) {
        // Step 1: Create core objects (Just a hardcode for a receiption) (the GUI input at the BookingFormGUI)
        Customer customer = new Customer("C003", "Isyraf Aiman", "0186517890");
        Booking booking = new Booking("0003", "30-04-2025", "10:00 AM", "Completed", customer); // Status now shows "Completed"

        Vehicle vehicle = new Car("V003", "Mazda", "TCX 3701");
        booking.setVehicle(vehicle);

        Staff mechanic = new Mechanic("M003", "Smokey Nagata", "017-654-3210");
        booking.setStaff(mechanic);

        Supplier supplier = new Supplier("S003", "AutoParts Inc.", "06-458-4536");

        InventoryItem item1 = new InventoryItem("I003", "Brake Pad", 150.0, 2, supplier);
        InventoryItem item2 = new InventoryItem("I003", "Oil Filter", 30.0, 1, supplier);
        List<InventoryItem> inventoryList = new ArrayList<>();
        inventoryList.add(item1);
        inventoryList.add(item2);
        booking.setInventoryItem(inventoryList);

        Repair repair = new Repair("R003", "23-06-2025", "10:45 AM");
        booking.setRepair(repair);

        Report report = new Report("REP003", 180.0, 3);
        booking.setReport(report);

        // Step 2: Print to console
        if (booking.getStatus().equalsIgnoreCase("Completed")) {
            System.out.println("=====  Completed Maintenance Task =====");
        } else {
            System.out.println("=====  Upcoming Booking =====");
        }

        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Customer: " + customer.getCustName() + " (" + customer.getPhoneNo() + ")");
        System.out.println("Vehicle: " + vehicle.getVehicleInfo());
        System.out.println("Mechanic: " + mechanic.getStaffName());
        System.out.println("Staff Role Description: " + mechanic.getRoleDescription());
        System.out.println("Repair Scheduled: " + repair.getDate() + " at " + repair.getTime());
        System.out.println("Supplier: " + supplier.getSupplierName());
        System.out.println("Parts Used:");
        for (InventoryItem item : inventoryList) {
        System.out.printf("- %s x%d @ RM%.2f%n", item.getItemName(), item.getItemQuantity(), item.getItemPrice());
}
        System.out.printf("Total Price (from report): RM%.2f%n", report.getPrice());

        // Step 3: Save to appropriate file
        saveBookingToFile(booking);
    }

    private static void saveBookingToFile(Booking booking) {
        String filePath;

        if (booking.getStatus().equalsIgnoreCase("Completed")) {
            filePath = "completed_bookings.txt";
        } else {
            filePath = "bookings.txt";
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String bookingDetails = String.format(
                "BookingID: %s | Status: %s | Customer: %s | Vehicle: %s %s | Date: %s | Time: %s\n",
                booking.getBookingId(),
                booking.getStatus(),
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
