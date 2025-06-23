/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Car_Workshop_System;


public class Repair {
    private String repairId;
    private String date;
    private String time;

    public Repair(String repairId, String date, String time) {
        this.repairId = repairId;
        this.date = date;
        this.time = time;
    }

    public String getRepairId() {
        return repairId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}