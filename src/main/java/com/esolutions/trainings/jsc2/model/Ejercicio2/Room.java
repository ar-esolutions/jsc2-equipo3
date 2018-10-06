package com.esolutions.trainings.jsc2.model.Ejercicio2;

public class Room {
    private int id;
    private int floor;
    private int nro;
    private String type;

    public Room(int i, int f, int n, String t){

        id = i;
        floor = f;
        nro = n;
        type = t; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
