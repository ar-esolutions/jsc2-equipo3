package com.esolutions.trainings.jsc2.model.ejercicio5;

public class GuestApellido {
    private String apellido;
    private int contador;

    public GuestApellido(){
        apellido = "";
        contador= 0;

    }

    public GuestApellido(String a, int c){
        apellido = a;
        contador= c;
   }

   public void acumularContador(){
        contador++;}



    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
