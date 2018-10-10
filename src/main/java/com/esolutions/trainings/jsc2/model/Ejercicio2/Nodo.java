package com.esolutions.trainings.jsc2.model.Ejercicio2;
public class Nodo {

    // Variable en la cual se va a guardar el valor.
    private Reservation res;

    private Nodo siguiente;

    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo() {
        this.res = null;
        this.siguiente = null;
    }

    // Métodos get y set para los atributos.

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setValor(Reservation r) {
        this.res = r;
    }
}