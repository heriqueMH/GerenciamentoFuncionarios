package br.mackenzie.gerenciamentofuncionarios;

/**
 *
 * @author Matheus Henrique de Oliveira Santos - 10409051
 */

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FuncionarioDAO dao = new FuncionarioDAO();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do funcionário:");
            String nome = scanner.nextLine();

            System.out.println("Digite o cargo do funcionário:");
            String cargo = scanner.nextLine();

            Funcionario novoFuncionario = new Funcionario();
            novoFuncionario.setNome(nome);
            novoFuncionario.setCargo(cargo);

            dao.adicionar(novoFuncionario);

            List<Funcionario> funcionarios = dao.obterLista();
            for (Funcionario funcionario : funcionarios) {
                System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
            }
            scanner.close();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
