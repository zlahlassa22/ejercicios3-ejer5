package Empresa;

public class main {
    public static void main(String[] args){
        MobilePhone prueba= new MobilePhone("46789766i",90);
        Empleado proba= new Empleado("RAUL","46556TG",190,100,200,prueba);
        System.out.println(proba.toString());
        for (int i=0;i<2;i++){
            proba.trabajar();
        }
        System.out.println(proba.toString());




    }
}
