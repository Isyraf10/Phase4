/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;

public abstract class Vehicle {
    private String vehicleId;
    private String vehicleModel;
    private String plateNo;

    public Vehicle(String vehicleId, String vehicleModel, String plateNo) {
        this.vehicleId = vehicleId;
        this.vehicleModel = vehicleModel;
        this.plateNo = plateNo;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
    public abstract String getVehicleInfo();
}

