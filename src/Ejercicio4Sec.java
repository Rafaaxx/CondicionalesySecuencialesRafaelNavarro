import java.util.Scanner;

public class Ejercicio4Sec {
    public static void main(String[] args) {
        String estadoanimo;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Diga su estado de ánimo (feliz, triste, energico o relajado)");
        estadoanimo = lectura.next();
        switch (estadoanimo) {
            case "feliz":
                System.out.println("Lista de reproducción para estado de ánimo feliz:");
                System.out.println("1. Happy - Pharrell Williams");
                System.out.println("2. Walking on Sunshine - Katrina and the Waves");
                System.out.println("3. La Bicicleta - Carlos Vives & Shakira");
                System.out.println("4. Color Esperanza - Diego Torres");
                break;
            case "triste":
                System.out.println("Lista de reproducción para estado de ánimo triste:");
                System.out.println("1. Someone Like You - Adele");
                System.out.println("2. Fix You - Coldplay");
                System.out.println("3. Te Amo - Franco de Vita");
                System.out.println("4. Ojalá - Silvio Rodríguez");
                break;
            case "energico":
                System.out.println("Lista de reproducción para estado de ánimo enérgico:");
                System.out.println("1. Eye of the Tiger - Survivor");
                System.out.println("2. Stronger - Kanye West");
                System.out.println("3. La Gozadera - Gente de Zona ft. Marc Anthony");
                System.out.println("4. Bomba - Los Angeles Azules ft. Celso Piña");
                break;
            case "relajado":
                System.out.println("Lista de reproducción para estado de ánimo relajado:");
                System.out.println("1. Weightless - Marconi Union");
                System.out.println("2. River Flows in You - Yiruma");
                System.out.println("3. Cielo - Benny Ibarra");
                System.out.println("4. Déjala Que Vuelva - Piso 21 ft. Manuel Turizo");
                break;
        }
    }
}
