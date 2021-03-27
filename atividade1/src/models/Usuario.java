package models;

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private String email;

    public Usuario(){
    }
    public Usuario(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // getters
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
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

    // metodos
    public Boolean validarSenha(String senha){
        return this.senha.equals(senha);
    }
}
