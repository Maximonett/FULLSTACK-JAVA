package practicasCAC.practica1;

public class Eje9_CAC {
    public static void superficie(int lado){
        int superficie= lado*lado;
        System.out.println("La superficie del cuadrado de lado "+lado+" es: "+superficie);
    }

    public static void main(String[] args) {
        superficie(9);
        superficie(8);
    }
}
