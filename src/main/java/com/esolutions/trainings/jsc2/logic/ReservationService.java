package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.db.ReservationRepository;
import com.esolutions.trainings.jsc2.model.ejercicio2.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository repository;

    @Autowired
    public ReservationService(ReservationRepository repository) {
        this.repository = repository;
    }

    public List<Reservation> SortedReservationsById() {
        final List<Reservation> allReservations = this.repository.findAll();
        return allReservations;

        //comentario de prueba
        //Write your code here!
    }

    public void Reserve(Reservation r){
        this.repository.save(r);
    }
}