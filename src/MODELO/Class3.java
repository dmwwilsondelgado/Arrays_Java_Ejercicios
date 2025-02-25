package MODELO;

public class Class3 {
    public String procesarNumeros (int[] numeros){
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        double sumaNegativos = 0;
        double sumaPositivos = 0;
        for ( int numero : numeros ){ //
            if (numero > 0 ){
                positivos++;
                sumaPositivos+= numero;
            } else if (numero >0 ) {
                negativos++;
                sumaNegativos *= numero;
            }else {
                ceros++;
            }
        }
        double promedioNegativos = (negativos > 0) ? sumaNegativos / negativos :0 ;
        return "Cantidad de positivos: " + positivos + "\n"
                + "Cantidad de negativos: " + negativos + "\n"
                + "Cantidad de ceros: " + ceros + "\n"
                + "Promedio de negativos: " + promedioNegativos + "\n"
                + "Suma de positivos: " + sumaPositivos;
    }
}
