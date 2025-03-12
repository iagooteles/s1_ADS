public class App {
    public static void main(String[] args) throws Exception {
        Empregado empregado1 = new Empregado("fulano", "Souza", -50);
        Empregado empregado2 = new Empregado("cicrano", "peddrito", 100);

        System.out.println("Salário anual de " + empregado1.getNome() + " " + empregado1.getSobrenome() + " é de: " + empregado1.calcularSalarioAnual());

        System.out.println("Salário anual de " + empregado2.getNome() + " " + empregado2.getSobrenome() + " é de: " + empregado2.calcularSalarioAnual());

        System.out.println("_".repeat(50));
        empregado1.setSalarioMensal(400);
        System.out.println("salario mensal de " + empregado1.getNome() + " setado para: " + empregado1.getSalarioMensal());
        empregado1.forneceAumento();
        System.out.println("salario mensal de " + empregado1.getNome() + " depois do aumento foi para: " + String.format("%.2f", empregado1.getSalarioMensal()));

    }
}
