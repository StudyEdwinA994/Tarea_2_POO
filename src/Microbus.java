public class Microbus extends Coche {
    private static final double valorExtra = 2.0;

    public Microbus(String matriculaVehiculo, int diasAlquiler) {
        super(matriculaVehiculo, diasAlquiler);
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + valorExtra;
    }
}
