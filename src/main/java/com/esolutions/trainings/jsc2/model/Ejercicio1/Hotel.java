package com.esolutions.trainings.jsc2.model.Ejercicio1;
import java.util.ArrayList;

public class Hotel
{
    ArrayList<Huesped> huespedes = new ArrayList<>();
    ArrayList<Piso> pisos= new ArrayList<>();


    public Hotel(int tam)
    {
        for (int i=0;i<tam;i++)
        {
           Huesped nuevo= null;
            nuevo.setHabitacion(calcularHabitacion());
        }
    }


    public Habitacion calcularHabitacion()
    {
        int cantPiso=1;
        if(pisos.isEmpty())
        {
            pisos.add(new Piso(cantPiso));
            cantPiso++;
        }
        for (int i=0;i<pisos.size();i++)
        {
            if(generarNumeroHabitacion(i)!=-1) {
                int numero = 0;
                Piso pActual = pisos.get(i);
                if (pActual.buscarHabitacion(numero)) {
                    return pActual.getHabitaciones().get(numero);
                }
            }
                if (i==pisos.size()-1)
                {
                    pisos.add(new Piso(pisos.size()-1));
            }

        }

        return null;
    }


    public int generarNumeroHabitacion(int piso) {
        //numeroHuesped = Piso.getUltimoHuesped();
        // int numero = numeroHuesped + nuevo.getid;
        int numero = 0;
        double raiz = Math.sqrt(numero);
        double parteFrac = raiz - (long) raiz;

        if (parteFrac == 0)//es entero
        {
            return numero;
        }

      //si no es entero

        return -1;
    }
}
