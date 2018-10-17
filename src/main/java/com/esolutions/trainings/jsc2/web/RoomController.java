package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.logic.RoomService;
import com.esolutions.trainings.jsc2.model.Ejercicio1.Hotel;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Reservation;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Room;
import com.esolutions.trainings.jsc2.model.Ejercicio3.NombreRedWifi;
import com.esolutions.trainings.jsc2.model.Ejercicio4.WifiPwd;
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

    @Autowired
    public RoomController(RoomService service) {
        this.service = service;
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
        //Calendar in = new GregorianCalendar();
        //in.set(2018, 9, 3); //ingresando mes 10, devuelve Noviembre.

        //Calendar out = new GregorianCalendar();
        //out.set(2018, 9, 19);//ingresando mes 10, devuelve Noviembre.

        //Date i = in.getTime();
        //Date o = out.getTime();

        List<Room> rooms = service.SortedRoomsById();
        Room ro=null;
        boolean val=false;
        for (int i=0; i<rooms.size(); i++){
            Room roomAux=rooms.get(i);
            if(roomAux.getFloor()==floor && roomAux.getNro()==room ){
                val=true;
                ro=roomAux;
                break;
            }
        }
        Long id=(long)0;
        Reservation r = new Reservation(id, checkin, checkout, ro);

        //aqui falta insert de reserva a BD

        //aqui falta validacion de reservas



        return new Ejercicio2Response(false, r.calcularPrecio(ro));
    }
//ejercicio3
    @GetMapping(value = "/floors/{floor}/rooms/{room}/wifi/ssid")
            public String getStringNombreDeRed(@PathVariable int floor, @PathVariable int room)
    {
        NombreRedWifi Wifi= new NombreRedWifi(floor, room);
        return Wifi.definirnombre();
    }
    //ejercicio 4
    @GetMapping(value = "/floors/{floor}/rooms/{room}/wifi/password")
    public long getWifiPwd(@PathVariable int floor, @PathVariable int room)
    {
        long n = floor + room;
        WifiPwd wifiPwd = new WifiPwd();
        return wifiPwd.getWifiPwd(n);
    }

}
