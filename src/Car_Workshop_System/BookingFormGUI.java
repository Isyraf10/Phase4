package Car_Workshop_System;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class BookingFormGUI extends JFrame {

    private JTextField bookingIdField, dateField, timeField, statusField;
    private JTextField custNameField, custPhoneField;
    private JTextField vehicleModelField, plateNoField;

    private BookingManager bookingManager = new BookingManager();
    private Booking lastSavedBooking = null;

    public BookingFormGUI() {
        setTitle("New Booking Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2, 5, 5));

        add(new JLabel("Booking ID:"));
        bookingIdField = new JTextField();
        add(bookingIdField);

        add(new JLabel("Date (DD-MM-YYYY):"));
        dateField = new JTextField();
        add(dateField);

        add(new JLabel("Time (e.g., 10:00 AM):"));
        timeField = new JTextField();
        add(timeField);

        add(new JLabel("Status:"));
        statusField = new JTextField("Confirmed");
        add(statusField);

        add(new JLabel("Customer Name:"));
        custNameField = new JTextField();
        add(custNameField);

        add(new JLabel("Customer Phone:"));
        custPhoneField = new JTextField();
        add(custPhoneField);

        add(new JLabel("Vehicle Model:"));
        vehicleModelField = new JTextField();
        add(vehicleModelField);

        add(new JLabel("Plate Number:"));
        plateNoField = new JTextField();
        add(plateNoField);

        JButton saveBtn = new JButton("Save Booking");
        JButton viewBtn = new JButton("View Bookings");
        add(saveBtn);
        add(viewBtn);

        saveBtn.addActionListener(e -> saveBooking());
        viewBtn.addActionListener(e -> bookingManager.showBookingsTable());

        setVisible(true);
    }

    private void saveBooking() {
        try {
            if (bookingIdField.getText().isBlank() ||
                dateField.getText().isBlank() ||
                timeField.getText().isBlank() ||
                statusField.getText().isBlank() ||
                custNameField.getText().isBlank() ||
                custPhoneField.getText().isBlank() ||
                vehicleModelField.getText().isBlank() ||
                plateNoField.getText().isBlank()) {
                throw new IllegalArgumentException("All fields must be filled out.");
            }

            if (!custNameField.getText().matches("[A-Za-z ]+")) {
                throw new IllegalArgumentException("Customer name must contain only letters and spaces.");
            }

            if (!custPhoneField.getText().matches("\\d{10,12}")) {
                throw new IllegalArgumentException("Phone number must be 10–12 digits.");
            }

            if (!dateField.getText().matches("\\d{2}-\\d{2}-\\d{4}")) {
                throw new IllegalArgumentException("Date must be in format DD-MM-YYYY.");
            }

            if (!timeField.getText().matches("\\d{1,2}:\\d{2} ?[APap][Mm]")) {
                throw new IllegalArgumentException("Time must be like 10:00 AM or 3:30 PM.");
            }

            Customer customer = new Customer("C" + bookingIdField.getText(), custNameField.getText(), custPhoneField.getText());
            Booking booking = new Booking(
                    bookingIdField.getText(),
                    dateField.getText(),
                    timeField.getText(),
                    statusField.getText(),
                    customer
            );
            Vehicle vehicle = new Car("V" + bookingIdField.getText(), vehicleModelField.getText(), plateNoField.getText());
            booking.setVehicle(vehicle);

            bookingManager.saveBookingToFile(booking);
            lastSavedBooking = booking;

            JOptionPane.showMessageDialog(this, "Booking saved successfully!");
            clearFields();

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Input Error: " + e.getMessage(), "Validation Error", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unexpected Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        bookingIdField.setText("");
        dateField.setText("");
        timeField.setText("");
        statusField.setText("Confirmed");
        custNameField.setText("");
        custPhoneField.setText("");
        vehicleModelField.setText("");
        plateNoField.setText("");
    }

    public Booking getLastSavedBooking() {
        return lastSavedBooking;
    }

    public void clearLastSavedBooking() {
        lastSavedBooking = null;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BookingFormGUI(); // Launch the Booking GUI
        });
    }
}
