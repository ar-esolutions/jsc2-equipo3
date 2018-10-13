package com.esolutions.trainings.jsc2.db;

import com.esolutions.trainings.jsc2.model.Ejercicio2.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT id, floor, nro, type FROM Room r WHERE r.floor=?1 AND r.nro=?2")
    Room findRoomByFloorAndNro(int floor, int nro);
}
