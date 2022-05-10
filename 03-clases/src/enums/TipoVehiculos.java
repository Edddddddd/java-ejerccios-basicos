package enums;

public enum TipoVehiculos {
    AUTO(0),
    TRACTOR(1),
    CAMIONETA(2),
    MOTO(3),
    HASHBACK(4),
    HUEVO(5);

    private int valor;

    TipoVehiculos(int valor) {
        this.valor = valor;
    }
}
