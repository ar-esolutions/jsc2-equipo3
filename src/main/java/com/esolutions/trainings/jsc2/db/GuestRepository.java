package com.esolutions.trainings.jsc2.db;
import com.esolutions.trainings.jsc2.model.ejercicio5.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
//    @Query("SELECT * FROM guests")
//    List<Guest> alphabeticallySortedRepeatedGuestsByLastName();
//
}


