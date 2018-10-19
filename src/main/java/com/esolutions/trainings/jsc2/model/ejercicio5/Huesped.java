package com.esolutions.trainings.jsc2.model.ejercicio5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
    @Table(name = "GUESTS")
    public class Huesped {
        @Id
        private Long id;

        @Column(name = "name", nullable = false, unique = true)
        private String name;
        public Huesped(){}
        public Huesped(long i, String n){
            id = i;
            name = n;
        }


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


}