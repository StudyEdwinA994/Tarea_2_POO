public class Furgoneta extends VehiculoCarga {
    public Furgoneta(String matriculaVehiculo, int diasAlquiler, double pmaFurgoneta) {
        super(matriculaVehiculo, diasAlquiler, pmaFurgoneta);
    }

    @Override
    public double calcularPrecio() {
        double precioBase = 50 * getDiasAlquiler();
        return precioBase + (20 * getPmaVehiculoCarga());
    }
}
