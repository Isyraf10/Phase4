package Car_Workshop_System;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;

public class BookingManager {

    public void saveBookingToFile(Booking booking) {
        String filePath = "bookings.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            String bookingDetails = String.format(
                "BookingID: %s | Customer: %s | Vehicle: %s | Date: %s | Time: %s\n",
                booking.getBookingId(),
                booking.getCustomer().getCustName(),
                booking.getVehicle().getVehicleModel() + " " + booking.getVehicle().getPlateNo(),
                booking.getDate(),
                booking.getTime()
            );
            writer.write(bookingDetails);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving booking: " + e.getMessage());
        }
    }

    public void showBookingsTable() {
        JFrame frame = new JFrame("Existing Bookings");
        frame.setSize(600, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {"Booking ID", "Customer", "Vehicle", "Date", "Time"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        try (BufferedReader reader = new BufferedReader(new FileReader("bookings.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] parts = line.split(" \\| ");
                    if (parts.length == 5) {
                        String bookingId = parts[0].split(": ")[1];
                        String customer = parts[1].split(": ")[1];
                        String vehicle = parts[2].split(": ")[1];
                        String date = parts[3].split(": ")[1];
                        String time = parts[4].split(": ")[1];
                        model.addRow(new Object[]{bookingId, customer, vehicle, date, time});
                    }
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error reading bookings: " + e.getMessage());
        }

        JTable table = new JTable(model);
        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }
}
