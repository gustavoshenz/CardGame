//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Cartas reais do TCG Magic: The Gathering
        Carta carta1 = new Carta("Lightning Bolt, Mountain");
        Carta carta2 = new Carta("Counterspell");
        System.out.println("Nome: " + carta1.getNome() + "Ilha: " + carta1.getTipo());
        System.out.println("Nome: " + carta2.getNome() + carta2.getTipo());


    }
}