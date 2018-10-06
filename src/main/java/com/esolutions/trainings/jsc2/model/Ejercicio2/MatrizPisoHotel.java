package com.esolutions.trainings.jsc2.model.Ejercicio2;

public class MatrizPisoHotel {
    private Room matriz[][];

    public MatrizPisoHotel(){
        matriz = new Room [6][50]; // piso habitacion

    }

    public void setRoom(Room r, int piso, int nro){
        matriz [piso][nro] = r;
    }

    public boolean estaOcupado(int piso, int nro){   // retorna false en el caso de que la habitacion esta desocupada
        boolean res = false;
        if(matriz [piso][nro] != null){
            res = true;
        }
        return res;       }



}
