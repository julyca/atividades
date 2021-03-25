package models;

public class Usuario {
    private String nome;
    private String senha;
    private String email;
    private static int numConta;

    public Usuario(int conta){
        Usuario.numConta = conta;
    }

    // getters
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public int getNumConta() {
        return numConta;
    }
    public String getSenha() {
        return senha;
    }

    // setters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
