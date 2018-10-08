package com.esolutions.trainings.jsc2.model.Ejercicio2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOMS")
public class Room {
    @Id
    private Long id;

    @Column
    private int floor;

    @Column
    private int nro;

    @Column
    private String type;

    public Room(Long i, int f, int n, String t){

        id = i;
        floor = f;
        nro = n;
        type = t; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", floor=" + floor +
                ", nro=" + nro +
                ", type='" + type + '\'' +
                '}';
    }
}
