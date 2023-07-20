package poo.clases;

public class SmartPhone extends SmartDevice {

    // atributos
    int almacenamientoGB;
    int cantidadCamaras;
    boolean conectividad5G;

    public SmartPhone() {
    }

    public SmartPhone(int capacidadBateria, double porcentajeBateria, double pulgadasPantalla, String marca,
            int almacenamientoGB,
            int cantidadCamaras, boolean conectividad5g) {
        super(capacidadBateria, porcentajeBateria, pulgadasPantalla, marca);
        this.almacenamientoGB = almacenamientoGB;
        this.cantidadCamaras = cantidadCamaras;
        this.conectividad5G = conectividad5g;
    }

    @Override
    public String toString() {
        return "SmartPhone [almacenamientoGB=" + almacenamientoGB + ", cantidadCamaras=" + cantidadCamaras
                + ", conectividad5G=" + conectividad5G + "]";
    }

    

}
