package com.esolutions.trainings.jsc2.logic;
import com.esolutions.trainings.jsc2.model.ejercicio5.Huesped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class GuestRepeatedService {
		private final JpaRepository<Huesped, Long> repository;

        @Autowired
        public GuestRepeatedService(JpaRepository<Huesped, Long> repository) {
            this.repository = repository;
        }

	public ArrayList<Huesped> alphabeticallySortedRepeatedGuestsByLastName() {
		final ArrayList<Huesped> allHuespeds = (ArrayList<Huesped>) this.repository.findAll();
		return allHuespeds;
	}



}