public class Vehiculo {
    private String patente;
    private String tipoVehiculo;
    private Integer cantidadLlantas;

    public Vehiculo() {
    }

    // get & set con errores
    private String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    private String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    private Integer getCantidadLlantas() {
        return cantidadLlantas;
    }

    public void setCantidadLlantas(Integer cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }

    // Generar to string
}
