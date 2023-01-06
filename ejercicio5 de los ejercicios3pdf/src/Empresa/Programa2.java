package Empresa;

public class Programa2 {
    public static void main(String[] args){
        MobilePhone num= new MobilePhone("12345646",96);
        Empleado jefe= new Empleado("ZAKARIA","564545z",185,80,500,num);
        Empresa emp= new Empresa("ZUBIRI",23506,jefe);
        Empleado gerente= new Empleado("ZAKA","34546r",183,86,200,num);
        emp.contratargerente(gerente);
        emp.toString();
        System.out.println(emp.toString());
        for (int i=0;i<=1;i++){
            emp.trabajo();
        }
        emp.toString();
        System.out.println(emp.toString());


    }
}
