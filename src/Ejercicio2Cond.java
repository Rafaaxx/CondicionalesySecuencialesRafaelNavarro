import java.util.Scanner;

public class Ejercicio2Cond {
    public static void main(String[] args) {
        Float precio;
        Float preciototal;
        String categoria;
        Scanner lectura= new Scanner(System.in);
        System.out.println("Diga el precio");
        precio= lectura.nextFloat();
        System.out.println("Diga si su categoria: 'jubilado', 'estudiante' o 'adulto'");
        categoria=lectura.next();
        switch (categoria) {
                case "jubilado":
                    preciototal= (float) (precio-(precio*0.15));
                    System.out.println("El descuento es del 15%, el resultado es "+preciototal);
                    break;
                case "estuidiante":
                    preciototal= (float) (precio-(precio*0.1));
                    System.out.println("El descuento es del 10%, el resultado es "+preciototal);
                    break;
                case "adulto":
                    preciototal= (float) (precio-(precio*0.05));
                    System.out.println("El descuento es del 5%, el resultado es "+preciototal);
                    break;
                default:
                    System.out.println("No ha elegido una de las opciones disponibles");
                    break;

        }
    }
}
