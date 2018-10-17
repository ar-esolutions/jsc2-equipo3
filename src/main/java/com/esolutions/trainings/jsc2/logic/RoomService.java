package com.esolutions.trainings.jsc2.logic;

import com.esolutions.trainings.jsc2.db.RoomRepository;
import com.esolutions.trainings.jsc2.model.ejercicio2.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository repository;

    @Autowired
    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    public List<Room> sortedRoomsById() {
        final List<Room> allRooms = this.repository.findAll();
        return allRooms;
    }
}