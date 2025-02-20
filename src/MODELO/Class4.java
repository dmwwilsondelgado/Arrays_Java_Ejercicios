package MODELO;

/*
Llenar dos vectores A y B de N elementos cada uno, sumar el elemento uno del vector A con el
elemento uno del vector B y así sucesivamente hasta N, almacenar el resultado en un vector C, e
imprimir los dos vectores y el vector resultante.
*/
public class Class4 {
    private int[] vectorA;
    private int[] vectorB;
    private  int[] vectorC;

    public Modelo(int n){
        vectorA = new int[n];
        vectorB = new int[n];
        vectorC = new int[n];
    }
    public void LlenarVectores(int[]a,int[]b){
        vectorA = a;
        vectorB = b;
    }
    public  void sumarVectores(){
        for(int i = 0; i < vectorA.length;i++){
           vectorC[i] =vectorA[i] + vectorB[i];
        }
    }
    /*para mostrar los vectores de forma ordenada*/
    public int[] getVectorA(){
        return vectorA;
    }
    public int[] getVectorB(){
        return vectorB;
    }
    public int[] getVectorC(){
        return vectorC;
    }
}
