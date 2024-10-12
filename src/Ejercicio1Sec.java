import java.util.Scanner;

public class Ejercicio1Sec {
    public static void main(String[] args) {
        int dia, mes;

        Scanner lectura = new Scanner(System.in);
        String fechanacimiento;
        System.out.println("Diga su fecha de nacimiento en formato dia/mes/año");
        fechanacimiento = lectura.next();
        String[] tabla;
        tabla = fechanacimiento.split("/");
        dia = Integer.parseInt(tabla[0]);
        mes = Integer.parseInt(tabla[1]);
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Acuario: Hoy es un buen día para nuevas ideas. ");
        }
        if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Piscis: Escucha tu intuición ");
        }
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries: La energía está a tu favor, actúa.");
        }
        if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Tauro: La paciencia traerá recompensas. ");
        }
        if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Geminis: La comunicación es clave hoy.");
        }
        if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Cancer: Es un buen momento para conectar con la familia.");
        }
        if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Leo: Brilla con confianza.");
        }
        if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgo: Organiza tus ideas para avanzar.");
        }
        if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra: Busca el equilibrio en tus decisiones.");
        }
        if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpio: Profundiza en tus relaciones.");
        }
        if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Sagitario: Aprovecha la aventura que te espera ");
        }
        if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio: El esfuerzo dará frutos");
        }
    }
    }