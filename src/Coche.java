public class Coche extends Vehiculo {
    private static final double valorExtra = 1.5;

    public Coche(String matriculaVehiculo, int diasAlquiler) {
        super(matriculaVehiculo, diasAlquiler);
    }

    @Override
    public double calcularPrecio() {
        double precioBase = 50 * getDiasAlquiler();
        return precioBase + (valorExtra * getDiasAlquiler());
    }

}