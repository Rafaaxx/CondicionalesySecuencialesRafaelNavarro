import java.util.Scanner;

public class Ejercicio5Sec {
    public static void main(String[] args) {
    int distancia;
    float consumo,precio,preciototal;
    Scanner lectura= new Scanner(System.in);
    System.out.println("Diga la distancia recorrida en kilometros");
    distancia=lectura.nextInt();
    System.out.println("Diga el consumo de combustible en litros por kilometro");
    consumo=lectura.nextFloat();
    System.out.println("Por último, diga el precio del combustible por litro");
    precio=lectura.nextFloat();
    preciototal=(precio*consumo)*distancia;
    System.out.println("El costo total del viaje es de "+preciototal+"$" );



    }
}
