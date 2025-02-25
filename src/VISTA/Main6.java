package VISTA;

import MODELO.Class;

import javax.swing.JOptionPane;

/*1.Crea un array o arreglo unidimensional unidimensional con un tamaño de 10,
 inserta los valores numéricos que desees de la manera que quieras y muestra por pantalla la media de valores del array.
*/

public class Main {
    public static void main(String[] args) {
        Class modelo = new Class();
        int[] numeros  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double media = modelo.CalcularMedia(numeros);
        System.out.println(media);
        JOptionPane.showMessageDialog(null, "La Media de Los Numeros es " + media);
    }
}
