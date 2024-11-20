package Ejercicio1;

public class Ejecucion {

    public static void main(String[] args) {
        
        Rectangulo rectan = new Rectangulo(7,3);
        Triangulo trian = new Triangulo(4,6);
        
        System.out.println("Area del rectangulo: "+rectan.calcularArea());
        System.out.println("Area del triangulo: "+trian.calcularArea());
        
    }
    
}
