package com.esolutions.trainings.jsc2.logic;
import com.esolutions.trainings.jsc2.model.ejercicio2.Guest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class GuestRepeatedService {
		private final JpaRepository<Guest, Long> repository;

        @Autowired
        public GuestRepeatedService(JpaRepository<Guest, Long> repository) {
            this.repository = repository;
        }

	public ArrayList<Guest> alphabeticallySortedRepeatedGuestsByLastName() {
		final ArrayList<Guest> allGuests = (ArrayList<Guest>) this.repository.findAll();
		return allGuests;
	}



}