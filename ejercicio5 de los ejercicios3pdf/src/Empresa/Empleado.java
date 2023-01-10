package Empresa;

public class Empleado extends Persona {
    private int dinero;
    private MobilePhone mp;

    Empleado(String n, String d, int a, int p,int din, MobilePhone mp) {
        super(n, d, a, p);
        dinero=din;
        this.mp=mp;

    }
    public void setDinero(int dinero){
        this.dinero=dinero;
    }

    public void setMp(MobilePhone mp) {
        this.mp = mp;
    }

    public MobilePhone getMp() {
        return mp;
    }

    public int getDinero() {
        return dinero;
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
    void trabajar(){
       mp.usar();
       ganardinero(+10);
    }
    public String toString() {
        return super.toString() + ", Dinero: " + dinero + ", Bateria: " + mp.getBateria();
    }

}
