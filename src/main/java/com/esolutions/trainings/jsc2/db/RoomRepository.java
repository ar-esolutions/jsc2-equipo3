package com.esolutions.trainings.jsc2.db;

import com.esolutions.trainings.jsc2.model.Ejercicio2.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
