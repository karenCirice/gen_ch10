package mx.org.generation;

public class Aritmetica {

    int a;
    int b;
    
    public void sumar(){
        System.out.println("La suma es: "+(a+b));
    }
    
    public int sumarConReturn(){
        return a+b;
    }
    
    public int sumarConArgumentos(int n1, int n2){
        return n1+n2;
    }
    
    public double usoDeRandom(int limite){
        double numero = Math.random()*limite;
        return numero;
    }
}
