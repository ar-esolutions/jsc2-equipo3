package com.esolutions.trainings.jsc2.model.Ejercicio1;

public class Habitacion
{
    private int piso;
    private int id;

    public Habitacion(int piso)
    {
        this.piso=piso;
    }

    public int getPiso()
    {
        return piso;
    }

    public int getId() {
        return id;
    }

    public void setPiso(int piso)
    {
        this.piso = piso;
    }

    public void setId(int id) {
        this.id = id;
    }
}
