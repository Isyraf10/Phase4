/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

public class Car extends Vehicle{
    public Car(String vehicleId, String vehicleModel, String plateNo){
        super(vehicleId, vehicleModel, plateNo);
}
    @Override
    public String getVehicleInfo() {
        return "Car Model: " + getVehicleModel() + ", Plate: " + getPlateNo();
    }
}
