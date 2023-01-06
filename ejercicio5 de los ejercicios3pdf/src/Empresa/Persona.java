package Empresa;

public class Persona {
   private String nombre;
   private String DNI;
   private int altura;
   private  int peso;
    Persona(String n, String d, int a, int p){
        nombre=n;
        DNI=d;
        altura=a;
        peso=p;
    }
    Persona(String d){

    }
    String getnombre(){
        return nombre;
    }
    String getDNI(){
        return DNI;
    }
    int getAltura(){
        return altura;
    }
    int getPeso(){
        return peso;
    }
    void nombreypeso(){
        String nombypeso;
        System.out.println(nombre+" "+peso);
        nombypeso=nombre+peso;

    }
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + DNI + ", Altura: " + altura + ", Peso: " + peso;
    }


}
