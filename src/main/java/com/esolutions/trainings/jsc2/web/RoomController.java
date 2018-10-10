package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.logic.GuestRepeatedService;
import com.esolutions.trainings.jsc2.logic.RoomService;
import com.esolutions.trainings.jsc2.model.Ejercicio1.Hotel;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Reservation;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.util.Date;


@RestController
public class RoomController {
    Hotel hotel = new Hotel(50000);
    private final RoomService service;

    @Autowired
    public RoomController(RoomService service) {
        this.service = service;
    }

    @GetMapping(value = "/floors/{floor}/rooms/{room}")
    public GuestResponse getGuestNumber(@PathVariable int floor, @PathVariable int room){
        return new GuestResponse(hotel.getGuest(floor-1,room-1));
    }

    @PostMapping(value = "/floors/{floor}/rooms/{room}/book")
    public String getReq2(@PathVariable Long floor, @PathVariable Long room, @RequestParam Date checkin, @RequestParam Date checkout) {

        String res = "";
        //Calendar in = new GregorianCalendar();
        //in.set(2018, 9, 3); //ingresando mes 10, devuelve Noviembre.

        //Calendar out = new GregorianCalendar();
        //out.set(2018, 9, 19);//ingresando mes 10, devuelve Noviembre.

        //Date i = in.getTime();
        //Date o = out.getTime();

        Room ro = service.FindRoomByFloorAndNro(floor, room);
        Long id=(long)0;
        Reservation r = new Reservation(id, checkin, checkout, ro);
        res= ""+r.calcularPrecio(ro);
        //lista.agregarAlInicio(r);
        //aqui falta insert de reserva a BD

        return res;
    }
}
