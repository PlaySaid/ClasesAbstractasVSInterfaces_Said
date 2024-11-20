package Ejercicio2;

public class Pato implements Volador, Nadador{
    
    @Override
    public void volar(){
        System.out.println("El pato puede volar.");
    }
    @Override
    public void nadar(){
        System.out.println("Un pato puede nadar.");
    }
    
}
