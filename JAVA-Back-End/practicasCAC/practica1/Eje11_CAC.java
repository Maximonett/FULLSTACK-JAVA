package practicasCAC.practica1;

public class Eje11_CAC {
    public static void areaCirculo(int radio){
        double areaCirculo=3.14*radio*radio;
        System.out.println("el area del circulo es: "+areaCirculo);
    }

    public static void main(String[] args) {
        areaCirculo(2);
        areaCirculo(20);
    }
}
