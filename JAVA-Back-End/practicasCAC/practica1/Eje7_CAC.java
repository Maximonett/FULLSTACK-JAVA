package practica1;

public class Eje7_CAC {
    
    public static void imprimirValores(int num){
        int num1=num+1;
        int num2=num*2;
        int num3= num*num;
        System.out.println("El siguiente valor es : "+num1+ "El doble del valor es:"+num2 +"y el cuadrado del valor es "+num3);
    }
    
    public static void main(String[] args) {
        imprimirValores(4);
        imprimirValores(8);
    }


}
