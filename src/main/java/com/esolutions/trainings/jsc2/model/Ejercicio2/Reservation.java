package com.esolutions.trainings.jsc2.model.Ejercicio2;

import java.util.GregorianCalendar;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "RESERVATIONS")
public class Reservation {

    @Id
    private Long Id;

    @Column
    private Long Room_Id;

    @Column
    private Date in;

    @Column
    private Date out;

    @Column
    private double price;

    public Reservation(Date i, Date o){

        in = i;
        out = o; }



    public double calcularPrecio(double precio1, double precio2){
        //tipo 1 ESTANDAR
        // tipo 2 	SUITE

        double precio = 0;
        int acuTarifa1 = 0; //viernes, sabado, domingo
        int acuTarifa2= 0; // lunes, martes, miercoles, jueves

        Date temp = in;

        while( temp.compareTo(out) != 0){
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

        precio = (acuTarifa1*precio2)+(acuTarifa2*precio1);
        //precio = (acuTarifa1*r.obtenerPrecioVSD())+(acuTarifa2*r.obtenerPrecioLMMJ());

        return precio;}


    public static int obtenerNumeroDia(Date d){  // 1 = Domingo, 2 = Lunes…
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(d);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    public Date sumarDias(Date d){
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        return cal.getTime();
    }







}