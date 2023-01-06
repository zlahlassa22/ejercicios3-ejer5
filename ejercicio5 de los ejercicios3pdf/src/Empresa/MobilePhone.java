package Empresa;

public class MobilePhone {
    private String numero;
    private int bateria;
    MobilePhone(String nu, int b){
        numero=nu;
        bateria=b;
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
