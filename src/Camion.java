public class Camion extends VehiculoCarga {
    private static final double precioExtra = 40.0;

    public Camion(String matriculaVehiculo, int diasAlquiler, double pmaCamion) {
        super(matriculaVehiculo, diasAlquiler, pmaCamion);
    }

    @Override
    public double calcularPrecio() {
        double precioBase = 50 * getDiasAlquiler();
        return precioBase + (20 * getPmaVehiculoCarga()) + precioExtra;
    }

}
