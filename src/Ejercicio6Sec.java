import java.util.Scanner;
public class Ejercicio6Sec {
    public static void main(String[] args) {
        float horaspordia,horastotales;
        int minutos,minutostotales;
    String materia1,materia2,materia3;
    Scanner lectura= new Scanner(System.in);
    System.out.println("Diga cual es la materia n1:");
    materia1=lectura.next();
    System.out.println("Diga cual es la materia n2:");
    materia2=lectura.next();
    System.out.println("Diga cual es la materia n3:");
    materia3=lectura.next();
    System.out.println("Ahora diga la cantidad de horas diarias disponibles:");
    horaspordia=lectura.nextFloat();
    minutos=(int) horaspordia*60;
    horastotales=horaspordia*7;
    minutostotales=minutos*7;
    System.out.println("Una buena distribución de las horas de estudio por cada materia(cada dia)sería: " +
            materia1+": "+minutos/3+" minutos -"+
            materia2+": "+minutos/3+" minutos -"+
            materia3+": "+minutos/3+" minutos -"
    );
    System.out.println("La cantidad de horas disponibles es: "+horastotales+", por lo que lo mejor seria estudiar cada materia "+minutostotales/3+" minutos en total en toda la semana.");



    }
}