package com.traffic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ViolationRepository extends JpaRepository<ViolationRecord, Integer> {
}