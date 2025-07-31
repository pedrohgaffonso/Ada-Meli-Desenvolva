import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        String continuar;

        do {
            System.out.println("\n--- Cadastro de Novo Aluno ---");

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o curso: ");
            String curso = scanner.nextLine();

            System.out.print("Digite a matrícula (ou pressione Enter para não informar): ");
            String matriculaStr = scanner.nextLine();

            Aluno novoAluno;
            if (matriculaStr.isEmpty()) {
                novoAluno = new Aluno(nome, curso);
            } else {
                try {
                    int matricula = Integer.parseInt(matriculaStr);
                    novoAluno = new Aluno(nome, matricula, curso);
                } catch (NumberFormatException e) {
                    System.out.println("Matrícula inválida. O aluno será cadastrado sem matrícula.");
                    novoAluno = new Aluno(nome, curso);
                }
            }
            alunos.add(novoAluno);

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\n--- Lista de Alunos Cadastrados ---");
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                aluno.exibirDados();
            }
        }

        scanner.close();
    }
}