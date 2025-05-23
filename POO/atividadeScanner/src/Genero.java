public class Genero {
    private int id;
    private String descGenero;

    public Genero(int id, String descGenero) {
        this.id = id;
        this.descGenero = descGenero;
    }

    public void mostrar() {
        System.out.println("ID do genero: " + this.id + " | Genero: " + this.descGenero);
    }

    public int getID() {
        return this.id;
    } 

    public String getDescGenero() {
        return this.descGenero;
    }

}
