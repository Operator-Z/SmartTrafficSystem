package com.traffic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/traffic")
@CrossOrigin(origins = "*")
public class TrafficController {

    @Autowired
    ViolationRepository repo;

    // Process a vehicle event
    @PostMapping("/process")
    public String processEvent(@RequestBody VehicleEventRequest req) {
        boolean isViolation = req.getSpeed() > 80 && !req.isEmergency();

        if (!isViolation) return "No violation detected.";

        int fine;
        if (req.getSpeed() > 120) fine = 5000;
        else if (req.getSpeed() > 100) fine = 2000;
        else fine = 1000;

        ViolationRecord record = new ViolationRecord(
            req.getVehicleId(), req.getSpeed(), req.getZone(), fine
        );
        repo.save(record);

        return "Violation recorded! Fine: ₹" + fine;
    }

    // Get all violations
    @GetMapping("/violations")
    public List<ViolationRecord> getAllViolations() {
        return repo.findAll();
    }
}