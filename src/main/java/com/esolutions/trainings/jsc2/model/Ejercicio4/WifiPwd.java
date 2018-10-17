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

import java.math.BigDecimal;
import java.math.BigInteger;

public class WifiPwd {
    public String getWifiPwd(int floor, int room) {
        int n = floor + room;
        BigInteger cantJava = BigInteger.valueOf(0);
        if (n >= 2) {
            n -= 3;
            BigDecimal cantJavaD = BigDecimal.valueOf(((Math.pow(2, n + 1) - Math.pow(2, n)) / 3) * 2);
            cantJava = cantJavaD.toBigInteger();
            BigDecimal parteFrac = cantJavaD;
            parteFrac = parteFrac.remainder(BigDecimal.ONE);
            if ((n + 1) % 3 == 0) {
                if (parteFrac < BigDecimal..5)
                    cantJava++;
            } else if (parteFrac > 0.5) cantJava++;
        }
        return ("PASS-" + floor + "-" + room + "-" + cantJava);
    }
}