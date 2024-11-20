package Ejercicio3;

public class InterfazIncorrecta implements Observador{
    
    @Override
    public void observar(){
        System.out.println("Te estoy observando");
    }
}
