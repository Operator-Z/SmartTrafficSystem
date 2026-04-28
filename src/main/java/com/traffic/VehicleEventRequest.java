package com.traffic;

public class VehicleEventRequest {
    private String vehicleId;
    private double speed;
    private String zone;
    private boolean emergency;

    // Getters and Setters
    public String getVehicleId() { return vehicleId; }
    public void setVehicleId(String v) { this.vehicleId = v; }
    public double getSpeed() { return speed; }
    public void setSpeed(double s) { this.speed = s; }
    public String getZone() { return zone; }
    public void setZone(String z) { this.zone = z; }
    public boolean isEmergency() { return emergency; }
    public void setEmergency(boolean e) { this.emergency = e; }
}