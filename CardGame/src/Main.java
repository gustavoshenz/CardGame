import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cartas reais do TCG Magic: The Gathering
        Scanner scan = new Scanner(System.in);
        Carta carta1 = new Carta("Lightning Bolt ", "Mountain");
        Carta carta2 = new Carta("Counterspell ");
        System.out.println("Nome: " + carta1.getNome() + "Mana: " + carta1.getTipo());
        System.out.println("Nome: " + carta2.getNome() + "Mana: " + carta2.getTipo());
        System.out.println("Qual o nível de ataque da " + carta1.getNome() + " ?");

        if (!carta1.setPontosAtaque(scan.nextInt())) {
            System.out.println("O ataque não pode ser negativo. Ajustado para 0");
        }

        System.out.println("Qual o nível de ataque da " + carta2.getNome() + " ?");

        if (!carta2.setPontosAtaque(scan.nextInt())) {
            System.out.println("O ataque não pode ser negativo. Ajustado para 0");
        }

    }
}