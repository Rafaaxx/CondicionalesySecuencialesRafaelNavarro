import java.util.Scanner;

public class Ejercicio3Sec {
    public static void main(String[] args) {
        int nivelejercicio;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Diga el nivel de estado físico que posee para recomendar una rutina (1-Principiante;2-Intermedio;3-Avanzado)");
        nivelejercicio = lectura.nextInt();
        switch (nivelejercicio) {
            case 1:
                System.out.println("Rutina semanal para principiantes:");
                System.out.println("Lunes: 20 min de caminata ligera");
                System.out.println("Martes: Descanso");
                System.out.println("Miércoles: 15 min de yoga");
                System.out.println("Jueves: 20 min de ciclismo suave");
                System.out.println("Viernes: Descanso");
                System.out.println("Sábado: 30 min de caminata ligera");
                System.out.println("Domingo: 15 min de estiramientos");
                break;
            case 2:
                System.out.println("Rutina semanal para intermedios:");
                System.out.println("Lunes: 30 min de carrera suave");
                System.out.println("Martes: 20 min de entrenamiento de fuerza");
                System.out.println("Miércoles: 30 min de natación");
                System.out.println("Jueves: Descanso");
                System.out.println("Viernes: 30 min de ciclismo");
                System.out.println("Sábado: 30 min de yoga");
                System.out.println("Domingo: 40 min de caminata rápida");
                break;
            case 3:
                System.out.println("Rutina semanal para avanzados:");
                System.out.println("Lunes: 45 min de carrera");
                System.out.println("Martes: 30 min de entrenamiento de fuerza");
                System.out.println("Miércoles: 30 min de natación intensa");
                System.out.println("Jueves: 30 min de ciclismo en ruta");
                System.out.println("Viernes: 30 min de HIIT (entrenamiento de alta intensidad)");
                System.out.println("Sábado: 1 hora de senderismo");
                System.out.println("Domingo: 30 min de estiramientos y recuperación activa");


        }
    }
}
