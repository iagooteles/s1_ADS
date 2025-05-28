import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Genero genero = new Genero(0, "generos");
        // genero.inserir();
        // ArrayList<Genero> generos = genero.listar();

        // for (var g: generos) {
        //     System.out.println("Genero: " + g.getGenero());
        // }
    
        // Genero generoConsultado = genero.consultar(3);
        // System.out.println("Genero consultado: " + generoConsultado.getGenero());

        genero.editar();
    }
}
