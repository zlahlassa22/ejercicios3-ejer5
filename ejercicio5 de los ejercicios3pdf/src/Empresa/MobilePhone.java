package Empresa;

public class MobilePhone {
    private String numero;
    private int bateria;
    MobilePhone(String nu, int bat){
        numero=nu;
        bateria=bat;
    }
    String getNumero(){
        return numero;
    }
    int getBateria(){
        return bateria;
    }
    void usar(){
        bateria=bateria-1;
    }
}
