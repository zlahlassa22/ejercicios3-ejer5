package Empresa;

public class Empleado extends Persona {
    int dinero;
    MobilePhone mp;

    Empleado(String n, String d, int a, int p,int din, MobilePhone mp) {
        super(n, d, a, p);
        dinero=din;
        this.mp=mp;

    }

    void ganardinero(int mas){
        if (mas>0){
            dinero=dinero+mas;
        }else{
            System.out.println("ERROR, INGRESA UN NUMERO MAYOR QUE 0");
        }
    }
    void gastardinero(int menos){
        if (menos<0){
            dinero=dinero-menos;
        }else{
            System.out.println("ERROR , INGRESA UN NUMERO MENOR QUE 0");
        }
    }
    void nombreypeso(){
        super.nombreypeso();
        System.out.println(dinero+" "+mp.getBateria());
    }
    void trabajar(){
       mp.usar();
       ganardinero(+10);
    }

}
