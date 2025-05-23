public class Filme {
    private int id;
    private String titulo;
    private Genero genero;

    public Filme(int id, String titulo, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getID() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void mostrar() {
        System.out.println("_".repeat(30));
        System.out.println("Informações do filme:");
        System.out.println("ID: " + this.id + " | Título: " + this.titulo);
        genero.mostrar();
    }
}
