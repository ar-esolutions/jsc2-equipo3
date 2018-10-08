package com.esolutions.trainings.jsc2.model.Ejercicio1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Hotel
{
    ArrayList<Piso> pisos= new ArrayList<>();
    
    public Hotel(int tam)
    {
        this.llenarHotel(tam);
    }


    public void llenarHotel(int tam)
    {   
        pisos = new ArrayList<>();
        Piso piso = new Piso(1);
        piso.agregarHabitacion(1, 1);
        pisos.add(piso);
        tam +=2;
        
         /*El huésped número 2 no puede alojarse en la habitación 2 del piso 1 ya que 1 + 2 = 3 
        no es un cuadrado perfecto, por lo que se le asigna la habitación 1 en el piso 2, que está vacío.
        El húesped número 3, se aloja en la habitación 2 del piso 1 ya que 1 + 3 = 4 es un cuadrado perfecto.
        El huésped número 4, no puede alojarse en el piso 1, ya que 3 + 4 = 7, y no es un cuadrado perfecto. 
        Tampoco puede alojarse en el piso 2, ya que 2 + 4 = 6, no es un cuadrado perfecto. 
        En consecuencia, el huésped 4 se aloja en la habitación 1 del piso 3 porque éste está vacío.*/
        
        //el i va a ser el numero de huesped
        for(int i = 2 ; i < tam; i++){
            for(int j = 0; j < pisos.size(); j++){
                int numhab = this.generarNumeroHabitacion(j, i);
                //significa que no dio raiz cuadrada y tiene que irse a otro piso
            }
        }
    }
    

    private int generarNumeroHabitacion(int piso, int idhuesped) {
        //numeroHuesped = Piso.getUltimoHuesped();
        // int numero = numeroHuesped + nuevo.getid;
        int ultimahabitacion = pisos.get(piso).buscarUltimaHabitacion();
        int ultimohuesped = pisos.get(piso).getHabitaciones().get(ultimahabitacion).getNumHuesped();
        int numero = idhuesped + ultimohuesped;
        double raiz = Math.sqrt(numero);
        double parteFrac = raiz - (long)raiz;

        if (parteFrac == 0)//es entero
        {
            pisos.get(piso).agregarHabitacion(ultimahabitacion++, idhuesped);
            
            return pisos.get(piso).buscarUltimaHabitacion();
        }
        //si no es entero
        return -1;
    }
    public int getGuest(int floor, int room){
            Piso pisoActual =this.pisos.get(floor);
        ArrayList<Habitacion> habitacionesActual= new ArrayList<>();
        int huesped = pisoActual.existeHabitacion(room);
            return huesped;
    }

}


