package MODELO;
        /*
        double = montoPagar = Double.parseDouble(JOptionPane.showInputDialog("Cual Es el Monto por el Contrato seguro"));
        double = resultados = MODELO.Class6.seguros(montoPagar);
        JOptionPane.showMessageDialog(null,"El Valor Total a tu Poliza es mas intereses es " + resultados);
        */
        /*Modelo modelo0 = new Modelo();
        resltados controlador= new resultados(Modelo);
         */
public class Class {
        public int sumar(int a, int b) {
                return a + b;
        }
        public double CalcularMedia(int[]array){
                int suma = 0;
                for (int  i = 0;i < array.length; i++){
                                suma += array[i];
                }
                return (double) suma / array.length ;
        }
}
