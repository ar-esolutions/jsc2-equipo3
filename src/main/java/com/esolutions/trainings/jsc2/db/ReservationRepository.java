package com.esolutions.trainings.jsc2.db;

import com.esolutions.trainings.jsc2.model.ejercicio2.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}