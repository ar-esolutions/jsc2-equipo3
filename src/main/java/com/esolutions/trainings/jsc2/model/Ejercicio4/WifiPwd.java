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

public class WifiPwd {
    public long getWifiPwd(long n) {
        long cantJava = 0;
        if (n <= 2) return cantJava;
        if (n > 2) {
            n -= 2;
            double cantJavaD = ((Math.pow(2, n + 1) - Math.pow(2, n)) / 3) * 2;
            double parteFrac = cantJava - cantJavaD;
            cantJava = (long) cantJavaD;
            if ((n + 1) % 3 == 0) {
                if ((parteFrac - 0.33) < 0.2) {
                    cantJava++;
                } else if (parteFrac > 0.5)
                    cantJava++;
            }
        }
        return cantJava;
    }
}