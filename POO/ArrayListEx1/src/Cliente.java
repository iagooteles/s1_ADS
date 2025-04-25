public class Cliente {
    private int id;
    private String nome;
    private int anoNasc;
    private String telefone;

    public Cliente(int id, String nome, int anoNasc, String telefone) {
        this.id = id;
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.telefone = telefone;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAnoNasc() {
        return this.anoNasc;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
