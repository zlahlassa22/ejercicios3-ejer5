package Empresa;

public class MobilePhone {
    private String numero;
    private int bateria;
    MobilePhone(String nu, int bat){
        numero=nu;
        bateria=bat;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
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
