package br.mackenzie.gerenciamentofuncionarios;

/**
 *
 * @author Matheus Henrique de Oliveira Santos - 10409051
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private Connection conexao;

    public FuncionarioDAO() throws SQLException {
        this.conexao = ConexãoBanco.obterConexao();
    }

    public void adicionar(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionario (nome, cargo) VALUES (?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.executeUpdate();
        }
    }

    public List<Funcionario> obterLista() throws SQLException {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionarios.add(funcionario);
            }
        }
        return funcionarios;
    }
}