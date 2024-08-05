public abstract class VehiculoCarga extends Vehiculo {
    private double pmaVehiculoCarga; // Peso Máximo Autorizado en toneladas

    public VehiculoCarga(String matricula, int diasAlquiler, double pma) {
        super(matricula, diasAlquiler);
        this.pmaVehiculoCarga = pma;
    }

    public double getPmaVehiculoCarga() {
        return pmaVehiculoCarga;
    }
}
