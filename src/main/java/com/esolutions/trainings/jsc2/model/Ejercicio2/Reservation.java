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
    private Date check_in;

    @Column
    private Date check_out;

    @Column
    private double price;

    public Reservation(Long habitacion, Date fechaIngreso, Date fechaSalida){
        Room_Id = habitacion;
        check_in = fechaIngreso;
        check_out = fechaSalida; }




    private double calcularPrecio(Date entrada, Date salida, int tipo){
        //tipo 1 ESTANDAR
        // tipo 2 	SUITE

        double precio = 0;



    switch(tipo){
            case 1:
            //    if ( entrada >= 1 && entrada <= 4)
                    precio = 150.99;





        }

      //  if( entrada >= 4 && entrada <= 4 )


        return 0;}


    public static int getDayOfTheWeek(Date d){  // 1 = Domingo, 2 = Lunes…
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(d);
        return cal.get(Calendar.DAY_OF_WEEK);
    }







}