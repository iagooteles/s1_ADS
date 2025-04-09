public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("123", "456", "A1", 111);

        a1.mostrarAluno();

        Funcionario f1 = new Funcionario("1234", "12312312", "Func", "POO", 1238457);
        f1.receberSalario();
        f1.mostrar();

        Bolsista b1 = new Bolsista("11111", "2222", "Bolsista", 92837634, true);
        b1.estudar();
    }
}
