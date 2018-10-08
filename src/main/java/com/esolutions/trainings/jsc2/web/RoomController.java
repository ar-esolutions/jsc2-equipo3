package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.Ejercicio1.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class RoomController {
    Hotel hotel = new Hotel(50000);

    @GetMapping(value = "/floors/{floor}/rooms/{room}")
    public GuestResponse getGuestNumber(@PathVariable int floor, @PathVariable int room){

        return new GuestResponse(Hotel.getGuest(floor,room));
    }
}
