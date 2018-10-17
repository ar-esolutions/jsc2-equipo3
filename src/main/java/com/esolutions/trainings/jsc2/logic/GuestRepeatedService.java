package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.db.GuestRepository;
import com.esolutions.trainings.jsc2.model.Ejercicio5.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestRepeatedService {
	private final GuestRepository repository;

	@Autowired
	public GuestRepeatedService(GuestRepository repository) {
		this.repository = repository;
	}

	public List<Guest> alphabeticallySortedRepeatedGuestsByLastName() {
		final List<Guest> allGuests = this.repository.findAll();
		return allGuests;
    //comentario de prueba
		//Write your code here!


	}



}

