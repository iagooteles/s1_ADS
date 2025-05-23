import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite o nome do filme: ");
        // String nomeFilme = scanner.nextLine();
        // System.out.println("Digite o ID do filme: ");
        // int idFilme = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("Digite o genero do filme: ");
        // String generoFilme = scanner.nextLine();
        // System.out.println("Digite o ID do genero: ");
        // int idGenero = scanner.nextInt();
        // scanner.nextLine();

        // if (nomeFilme == null || idFilme < 0 || generoFilme == null || idGenero < 0)
        // {
        // System.out.println("Opções inválidas, tente novamente.");
        // scanner.close();
        // return ;
        // }

        Filme filme = getInfoFilme(scanner);

        while (!validarFilme(filme)) {
            filme = getInfoFilme(scanner);
        }

        filme.mostrar();
        scanner.close();
    }

    public static boolean validarFilme(Filme filme) {
        if (filme.getTitulo() == "" || filme.getID() < 0 || filme.getGenero().getDescGenero() == "" || filme.getGenero().getID() < 0) {
            System.out.println("Informações incorretas! Tente novamente!");
            System.out.println("_".repeat(30));
            return false;
        }
        return true;
    }

    public static Filme getInfoFilme(Scanner scanner) {
        System.out.println("Digite o nome do filme: ");
        String tituloFilme = scanner.nextLine();
        System.out.println("Digite o ID do filme: ");
        int idFilme = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o genero do filme: ");
        String generoFilme = scanner.nextLine();
        System.out.println("Digite o ID do genero: ");
        int idGenero = scanner.nextInt();
        scanner.nextLine();

        Filme filme = new Filme(idFilme, tituloFilme, new Genero(idGenero, generoFilme));

        return filme; 
    }
}
