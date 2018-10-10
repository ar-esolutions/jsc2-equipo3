package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.logic.GuestRepeatedService;
import com.esolutions.trainings.jsc2.logic.RoomService;
import com.esolutions.trainings.jsc2.model.Ejercicio1.Hotel;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Lista;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Reservation;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.GregorianCalendar;
import java.util.Calendar;
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

    @GetMapping(value = "/floors/{floor}/rooms/{room}/book")
    public String getReq2(@PathVariable int floor, @PathVariable int room) {
        Lista lista = new Lista();
        String res = "";
        Calendar in = new GregorianCalendar();
        in.set(2018, 9, 3); //ingresando mes 10, devuelve Noviembre.

        Calendar out = new GregorianCalendar();
        out.set(2018, 9, 19);//ingresando mes 10, devuelve Noviembre.

        Date i = in.getTime();
        Date o = out.getTime();

        long id = 0; // aqui consultar a bd
        int f = floor;
        int n = room; // aqui consultar a bd
        String t = ""; // aqui consultar a bd

        Room ro = new Room(id, f, n, t);
        Reservation r = new Reservation(id, i, o, ro);
        res= ""+r.calcularPrecio(ro);
        lista.agregarAlInicio(r);
        //aqui falta insert de reserva a BD

        return res;
    }
}
