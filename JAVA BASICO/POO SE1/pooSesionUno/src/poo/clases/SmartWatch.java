package poo.clases;

public class SmartWatch extends SmartDevice{

    //atributos
    boolean compatibilidadSim;
    boolean botones;
    boolean camaras;    

    //constructores
    public SmartWatch(int capacidadBateria, double porcentajeBateria, double pulgadasPantalla, String marca,
            boolean compatibilidadSim, boolean botones, boolean camaras) {
        super(capacidadBateria, porcentajeBateria, pulgadasPantalla, marca);
        this.compatibilidadSim = compatibilidadSim;
        this.botones = botones;
        this.camaras = camaras;
    }

    public SmartWatch(){}

    @Override
    public String toString() {
        return "SmartWatch [compatibilidadSim=" + compatibilidadSim + ", botones=" + botones + ", camaras=" + camaras
                + "]";
    }

    
    
    
}
