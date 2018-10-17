package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.logic.GuestRepeatedService;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GuestController {
    private final GuestRepeatedService service;

    @Autowired
    public GuestController(GuestRepeatedService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/guests/last-name/repeated")
    public List<GuestResponse> repeatedLastName() {
        List<Guest> guests = this.service.alphabeticallySortedRepeatedGuestsByLastName();
        ArrayList<GuestResponse> guestsResponse = new ArrayList<>();
        for (int i = 0; i < guests.size(); i++) {
            Guest guestAux = guests.get(i);
            long idAux=guestAux.getId();
            GuestResponse guest = new GuestResponse((int)idAux);
            guestsResponse.add(guest);
            //return new GuestResponse(null);

            //return guests;
        }
        return guestsResponse;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/guests/last-name/repeated5")
    public List<GuestResponse> repeatedLastName5() {
        List<Guest> guests = this.service.alphabeticallySortedRepeatedGuestsByLastName();
        ArrayList<GuestResponse> guestsResponse = new ArrayList<>();
        for (int i = 0; i < guests.size(); i++) {
            Guest guestAux = guests.get(i);
            long idAux=guestAux.getId();
            GuestResponse guest = new GuestResponse((int)idAux);
            guestsResponse.add(guest);
            //return new GuestResponse(null);

            //return guests;
        }
        return guestsResponse;
    }



}