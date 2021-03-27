package models;

public class Contas {
    private int id;
    private double saldo;
    private int idUsuario;

    public Contas(){}
    public Contas(int id, double saldo, int idUsuario){
        this.id = id;
        this.idUsuario = idUsuario;
        this.saldo = saldo;
    }

    // getters
    public int getId() {
        return id;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public double getSaldo() {
        return saldo;
    }

    public Boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
}
