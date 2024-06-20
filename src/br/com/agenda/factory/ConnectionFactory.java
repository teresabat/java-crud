package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// Nome do usuario do mysql
	private static final String USERNAME = "root";

	// Senha do usuario do mysql
	private static final String PASSWORD = "";

	// Caminho do db
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Agenda";

	/*
	 * Conexao com o banco de dados
	 */
	public static Connection createConnectionToMySQL() throws Exception {
		// Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");

		// Cria conexao com banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	public static void main(String[] args) throws Exception {
		
		//Recuperar uma conexao com o db
		Connection con = createConnectionToMySQL();
		
		//Testar se a conexao é nula
		if(con != null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}

}
