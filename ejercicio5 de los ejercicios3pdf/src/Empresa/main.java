package Empresa;

public class main {
    public static void main(String[] args){
        MobilePhone prueba= new MobilePhone("46789766",90);
        Empleado proba= new Empleado("RAUL","46556TG",190,100,200,prueba);
        proba.nombreypeso();
        for (int i=0;i<=1;i++){
            proba.trabajar();
        }
        proba.nombreypeso();




    }
}
