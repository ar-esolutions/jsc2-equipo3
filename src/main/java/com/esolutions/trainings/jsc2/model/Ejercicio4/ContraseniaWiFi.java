package com.esolutions.trainings.jsc2.model.Ejercicio4;

/*
J = JA 1
A = VA 2
V = VJ 3
JA = JAVA 12
VA = VJVA 32
VJ = VJJA 31
JAVA = JAVA VJVA 1232 A
VJVA = VJJA VJVA 3132 B
VJJA = VJJA JAVA 3112 C
A = AB
B = CB
C = CA

Hago funciones para contar iteraciones del nuevo lenguaje, la ponderacion indica o no la existencia de un java

(1)A(n) = A(n-1) + C(n-1)
(0)B(n) = A(n-1) + B(n-1)
(1)C(n) = B(n-1) + C(n-1)


 */



public class ContraseniaWiFi
{
    private String contrasenia;
    private int N;


    public ContraseniaWiFi(int numPiso , int numHab)
    {
        this.N = numPiso + numHab;
    }


}
