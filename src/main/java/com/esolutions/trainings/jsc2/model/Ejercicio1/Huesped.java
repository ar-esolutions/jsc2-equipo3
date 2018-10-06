package com.esolutions.trainings.jsc2.model.Ejercicio1;

public class Huesped
{
    private int id;
    Habitacion habitacion = new Habitacion(0);//pasar por parametro numero real

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Huesped()
    {

    }
}
