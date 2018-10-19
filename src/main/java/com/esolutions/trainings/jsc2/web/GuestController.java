package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.logic.GuestRepeatedService;
import com.esolutions.trainings.jsc2.model.ejercicio5.Huesped;
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
        List<Huesped> huespeds = this.service.alphabeticallySortedRepeatedGuestsByLastName();
        ArrayList<GuestResponse> guestsResponse = new ArrayList<>();
        for (int i = 0; i < huespeds.size(); i++) {
            Huesped huespedAux = huespeds.get(i);
            long idAux= huespedAux.getId();
            GuestResponse guest = new GuestResponse((int)idAux);
            guestsResponse.add(guest);
            //return new GuestResponse(null);

            //return huespeds;
        }
        return guestsResponse;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/guests/last-name/repeated5")
    public List<GuestResponse> repeatedLastName5() {
        List<Huesped> huespeds = this.service.alphabeticallySortedRepeatedGuestsByLastName();
        ArrayList<GuestResponse> guestsResponse = new ArrayList<>();
        for (int i = 0; i < huespeds.size(); i++) {
            Huesped huespedAux = huespeds.get(i);
            long idAux= huespedAux.getId();
            GuestResponse guest = new GuestResponse((int)idAux);
            guestsResponse.add(guest);
            //return new GuestResponse(null);

            //return huespeds;
        }
        return guestsResponse;
    }



}