package com.esolutions.trainings.jsc2.model.ejercicio1;

import java.util.ArrayList;

public class Piso
{
    private ArrayList<Habitacion> habitaciones;
    private int id;

    public Piso(int piso)
    {
        this.id = piso;
        habitaciones = new ArrayList<>();

    }



    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public int getId() {
        return id;
    }

    public int buscarUltimaHabitacion()
    {
        return habitaciones.size()-1;
    }

    public Integer existeHabitacion(int numero)
    {
        if(habitaciones.get(numero).getNumHuesped() != -1){
            return habitaciones.get(numero).getNumHuesped();
        }
        return null;//si devuelve -1 significa que la habitacion no existe(es decir que no ha sido creada)
    }

    public void agregarHabitacion(int idhabitacion, int huesped){
        habitaciones.add(new Habitacion(idhabitacion, huesped));
    }
}
