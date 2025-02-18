package VISTA;

import MODELO.Class2;

import javax.swing.JOptionPane;


/*
Crea dos arrays o arreglos unidimensionales que tengan el mismo tamaño (lo pedirá por teclado),
en uno de ellos almacenaras nombres de personas como cadenas, en el otro array o arreglo ira
almacenando la longitud de los nombres, para ello puedes usar la función LONGITUD (cadena) que
viene en Plein. Muestra por pantalla el nombre y la longitud que tiene.
*/
public class Main2 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("ingrese el primer nombre de la array");
        Class2 obj = new Class2();

        int Longitud = obj.ObtengoLongitud(nombre);

        JOptionPane.showMessageDialog(null,"La Longitud de " +nombre + "es" +Longitud);

    }
}