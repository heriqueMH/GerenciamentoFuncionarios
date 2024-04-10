package br.mackenzie.gerenciamentofuncionarios;

/**
 *
 * @author Matheus Henrique de Oliveira Santos - 10409051
 */

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;

    
    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", cargo=" + cargo + "]";
    }
}