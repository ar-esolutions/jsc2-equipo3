package com.esolutions.trainings.jsc2.model.ejercicio3;

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
                int temp=0;
                for (int j =i; j <bin.length() ; j++)
                {
                    if(bin.charAt(j)=='0')
                    {
                        boolean bol=false;
                        for (int k = j; k < bin.length(); k++) //valida que exista un 1 en la siguiente subcadena
                        {
                            if(bin.charAt(k)=='1')
                            {
                                bol=true;
                                break;
                            }
                        }
                        if (bol)//si existe suma
                        {
                            temp++;
                            if(temp>max) max=temp;//si la cuenta de ceros de la subcadena es mayor a la que ya existia, reemplaza
                        }

                        else temp=0;
                    }
                    else
                    {
                        break;
                    }
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
