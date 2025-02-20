package VISTA;
import MODELO.Class4;
import javax.swing.JOptionPane;
/*
Llenar dos vectores A y B de N elementos cada uno, sumar el elemento uno del vector A con el
elemento uno del vector B y así sucesivamente hasta N, almacenar el resultado en un vector C, e
imprimir los dos vectores y el vector resultante.
*/
public class Main4 {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ;i++){
            int[] vectorA = {1,2,3,4,5,6};
            int[] vectorB = {9,8,7,6,5,4,};

            Class4 oBj = new Class4(n);
            oBj.LlenarVectores(vectorA,vectorB);
            oBj.sumarVectores();
            JOptionPane.showMessageDialog(null,"______Imprimo Vector____");
            imprimirVector(oBj.getVectorA());
            imprimirVector(oBj.getVectorB());
            imprimirVector(oBj.getVectorC());
            System.out.println("Vector A");
            System.out.println("Vector B");
            System.out.println("Vector C(resultado de la suma)");



        }
    }
    public static void imprimirVector(int[] vector){
        for(int o = 0; o < vector.length;o++){
            System.out.println(vector[i] + "");
        }
        System.out.println();
    }
}

