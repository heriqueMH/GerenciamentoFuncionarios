package br.mackenzie.gerenciamentofuncionarios;

/**
 *
 * @author Matheus Henrique de Oliveira Santos - 10409051
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexãoBanco {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/lista_nomes";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection obterConexao() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}