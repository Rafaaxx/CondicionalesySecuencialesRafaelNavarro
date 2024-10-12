import java.util.Scanner;

public class Ejercicio7Sec {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        int niveldesalud;
        int satisfaccion, estres, salud;
        System.out.println("Diga su nivel de satisfacción en su vida");
        satisfaccion=lectura.nextInt();
        System.out.println("Ahora diga su nivel de estrés");
        estres=lectura.nextInt();
        estres=estres*-1;
        System.out.println("Por último, diga su nivel de salud");
        salud=lectura.nextInt();
        niveldesalud=(estres+salud+satisfaccion)/3;
        if (niveldesalud<3){
            System.out.println("Su nivel de salud es muy bajo, debe mejorar su calidad de vida");
        }
        else if (niveldesalud>=3 && niveldesalud<=7){
            System.out.println("Su nivel de salud es intermedio");
        }
        else if (niveldesalud>7) {
            System.out.println("Felicitaciones, su nivel de salud es muy bueno");
        }
        if (estres<-4) {
            System.out.println("Su nivel de estres es muy alto");
        }
         if (satisfaccion<6){
            System.out.println("Debe mejorar su nivel de satisfacción con la vida");

        }
        if (salud<6){
            System.out.println("Debe mejorar su estado de salud");

        }


    }
}
