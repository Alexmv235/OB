package poo.clases;

public class Main {
    public static void main(String[] args) throws Exception {
       
        SmartDevice iphone = new SmartPhone();
        SmartDevice iwatch = new SmartWatch();

        System.out.println(iphone);
        System.out.println(iwatch);

        SmartDevice s21 = new SmartPhone(5000, 45, 7, "Samsung", 256, 3, true);
        SmartDevice fibit = new SmartWatch(1000, 70,3, "fitbit", false, true, false);

        System.out.println(s21);
        s21.cargarBateria(15);
        System.out.println(s21);



        }
}
