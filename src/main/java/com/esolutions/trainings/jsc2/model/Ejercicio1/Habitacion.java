package com.esolutions.trainings.jsc2.model.Ejercicio1;

public class Habitacion
{
    private int id;
    private int numHuesped;

    public Habitacion(int id)
    {
        this.id=id-1;
    }
    
    public Habitacion(int id, int numHuespued){
        this.id = id;
        this.numHuesped = numHuespued;
    }
    public int getId()
    {
        return id;
    }

    public void setNumHuesped(int numHuesped) {
        this.numHuesped = numHuesped;
    }

    public int getNumHuesped() {
        return numHuesped;
    }

    public void setId(int id) {
        this.id = id;
    }
}
