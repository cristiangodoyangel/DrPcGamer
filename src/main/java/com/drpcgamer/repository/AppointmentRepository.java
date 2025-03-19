package com.drpcgamer.repository;

import com.drpcgamer.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    boolean existsByDateTime(LocalDateTime dateTime);
    List<Appointment> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);
}
