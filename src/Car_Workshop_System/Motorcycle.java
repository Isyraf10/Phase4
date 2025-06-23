/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

public class Motorcycle extends Vehicle{
    public Motorcycle(String vehicleId, String vehicleModel, String plateNo){
        super(vehicleId, vehicleModel, plateNo);
}
    @Override
    public String getVehicleInfo() {
        return "Motorcycle Model: " + getVehicleModel() + ", Plate: " + getPlateNo();
    }
}