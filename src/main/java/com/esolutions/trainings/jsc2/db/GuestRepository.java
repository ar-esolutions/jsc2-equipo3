package com.esolutions.trainings.jsc2.db;
import com.esolutions.trainings.jsc2.model.ejercicio5.Huesped;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Huesped, Long> {
//    @Query("SELECT * FROM guests")
//    List<Huesped> alphabeticallySortedRepeatedGuestsByLastName();
//
}


