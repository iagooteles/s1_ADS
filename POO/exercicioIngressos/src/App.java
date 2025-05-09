import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Ingresso ingresso1 = new IngressoComum("Show do Matanza", false, 50.0, 1);
        Ingresso ingresso2 = new IngressoVIP("Jogo do Knicks", true, 5.0, 3);
        Ingresso ingresso3 = new IngressoComum("Ticket da Tomorrowland", true, 15000.0, 1);
        Ingresso ingresso4 = new IngressoVIP("Jogo do Warriors", false, 500.0, 1);

        ArrayList<Ingresso> ingressos = new ArrayList<>();
        ingressos.add(ingresso1);
        ingressos.add(ingresso2);
        ingressos.add(ingresso3);
        ingressos.add(ingresso4);

        for (Ingresso ingresso: ingressos) {
            System.out.println("_".repeat(30));
            System.out.println("Ingresso: " + ingresso.nome + "\nSeu reembolso associado: " + ingresso.calculaReembolso());
        }
    }
}
