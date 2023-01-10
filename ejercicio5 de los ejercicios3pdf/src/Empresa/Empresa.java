package Empresa;

public class Empresa {
    private String nombre;
    private int ganancia;
    private Empleado jefe;
    private Empleado gerente;
    Empresa(String n, int g,Empleado j){
        nombre=n;
        ganancia=g;
        jefe=j;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setGanancia(int ganancia){
        this.ganancia=ganancia;
    }
    public void setJefe(Empleado jefe){
        this.jefe=jefe;
    }
    public void setGerente(Empleado gerente){
        this.gerente=gerente;
    }
    public String getNombre(){
        return nombre;
    }
    public int getGanancia(){
        return ganancia;
    }
    public Empleado getJefe(){
        return jefe;
    }
    public Empleado getGerente(){
        return gerente;
    }


    void contratargerente(Empleado gerente){
         this.gerente= gerente;
    }
    void trabajo(){
        jefe.trabajar();
        gerente.trabajar();
        ganancia=ganancia+100;

    }
    public String toString() {
        return "Nombre: " + getNombre() + ", Ganancia: " + getGanancia() + ", Jefe: " + getJefe() + ", Gerente: " + getGerente();
    }


}
