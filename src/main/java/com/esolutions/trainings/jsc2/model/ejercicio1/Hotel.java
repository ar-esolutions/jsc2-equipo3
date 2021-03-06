package com.esolutions.trainings.jsc2.model.ejercicio1;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Piso> pisos = new ArrayList<>();

    public Hotel(int tam) {
        this.llenarHotel(tam);
    }


    private void llenarHotel(int tam) {
        pisos = new ArrayList<>();
        int huesped = 1;
        Piso primero = new Piso(1);
        primero.agregarHabitacion(1, 1);
        pisos.add(primero);
        huesped++;

        for (int i = 1; i < tam; i++) {
            for (int j = 0; j < pisos.size(); j++) {
                int numhab = this.generarNumeroHabitacion(j, huesped);

                if (numhab == -1) {
                    if (pisos.size() == j + 1) {
                        Piso nuevo = new Piso(j + 1);
                        pisos.add(nuevo);
                        nuevo.agregarHabitacion(1, huesped);
                        huesped++;
                        break;
                    }
                } else {
                    huesped++;
                    break;
                }
            }
            //significa que no dio raiz cuadrada y tiene que irse a otro piso
        }
    }


    private int generarNumeroHabitacion(int piso, int idhuesped) {

        int ultimahabitacion = pisos.get(piso).buscarUltimaHabitacion();
        int ultimohuesped = pisos.get(piso).getHabitaciones().get(ultimahabitacion).getNumHuesped();
        int numero = idhuesped + ultimohuesped;
        double raiz = Math.sqrt(numero);
        double parteFrac = raiz - (long) raiz;

        if (parteFrac == 0)//es entero
        {
            pisos.get(piso).agregarHabitacion(ultimahabitacion, idhuesped);

            return pisos.get(piso).buscarUltimaHabitacion();
        }
        //si no es entero
        return -1;
    }

    public Integer getGuest(int floor, int room) {
        Piso pisoActual = this.pisos.get(floor);
        Integer huesped = pisoActual.existeHabitacion(room);
        return huesped;

    }

}


