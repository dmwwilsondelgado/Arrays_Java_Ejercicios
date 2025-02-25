package VISTA;

import MODELO.Class6;
/**
 * Escriba un algoritmo que efectúe la suma y la resta de dos vectores de números reales.
 */
import javax.swing.JOptionPane;

public class Main6 {
    public static void main(String[] args) {
        double[] vectorA = {1.0, 2.0, 3.0, 4.0};
        double[] vectorB = {5.0, 6.0, 7.0, 4.0};

        Class6 modelo = new Class6(vectorA, vectorB);
        modelo.sumarVectores();
        modelo.restarVectores();

        String mensaje = "Vector A: " + obtenerCadenaVector(modelo.getVectorA()) +
                "\nVector B: " + obtenerCadenaVector(modelo.getVectorB()) +
                "\nSuma de Vectores: " + obtenerCadenaVector(modelo.getSumaVectores()) +
                "\nResta de Vectores: " + obtenerCadenaVector(modelo.getRestaVectores());

        JOptionPane.showMessageDialog(null, mensaje, "Resultados de las Operaciones", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String obtenerCadenaVector(double[] vector) {
        StringBuilder cadena = new StringBuilder();
        for (double elemento : vector) {
            cadena.append(elemento).append(" ");
        }
        return cadena.toString().trim();
    }
}


