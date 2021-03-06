package com.marneicardoso.agenda.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	// Abre a conexão com o DB
	public Connection abrirConexao() throws SQLException {
		// Atributos da conexão
		String servidor = "localhost";
		// String porta = ":3306";
		String porta = "";
		String nomeDB = "/conecta_sus";
		String usuario = "root";
		String senha = "";
		
		// Monta a URL de conexão
		String url = "jdbc:mysql://" + servidor + porta + nomeDB;
		// String connectionString = "jdbc:mysql://localhost/" + dbName + "?user=" 
		// + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
				   // jdbc:mysql://localhost:3307/agenda_db
				   // jdbc:mysql://localhost/agenda_db (sem a porta, no Xampp)
		
		// Interface de conexão com o DB
		Connection conn = DriverManager.getConnection(url, usuario, senha);
		return conn;
	}
	
	// Fecha a conexão com o DB
	public void fecharConexao(Connection conexaoAberta) throws SQLException {
		conexaoAberta.close();
	}
}














