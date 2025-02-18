package MODELO;

public class Modelo {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double CalcularMedia(int[]array){
        int suma = 0;
        for (int  i = 0;i < array.length; i++){
            suma += array[i];
        }
        return (double) suma / array.length ;
    }
}
