import java.util.ArrayList;

public class Deck {
    private ArrayList<Deck> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public void adicionaCard(Deck deck) {
        this.deck.add(deck);
    }
    public Deck buscaCard (String nomeBuscado) {

        for (Carta c: ) {
            if (c.getNome().equalsIgnoreCase(nomeBuscado)){
                return c;
            }
        } return null;
    }
}
