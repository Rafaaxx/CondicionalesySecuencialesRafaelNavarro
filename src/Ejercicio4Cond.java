import java.util.Scanner;

public class Ejercicio4Cond {
    public static void main(String[] args) {
        Double peso,altura;
        Double resultado;
        Scanner lectura= new Scanner(System.in);
        System.out.println("Diga su peso");
        peso= lectura.nextDouble();
        System.out.println("Diga su altura");
        altura=lectura.nextDouble();
        resultado=peso/(altura*altura);
        if (resultado<18.5) {
            System.out.println("Tu peso es demasiado bajo");
        }
        else if (resultado>=18.5 && resultado<24.9) {
                   System.out.println("Tu peso es normal");
               }
        else if (resultado>=24.9 && resultado<29.9){
            System.out.println("Tu peso es excedido");
            }
        else{
            System.out.println("Obesidad");
        }


    }
}
