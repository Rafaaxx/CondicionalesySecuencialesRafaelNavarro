import java.util.Scanner;

public class Ejercicio6Cond {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int contador=0;
        int ejercicio, horassueño, comidassaludables;
        System.out.println("Cuantas horas duermes por dia?");
        horassueño = lectura.nextInt();
        System.out.println("Cuantas horas de ejercicio haces por dia?");
        ejercicio = lectura.nextInt();
        System.out.println("Cuantas comidas saludables tienes por dia?");
        comidassaludables = lectura.nextInt();
        if (horassueño >= 8 && horassueño <= 10) {
            System.out.println("Tus horas de sueño cumplen con el mínimo");
            contador+=1;
        } else if (horassueño > 10) {
            System.out.println("Duermes demasiado");
        }
        if (ejercicio>0 && ejercicio<=3){
            System.out.println("Ejercitas bien");
            contador+=1;
        }
        else if (ejercicio>3){
            System.out.println("Ejercitas demasiado");
        }
        else if (ejercicio==0){
            System.out.println("Debes ejercitas de 1 a 3 horas diarias");
        }
        if (comidassaludables>2){
            System.out.println("Te alimentas bien");
            contador+=1;
        }
        else if (comidassaludables<2){
            System.out.println("Debes comer mejor y dejar las comidas chatarra o no saludables");
        }
        switch (contador){
            case 1:
                System.out.println("Debes aumentar los hábitos saludables y mejorar tu calidad de vida");
            case 2:
                System.out.println("Felicidades, vas en buen camino");
            case 3:
                System.out.println("Excelente! tienes una vida muy saludable");
            default:
        }
    }
}