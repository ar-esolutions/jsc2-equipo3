package com.esolutions.trainings.jsc2.model.Ejercicio1;

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

    public int existeHabitacion(int numero)
    {
        for (int i = 0; i < habitaciones.size(); i++)
        {
            if(i == numero)
            {
                return habitaciones.get(i).getNumHuesped();
            }
        }
        return -1;//si devuelve -1 significa que la habitacion no existe(es decir que no ha sido creada)
    }
    
    public void agregarHabitacion(int idhabitacion, int huesped){
        habitaciones.add(new Habitacion(idhabitacion, huesped));
    }
}
