package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.db.RoomRepository;
import com.esolutions.trainings.jsc2.model.Ejercicio2.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository repository;

    @Autowired
    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    public List<Room> SortedRoomsById() {
        final List<Room> allRooms = this.repository.findAll();
        return allRooms;

        //comentario de prueba
        //Write your code here!
    }

    public Room FindRoomById(Long id) {
        final Room room = this.repository.getOne(id);
        return room;
    }

    public Room FindRoomByFloorAndNro (Long floor, Long nro){
        final Room room = this.repository.findRoomByFloorAndNro(floor, nro);
        return room;

            //comentario de prueba
            //Write your code here!
        }*/

}