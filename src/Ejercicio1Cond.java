import java.util.Scanner;

class Ejercicio1Cond {
        public static void main(String[] args) {
                int gusto;
                Scanner lectura= new Scanner(System.in);
                System.out.println("Diga que genero de peliculas le gusta. Opciones: acción (1), comedia(2), drama(3), ciencia ficción(4)");
                gusto=lectura.nextInt();
                switch (gusto){
                        case 1:
                                System.out.println("Película recomendada: Rambo");
                                break;
                        case 2:
                                System.out.println("Película recomendada: ¿Qué pasó ayer?");
                                break;
                        case 3:
                                System.out.println("Película recomendada: Forrest Gump");
                                break;
                        case 4:
                                System.out.println("Película recomendada: Avengers: Endgame");
                        default:
                                System.out.println("Opción incorrecta");
                                break;
                }



        }
}