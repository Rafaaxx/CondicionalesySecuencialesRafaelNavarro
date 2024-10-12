import java.util.Random;
import java.util.Scanner;

public class Ejercicio5Cond {
    public static void main(String[] args) {
        String decisionusuario;
        Random aleatorio = new Random();
        String[] opciones = {"piedra", "papel", "tijeras"};
        Scanner lectura=new Scanner(System.in);
        System.out.println("Diga: piedra, papel o tijeras: ");
        decisionusuario=lectura.next();
        String eleccionComputadora = opciones[aleatorio.nextInt(opciones.length)];
        System.out.println("Tu elección fue: "+decisionusuario + " , mientras que la de la computadora fue:"+eleccionComputadora);
        if (decisionusuario.equals(eleccionComputadora)) {
            System.out.println("Empate");
         }
        else if ((decisionusuario.equals("tijeras") && eleccionComputadora.equals("piedra")) ||
                (decisionusuario.equals("papel") && eleccionComputadora.equals("tijeras")) ||
                (decisionusuario.equals("piedra") && eleccionComputadora.equals("papel"))) {
            System.out.println("Has perdido");
        }

          else if  ((decisionusuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                   (decisionusuario.equals("tijeras") && eleccionComputadora.equals("papel")) ||
                   (decisionusuario.equals("piedra") && eleccionComputadora.equals("tijeras"))) {
              System.out.println("Has ganado");
        }
    }
}
