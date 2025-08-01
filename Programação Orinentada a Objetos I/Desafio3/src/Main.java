import java.util.Scanner;

/**
 * Classe principal para testar a implementação do controle de acesso de forma interativa.
 */
public class Main {

    public static void main(String[] args) {
        // Objeto para ler a entrada do usuário pelo console
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cadastro de Novo Administrador ---");

        // Solicita e lê o nome
        System.out.print("Digite o nome do administrador: ");
        String nome = scanner.nextLine();

        // Solicita e lê o email
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        String senha;
        // Loop para garantir que a senha digitada seja forte
        do {
            System.out.print("Digite uma senha (deve ter mais de 8 caracteres e um número): ");
            senha = scanner.nextLine();
            if (!SegurancaUtils.validarSenhaForte(senha)) {
                System.out.println("Senha inválida! Por favor, siga as regras de segurança.");
            }
        } while (!SegurancaUtils.validarSenhaForte(senha));

        // 1. Instanciando um Administrador com os dados fornecidos pelo usuário
        Administrador admin = new Administrador(nome, email, senha);
        System.out.println("\n>> Administrador '" + admin.nome + "' cadastrado com sucesso! <<");

        System.out.println("\n--- Teste de Funcionalidades ---");

        // Exibindo informações do usuário cadastrado
        System.out.println("\nInformações do usuário cadastrado:");
        admin.exibirUsuario();

        // 3. Testando o método de autenticação
        System.out.print("\nPara testar, digite a senha de '" + admin.nome + "': ");
        String tentativaSenha = scanner.nextLine();
        if (admin.autenticar(tentativaSenha)) {
            System.out.println("Autenticação bem-sucedida!");
        } else {
            System.out.println("Autenticação falhou. Senha incorreta.");
        }

        // 4. Testando a redefinição de senha
        System.out.println("\n--- Redefinição de Senha ---");
        String novaSenha;
        do {
            System.out.print("Digite a NOVA senha (seguindo as mesmas regras): ");
            novaSenha = scanner.nextLine();
            if (!SegurancaUtils.validarSenhaForte(novaSenha)) {
                System.out.println("Nova senha inválida! Por favor, siga as regras de segurança.");
            }
        } while (!SegurancaUtils.validarSenhaForte(novaSenha));

        admin.redefinirSenha(novaSenha);
        System.out.println("Testando autenticação com a nova senha ('" + novaSenha + "'): " + admin.autenticar(novaSenha));


        // Fechando o scanner para liberar recursos
        scanner.close();
        System.out.println("\n--- Sistema finalizado ---");
    }
}