package VISTA;

import MODELO.Class6;
/**
 * Escriba un algoritmo que efectúe la suma y la resta de dos vectores de números reales.
 */
import javax.swing.JOptionPane;

public class Main6 {
    public static void main(String[] args) {
        double[] vectorA = {1.0, 2.0, 3.0, 4.0}; //Cargamos un Vector A de Numeros reales
        double[] vectorB = {5.0, 6.0, 7.0, 4.0}; // Cargamos un Vector B de Numero reales

        Class6 obj = new Class6(vectorA, vectorB); // instanciamos el Objeto y llamamos ala clase
        obj.sumarVectores();//llamamos metodos a usar
        obj.restarVectores();

        String mensaje = "Vector A: " + obtenerCadenaVector(obj.getVectorA()) + //llamamos los metodos
                "\nVector B: " + obtenerCadenaVector(obj.getVectorB()) +
                "\nSuma de Vectores: " + obtenerCadenaVector(obj.getSumaVectores()) +
                "\nResta de Vectores: " + obtenerCadenaVector(obj.getRestaVectores());
        // Mostramos los Resultados
        JOptionPane.showMessageDialog(null, mensaje, "Resultados de las Operaciones", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String obtenerCadenaVector(double[] vector) {
        StringBuilder cadena = new StringBuilder(); // Se hace una instacia de concatenacion
        // lo que facilita usarlo al momento de llamar
        for (double elemento : vector) {
            cadena.append(elemento).append(" "); // append sirve para concatenar
        }
        return cadena.toString().trim(); // to string inmpirme el array en forma de arreglo
    }
}


