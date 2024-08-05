public abstract class Vehiculo {
    private String matriculaVehiculo;
    private int diasAlquiler;

    public Vehiculo(String matricula, int diasAlquiler) {
        this.matriculaVehiculo = matricula;
        this.diasAlquiler = diasAlquiler;
    }

    public String getMatriculaVehiculo() {
        return matriculaVehiculo;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "\n- El precio total de alquiler por "+diasAlquiler+" dias es: "+calcularPrecio()+" COP.\n" ;
    }
}
