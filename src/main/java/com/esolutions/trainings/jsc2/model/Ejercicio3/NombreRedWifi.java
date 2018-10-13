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

    public String concatenacionDeNumerosBinarios(String piso, String habitacion)
    {
       return piso.concat(habitacion);
    }

    public String convertirABinario(int numero)
    {
        return Integer.toBinaryString(numero);
    }

    public int contarMayorCantidadSeguidaDeCeros(String binario)
    {
        String bin=binario;
        int max=0;
        for (int i = 0; i < bin.length(); i++)
        {
            if(bin.charAt(i)=='0')
            {
                int temp=1;
                for (int j =i+1; j <bin.length() ; j++)
                {
                    if(bin.charAt(j)=='0')
                    {
                        boolean bol=false;
                        for (int k = j; k < bin.length(); k++) //valida que exista un 1 en la siguiente subcadena
                        {
                            if(bin.charAt(k)=='1')
                                bol=true;

                        }
                        if (bol)
                        temp++;
                        else temp=0;
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
        String numeroPisoConveritdo=this.convertirABinario(numPiso);
        String numeroHabitacionConvertida=this.convertirABinario(numHab);
        String concatenacionDeNumeros = this.concatenacionDeNumerosBinarios(numeroPisoConveritdo,numeroHabitacionConvertida);
        int cantidadDeMayorSecuenciaDeCeros= this.contarMayorCantidadSeguidaDeCeros(concatenacionDeNumeros);

         if(cantidadDeMayorSecuenciaDeCeros>0)
         {
             res+= "-"+cantidadDeMayorSecuenciaDeCeros;
         }
         return res;
    }
}
