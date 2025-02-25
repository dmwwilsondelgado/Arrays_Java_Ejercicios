package MODELO;

public class Class6 {
    private double[] vectorA;
    private double[] vectorB;
    private double[] sumaVectores;
    private double[] restaVectores;

    public Class6(double[] vectorA, double[] vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
        this.sumaVectores = new double[vectorA.length];
        this.restaVectores = new double[vectorA.length];
    }

    public void sumarVectores() {
        for (int i = 0; i < vectorA.length; i++) {
            sumaVectores[i] = vectorA[i] + vectorB[i];
        }
    }

    public void restarVectores() {
        for (int i = 0; i < vectorA.length; i++) {
            restaVectores[i] = vectorA[i] - vectorB[i];
        }
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public double[] getSumaVectores() {
        return sumaVectores;
    }

    public double[] getRestaVectores() {
        return restaVectores;
    }
}
