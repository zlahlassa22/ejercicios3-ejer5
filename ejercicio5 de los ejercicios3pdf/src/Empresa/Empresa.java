package Empresa;

public class Empresa {
     String nombre;
     int ganancia;
    Empleado jefe;
    Empleado gerente;
    Empresa(String n, int g,Empleado j){
        nombre=n;
        ganancia=g;
        jefe=j;
    }
    void contratargerente(Empleado gerente){
         this.gerente= gerente;
    }
    void trabajo(){
        jefe.trabajar();
        gerente.trabajar();
        ganancia=ganancia+100;

    }
    void mostrar(){
        System.out.println(nombre+" "+ganancia+" "+jefe+" "+gerente);
    }


}
