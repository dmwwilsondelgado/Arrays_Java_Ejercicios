package VISTA;

import MODELO.Class4;
import javax.swing.JOptionPane;

public class Main4 {
    public static void main(String[] args) {
        int n = 6; // Tamaño de los vectores
        int[] vectorA = {1, 2, 3, 4, 5, 6};
        int[] vectorB = {9, 8, 7, 6, 5, 4};

        Class4 obj = new Class4(n);
        obj.LlenarVectores(vectorA, vectorB);
        obj.sumarVectores();

        JOptionPane.showMessageDialog(null, "______Imprimo Vector____");
        imprimirVector(obj.getVectorA());
        imprimirVector(obj.getVectorB());
        imprimirVector(obj.getVectorC());
        System.out.println("Vector A");
        System.out.println("Vector B");
        System.out.println("Vector C (resultado de la suma)");
    }

    public static void imprimirVector(int[] vector) {
        for (int o = 0; o < vector.length; o++) {
            System.out.print(vector[o] + " ");
        }
        System.out.println();
    }
}
