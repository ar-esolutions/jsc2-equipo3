package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.Ejercicio1.Hotel;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Reservation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;


@RestController
public class RoomController {
    Hotel hotel = new Hotel(50000);

    @GetMapping(value = "/floors/{floor}/rooms/{room}")
    public GuestResponse getGuestNumber(@PathVariable int floor, @PathVariable int room){
        return new GuestResponse(null);
    }

    @GetMapping(value = "/prueba/Ejercicio2")
    public String getReq2() {

        String res = "";
        Calendar in = new GregorianCalendar();
        in.set(2018, 10, 3);
        res += "Fecha Ingreso: " + in + "\n";

        Calendar out = new GregorianCalendar();
        out.set(2018, 10, 19);
        res += "Fecha Salida: " + out + "\n";

        Date i = in.getTime();
        res += "Fecha Ingreso (en tipo Date): " + i + "\n";


        Date o = out.getTime();
        res += "Fecha Salida (en tipo Date): " + o + "\n";
        Reservation r = new Reservation(i, o);
        r.calcularPrecio(150.99,191.99);

        return "jo";
    }
}
