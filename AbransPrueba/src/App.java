import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entra = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre");
            String nom = entra.nextLine();

            System.out.println("Su nombre es: " + nom);
        }
    }
}
