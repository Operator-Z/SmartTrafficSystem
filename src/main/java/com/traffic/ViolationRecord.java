package com.traffic;

import jakarta.persistence.*;

@Entity
@Table(name = "violations")
public class ViolationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String vehicleId;
    private double speed;
    private String zone;
    private int fine;

    // Constructors
    public ViolationRecord() {}
    public ViolationRecord(String vehicleId, double speed, String zone, int fine) {
        this.vehicleId = vehicleId;
        this.speed = speed;
        this.zone = zone;
        this.fine = fine;
    }

    // Getters and Setters for all fields
    public int getId() { return id; }
    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String vehicleId) { this.vehicleId = vehicleId; }
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }
    public String getZone() { return zone; }
    public void setZone(String zone) { this.zone = zone; }
    public int getFine() { return fine; }
    public void setFine(int fine) { this.fine = fine; }
}