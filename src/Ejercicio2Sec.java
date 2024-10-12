import java.util.Scanner;

public class Ejercicio2Sec {
    public static void main(String[] args) {
        int duracion,ejercicio;
        float peso,caloriasquemadas;
        Scanner lectura= new Scanner(System.in);
        System.out.println("Seleccione la actividad física que hace (bicicleta(1), correr(2), nadar(3))");
        ejercicio=lectura.nextInt();
        System.out.println("Diga su peso en kg");
        peso= lectura.nextFloat();
        System.out.println("Diga la duración del ejercicio en minutos");
        duracion= lectura.nextInt();
        switch (ejercicio){
            case 1:
                caloriasquemadas=(6*duracion)*(peso/70);
                System.out.println("La pérdida de calorías aproximádamante es de "+caloriasquemadas);
                break;
            case 2:
                caloriasquemadas=(10*duracion)*(peso/70);
                System.out.println("La pérdida de calorías aproximádamante es de "+caloriasquemadas);
                break;
            case 3:
                caloriasquemadas=(8*duracion)*(peso/70);
                System.out.println("La pérdida de calorías aproximádamante es de "+caloriasquemadas);
                break;
            default:
                System.out.println("Número incorrecto");
                break;

        }

    }
}
