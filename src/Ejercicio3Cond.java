import java.util.Scanner;

class Ejercicio3Cond {
    public static void main(String[] args) {
        int gustodelibro;
        Scanner lectura= new Scanner(System.in);
        System.out.println("Diga que genero de peliculas le gusta. Opciones: fantasía (1), misterio(2), romance (3), ciencia ficción(4)");
        gustodelibro=lectura.nextInt();
        switch (gustodelibro){
            case 1:
                System.out.println("Libro recomendado: El señor de los anillos");
                break;
            case 2:
                System.out.println("Libro recomendado: El código Da Vinci ");;
                break;
            case 3:
                System.out.println("Libro recomendado: Bajo la misma estrella");
                break;
            case 4:
                System.out.println("Libro recomendado: Soy leyenda");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }



    }
}