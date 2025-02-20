package VISTA;
/*
Ingresar N números en un vector y al final mostrar cuantos números son negativos y cuantos son
cero, cuántos son positivos, el promedio de los negativos y la suma de los positivos.
*/
import MODELO.Class3;

import javax.swing.JOptionPane;
import java.awt.*;

public class Main3 {
    public static void main(String[] args) {
        Class3 obj = new Class3();

        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Cantidad de  Numeros al InGRESAR:"));
        int[] numeros = new int[100];

        for (int i = 1; i > cantidadNumeros;i++ ){
            numeros[i]  = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Numero " + (i +1)+ ":"));
        }// aca hay un error

        String resultados = obj.procesarNumeros(numeros);
        JOptionPane.showMessageDialog(null, "estos son los Resultados :"+ resultados);
    }
}