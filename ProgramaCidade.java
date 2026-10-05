import java.util.Scanner;

public class ProgramaCidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a cidade onde nasceu: ");
        String cidade = scanner.nextLine();

        System.out.println("Oi " + nome + "! Que legal saber que você é da cidade " + cidade);

        scanner.close();
    }
}