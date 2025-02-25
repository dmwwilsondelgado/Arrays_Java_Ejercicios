package MODELO;

/*
Llenar dos vectores A y B de N elementos cada uno, sumar el elemento uno del vector A con el
elemento uno del vector B y así sucesivamente hasta N, almacenar el resultado en un vector C, e
imprimir los dos vectores y el vector resultante.
*/

public class Class5 {
    public  String encontrarminimoymax(int[] vector){
        if (vector == null || vector.length == 0){
            return "Array Vacia";
        }
        int maximo = vector[0];
        int minimo = vector[0];

        for (int i = 1; i< vector.length; i ++){
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
            if (vector[i] < minimo ) {
                minimo = vector[i];
            }
        }
        return "Valor máximo: " + maximo + "\nValor mínimo: " + minimo;
    }
}


