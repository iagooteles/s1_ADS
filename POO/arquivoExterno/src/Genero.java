import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Genero {
    private int idGenero;
    private String genero;

    public Genero (int idGenero, String genero) {
        this.idGenero = 0;
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public boolean inserir() {
        try {
            FileWriter fw = new FileWriter("genero.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o genero: ");
            String genero = sc.nextLine();

            FileReader fr = new FileReader("genero.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linha;
            int ultimoID = 0;
            while ((linha = br.readLine()) != null) {
                linha.split(";");
                String[] partes = linha.split(";");
                ultimoID = Integer.parseInt(partes[0]);
            }

            int idGenero = ultimoID + 1;

            bw.write(idGenero + ";" + genero + "\n");

            bw.close();
            sc.close();
            return true;
        } catch(IOException exception) {
            exception.getMessage();
            return false;
        }
    }

    public ArrayList<Genero> listar() {
        try {
            FileReader fr = new FileReader("genero.txt");
            BufferedReader br = new BufferedReader(fr);
            
            ArrayList<Genero> lista = new ArrayList();
            
            String linha;
            while ((linha = br.readLine()) != null) {
                linha.split(";");
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);

                String genero = partes[1];

                lista.add(new Genero(id, genero));
            }

            return lista;
        } catch (IOException exception) {
            exception.getMessage();

            return null;
        }
    }

    public Genero consultar(int idBusca) {
        try {
            FileReader fr = new FileReader("genero.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String linha;
            while ((linha = br.readLine()) != null) {
                linha.split(";");
                String[] partes = linha.split(";");
                int id = Integer.parseInt(partes[0]);
                String genero = partes[1];

                if (id == idBusca) {
                    return new Genero(id, genero);
                }
            }

            return null;
        } catch (IOException exception) {
            exception.getMessage();
            return null;
        }
    }

    // Terminar!!
    public boolean editar() {
        try {
            FileWriter fw = new FileWriter("genero.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            Scanner sc = new Scanner(System.in);

            FileReader fr = new FileReader("genero.txt");
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Digite o id que deseja editar: ");
            int editarID = sc.nextInt();
            sc.nextLine();
            
            String linha;
            while ((linha = br.readLine()) != null) {
                linha.split(";");
                String[] partes = linha.split(";");
                int idGenero = Integer.parseInt(partes[0]);

                if (idGenero == editarID) {
                    System.out.println("Digite o novo nome de genero: ");
                    String genero = sc.nextLine();

                    bw.write(editarID + ";" + genero + "\n");
                }
            }

            bw.close();
            sc.close();
            return true;
        }catch (IOException exception) {
            exception.getMessage();
            return false;
        }
    }
}
