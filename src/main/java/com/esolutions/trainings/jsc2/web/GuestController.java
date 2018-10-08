package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.logic.GuestRepeatedService;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestController {
    private final GuestRepeatedService service;

    @Autowired
    public GuestController(GuestRepeatedService service) {
		this.service = service;
	}

    @RequestMapping(method = RequestMethod.GET, path = "/guests/last-name/repeated")
    public List<Guest> repeatedLastName() {
        List<Guest> guests=this.service.alphabeticallySortedRepeatedGuestsByLastName();
        return guests;
    }
}