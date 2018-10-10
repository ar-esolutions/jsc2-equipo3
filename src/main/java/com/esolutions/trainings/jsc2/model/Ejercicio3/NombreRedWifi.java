package com.esolutions.trainings.jsc2.model.Ejercicio3;

public class NombreRedWifi
{
    private int numPiso;
    private int numHab;
    public NombreRedWifi(int numPiso , int numHab)
    {
        this.numHab=numHab;
        this.numPiso=numPiso;
    }

    public String concatenacionDeNumerosBinarios(String numero, String numero2)
    {

       /* String A= String.valueOf(numero);
        String B= String.valueOf(numero2);
        String res= A + B;
        int resultado =Integer.parseInt(res);
        return resultado;
        */

       return numero.concat(numero2);
    }

    public double conversionABinario(int numero)
    {
        int num, exp , digito;
        double binario;
        num=numero;

            exp=0;
            binario=0;

            while(num!=0)
            {
                digito=numero % 2;
                binario = binario + digito * Math.pow(10, exp);
                exp++;
                num=num/2;
            }

        return binario;
    }

    public String convertirABinario2(int numero)
    {
        return Integer.toBinaryString(numero);
    }

    public int contarMayorCantidadSeguidaDeCeros(int binario)
    {
        String bin= Integer.toString(binario);
        int max=0;

        for (int i = 0; i < bin.length(); i++)
        {
            if(bin.charAt(i)=='0')
            {
                int temp=0;
                for (int j =i+1; j <bin.length() ; j++)
                {
                    if(bin.charAt(j)=='0')
                    {
                        temp++;
                    }
                    else
                    {
                        break;
                    }
                    if(temp>max)
                        max=temp;
                }
            }


        }
        return max;
    }

    public String definirnombre()
    {
        String res= "HAND-" + numPiso+ "-" + numHab;
         if(this.contarMayorCantidadSeguidaDeCeros(numHab)>0)
         {
             return res = res+this.contarMayorCantidadSeguidaDeCeros(numHab);
         }

         return res;

    }
}
