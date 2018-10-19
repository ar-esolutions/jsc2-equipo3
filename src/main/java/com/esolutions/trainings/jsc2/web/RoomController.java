package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.logic.RoomService;
import com.esolutions.trainings.jsc2.logic.ReservationService;
import com.esolutions.trainings.jsc2.model.ejercicio1.Hotel;
import com.esolutions.trainings.jsc2.model.ejercicio2.Reservation;
import com.esolutions.trainings.jsc2.model.ejercicio2.Room;
import com.esolutions.trainings.jsc2.model.ejercicio3.NombreRedWifi;
import com.esolutions.trainings.jsc2.model.ejercicio4.WifiPwd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


@RestController
public class RoomController {
    //ejercicio1
    Hotel hotel = new Hotel(50000);
    RoomService service;
    ReservationService resService;

    @Autowired
    public RoomController(RoomService service, ReservationService resService) {
        this.service = service;
        this.resService = resService;
    }

    @GetMapping(value = "/floors/{floor}/rooms/{room}")
    public GuestResponse getGuestNumber(@PathVariable int floor, @PathVariable int room){


        try{
            return new GuestResponse(hotel.getGuest(floor-1,room-1));
        }catch(ArrayIndexOutOfBoundsException e){
            return null;
        }

    }
    //ejercicio2



    @PostMapping(value = "/floors/{floor}/rooms/{room}/book")
    public Ejercicio2Response getReq2( @PathVariable int floor, @PathVariable int room, @RequestBody Map<String, Object> body) throws Exception {

        String check_in=body.get("checkin").toString();
        String check_out=body.get("checkout").toString();
        Date checkin = new SimpleDateFormat("yyyy-MM-dd").parse(check_in);
        Date checkout = new SimpleDateFormat("yyyy-MM-dd").parse(check_out);

        List<Room> rooms = service.sortedRoomsById();
        Room ro=null;
        for (int i=0; i<rooms.size(); i++){
            Room roomAux=rooms.get(i);
            if(roomAux.getFloor()==floor && roomAux.getNro()==room ){
                ro=roomAux;
                break;
            }
        }

        Reservation r = new Reservation(checkin, checkout, ro);

        boolean booked=true;

        List<Reservation> reservations=resService.SortedReservationsById(); //validacion de reservas
        /*for (int i=0; i<reservations.size(); i++) {
            Reservation resAux=reservations.get(i);
            Room roomAux=resAux.getRoom();
            if(roomAux.getFloor()==floor && roomAux.getNro()==room){
                booked=!(resAux.estaOcupada(r.getIn(), r.getOut()));
                break;
            }
        }*/

        if(booked)
            resService.Reserve(r); //insert de reserva a BD

        return new Ejercicio2Response(booked, r.calcularPrecio(ro));
    }
//ejercicio3
    @GetMapping(value="/floors/{floor}/rooms/{room}/wifi/ssid")
            public NombreRedWifiResponse getStringNombreDeRedWifi(@PathVariable int floor, @PathVariable int room)
    {
        NombreRedWifi Wifi= new NombreRedWifi(floor, room);
        return new NombreRedWifiResponse(Wifi.definirnombre());
    }

    //ejercicio 4
    @GetMapping(value = "/floors/{floor}/rooms/{room}/wifi/password")
    public WifiPwdResponse getWifiPwd(@PathVariable int floor, @PathVariable int room)
    {

        WifiPwd wifiPwd = new WifiPwd();
        return new WifiPwdResponse(wifiPwd.getWifiPwd(floor,room));
    }


    //ejercicio5

    @GetMapping(value = "/guests/last-name/repeated5")
    public List<String> listado()
    {
        List<String> res= null;
        res.add("Hola");
        return res;

   }




}
