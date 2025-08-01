public abstract class Usuario {
    private String senha;
    protected String email;
    public String nome;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.setSenha(senha);
    }

    public abstract boolean autenticar(String senha);

    public final void exibirUsuario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
    }

    protected String getSenha() { return this.senha; }
    protected void setSenha(String senha) { this.senha = senha; }
}