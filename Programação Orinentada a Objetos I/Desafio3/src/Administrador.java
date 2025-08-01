public class Administrador extends Usuario {
    public Administrador(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean autenticar(String senha) {
        return this.getSenha().equals(senha);
    }

    public void redefinirSenha(String novaSenha) {
        this.setSenha(novaSenha);
        System.out.println("Senha redefinida com sucesso!");
    }
}