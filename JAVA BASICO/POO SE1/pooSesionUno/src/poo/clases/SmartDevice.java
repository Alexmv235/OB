package poo.clases;

public  abstract class  SmartDevice {

    // atributos
    int capacidadBateria;
    double porcentajeBateria;
    double pulgadasPantalla;
    String marca;

    // constructor
    public SmartDevice() {
    }
    public SmartDevice(int capacidadBateria,double porcentajeBateria,double pulgadasPantalla, String marca){
        this.capacidadBateria=capacidadBateria;
        this.porcentajeBateria=porcentajeBateria;
        this.pulgadasPantalla=pulgadasPantalla;
        this.marca=marca;
        
    }

    //metodo
    public void cargarBateria(double carga){
        this.porcentajeBateria+=carga;
        System.out.println("cargado"+"nuevo porcentaje:"+this.porcentajeBateria);
    }
    
    @Override
    public String toString() {
        return "SmartDevice [capacidadBateria=" + capacidadBateria + ", porcentajeBateria=" + porcentajeBateria
                + ", pulgadasPantalla=" + pulgadasPantalla + ", marca=" + marca + "]";
    }
    
    
}
