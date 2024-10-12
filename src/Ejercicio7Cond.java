import java.util.Scanner;

public class Ejercicio7Cond {
    public static void main(String[] args) {
        String estadoanimo;
        Scanner lectura= new Scanner(System.in);
        System.out.println("Dime como te sientes: feliz, triste, energico o relajado.");
        estadoanimo=lectura.next();
        if (estadoanimo.equals("feliz")){
            System.out.println("Bien! te recomiendo hacer actividades que fomenten tu felicidad, como salir a pasear o escuchar música");
        }
        else if (estadoanimo.equals("energico")){
            System.out.println("Te recomiendo hacer actividad física o jugar a algun juego.");

        }
        else if (estadoanimo.equals("triste")){
            System.out.println("Te recomiendo hablar con alguien o escribir tus pensamientos. También puedes hacer actividad física, eso ayuda mucho.");
        }
        else if (estadoanimo.equals("relajado")){
            System.out.println("Te recomiendo meditar, escuchar música suave, leer un libro o cosas de ese estilo.");
        }
        else{
            System.out.println("No ha elegido una de las opciones disponibles. Recuerde que debe usar 'triste', 'feliz', 'energico' o 'relajado'");
        }
    }

}
