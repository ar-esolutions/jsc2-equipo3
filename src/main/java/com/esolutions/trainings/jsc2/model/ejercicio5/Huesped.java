package com.esolutions.trainings.jsc2.model.ejercicio5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
    @Table(name = "GUESTS")
    public class Huesped {
        @Id
        private Long id;

        @Column(name = "name", nullable = false, unique = true)
        private String name;
        ArrayList<GuestApellido> acuApellidos = new ArrayList<>();

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<String> buscarRepetidos(ArrayList<Huesped> a ){
            ArrayList<String> salida = new ArrayList<>();

            for (int i = 0; i < a.size(); i++) {
                String apellido = obtenerApellido(a.get(i).getName());

                if (this.existeApellido(apellido) != -1) {
                    salida.add(apellido);
                } else {
                    GuestApellido ga = new GuestApellido(apellido, 1);
                    this.acuApellidos.add(ga);
                }
            }
            List<String> ordenado = salida;
            Collections.sort(ordenado);
            return (ArrayList<String>) ordenado;
        }


        public String obtenerApellido(String nombreCompleto){
            String res = "";
            boolean ban = true;
            int contador = 0;

            while (ban){
                if (nombreCompleto.charAt(contador) == ','){
                    ban = false;}
                else
                {
                    res+= nombreCompleto.charAt(contador); }

                    contador++;}
            return res;
        }


        public int existeApellido(String apellido){
            int res = -1;
            for(int i = 0; i < acuApellidos.size(); i++){
                if (acuApellidos.get(i).getApellido().compareTo(apellido) == 0 ){
                    res = i;
                }
            }
            return res;
        }
}