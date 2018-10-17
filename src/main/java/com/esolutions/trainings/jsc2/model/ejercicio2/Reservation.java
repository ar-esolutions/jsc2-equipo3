package com.esolutions.trainings.jsc2.model.ejercicio2;

import java.sql.ResultSet;
import java.util.GregorianCalendar;
import java.util.Calendar;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATIONS")
public class Reservation {

    @Id
    private Long id;

    @Column
    private Date in;

    @Column
    private Date out;

    @ManyToOne
    @JoinColumn(name = "ROOM_ID")
    private Room room;

    public Reservation(Long idAux, Date i, Date o, Room ro){

        id = idAux;
        in = i;
        out = o;
       room = ro;}

    public double calcularPrecio(Room a){
        //tipo 1 ESTANDAR
        // tipo 2 	SUITE

        double precio;
        int acuTarifa1 = 0; //viernes, sabado, domingo
        int acuTarifa2= 0; // lunes, martes, miercoles, jueves

        Date temp = in;

        while(temp.compareTo(out) != 0){
            int numeroDia = obtenerNumeroDia(temp);



            switch(numeroDia){
                case 1: // domingo
                   acuTarifa1++;
                   break;

                case 2: // lunes
                    acuTarifa2++;
                    break;

                case 3: // martes
                    acuTarifa2++;
                    break;

                case 4: //miercoles
                    acuTarifa2++;
                    break;

                case 5: // jueves
                    acuTarifa2++;
                    break;

                case 6: // viernes
                    acuTarifa1++;
                    break;
                case 7: // sabado
                    acuTarifa1++;
                    break;

                default:
                    System.out.println("Error en el numero de dia");
            }// fin switch

            temp= sumarDias(temp);

        }//fin while


        precio = (acuTarifa1*a.obtenerPrecioVSD())+(acuTarifa2*a.obtenerPrecioLMMJ());

        return precio;}


    private static int obtenerNumeroDia(Date d){  // 1 = Domingo, 2 = Lunes…
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(d);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    private Date sumarDias(Date d){
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.DAY_OF_YEAR,1);
        return cal.getTime();
    }


    public ResultSet consultar(String sql) {
        ResultSet resultado = null;




       /* try {


        }

        catch (SQLException e) {
            e.printStackTrace();
            return null;
        } */

               return resultado;
    }





}