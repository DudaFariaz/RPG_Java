import java.util.Locale;
import java.util.Scanner;

public class Programa {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar Personagem 1
        System.out.print("Digite o nome do personagem 1: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a classe do personagem 1 (guerreiro, mago, arqueiro): ");
        String classe1 = scanner.nextLine();
        Personagem p1 = new Personagem(nome1, classe1);

        // Criar Personagem 2
        System.out.print("\nDigite o nome do personagem 2: ");
        String nome2 = scanner.nextLine();
        System.out.print("Digite a classe do personagem 2 (guerreiro, mago, arqueiro): ");
        String classe2 = scanner.nextLine();
        Personagem p2 = new Personagem(nome2, classe2);

        // Mostrar status iniciais
        System.out.println("\nStatus iniciais:");
        p1.mostrarStatus();
        p2.mostrarStatus();

        // Mostrar desenhos
        p1.desenharPersonagem();
        p2.desenharPersonagem();

        // Interação: P1 ataca P2
        System.out.println("\n" + p1.nome + " ataca " + p2.nome + ":");
        p1.atacar();
        p2.receberDano(p1.forca);

        // P2 usa habilidade especial
        System.out.println("\n" + p2.nome + " usa habilidade especial:");
        p2.usarHabilidadeEspecial();

        // P2 ataca P1
        System.out.println("\n" + p2.nome + " ataca " + p1.nome + ":");
        p2.atacar();
        p1.receberDano(p2.forca);

        // Subir nível dos dois
        p1.subirNivel();
        p2.subirNivel();

        // Mostrar status finais
        System.out.println("\nStatus finais:");
        p1.mostrarStatus();
        p2.mostrarStatus();

        scanner.close();
    }
}
