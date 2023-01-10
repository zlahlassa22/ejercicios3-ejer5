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
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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
    public String toString() {
        return "Nombre: " + getnombre() + ", DNI: " + getDNI() + ", Altura: " + getAltura() + ", Peso: " + getPeso();
    }


}
