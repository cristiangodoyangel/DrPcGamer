package com.drpcgamer.service;

import com.drpcgamer.model.Appointment;
import com.drpcgamer.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final List<Integer> availableHours = Arrays.asList(9, 10, 11, 12, 17, 18, 19, 20);

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public List<LocalTime> getAvailableTimesForDate(LocalDate date) {
        List<LocalTime> bookedTimes = appointmentRepository.findByDateTimeBetween(
                date.atStartOfDay(),
                date.atTime(23, 59)
            ).stream()
            .map(appointment -> appointment.getDateTime().toLocalTime())
            .collect(Collectors.toList());

        return availableHours.stream()
            .map(hour -> LocalTime.of(hour, 0))
            .filter(time -> !bookedTimes.contains(time))
            .collect(Collectors.toList());
    }

    public void saveAppointment(Appointment appointment) {
        if (appointmentRepository.existsByDateTime(appointment.getDateTime())) {
            throw new RuntimeException("El horario seleccionado ya está reservado");
        }
        appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
