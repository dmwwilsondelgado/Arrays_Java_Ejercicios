package VISTA;
import MODELO.Class5;
/**
*Escriba un algoritmo que efectúe la suma y la resta de dos vectores de números reales.
*/

import javax.swing.JOptionPane;

public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos una variable que nos obtenga el tamaño de la array
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del Vector"));
        // luego de esta creamos el array o vector como queramos llamarlo
        int[] vector = new int[tamaño];// usamos la variable tamaño

        //usamos un for para  pedir los elementos del vector
        for (int i = 0; i < 10; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero " +(i+1) +":" ));
        }
        //luego qu ya pedimos los datos instanciamo una calse a modelo
        Class5 obj = new Class5();

        //llamamos al metodo de la class 5 para mostrar resultados
        String resultados = obj.encontrarminimoymax(vector);
        JOptionPane.showMessageDialog(null,resultados);
    }

}





