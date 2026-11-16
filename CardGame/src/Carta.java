public class Carta {
    private String nome;
    private String tipo;

    public Carta (String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public Carta(String nome) {
        this.nome = nome;
        this.tipo = "Ilha não definida";
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


