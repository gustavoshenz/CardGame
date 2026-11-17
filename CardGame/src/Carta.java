public class Carta {
    private String nome;
    private String tipo;
    private int pontosAtaque;

    public Carta(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Carta(String nome) {
        this.nome = nome;
        this.tipo = "Mana não definida";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPontosAtaque() {
        return pontosAtaque;
    }

    public boolean setPontosAtaque(int pontosAtaque) {
        if (pontosAtaque < 0 || pontosAtaque > 10) {
            return false;
        }
        this.pontosAtaque = pontosAtaque;
        return true;
    }
}


