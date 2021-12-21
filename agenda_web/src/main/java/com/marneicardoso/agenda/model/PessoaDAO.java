package com.marneicardoso.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PessoaDAO {

	public Boolean cadastrarPessoaDAO(Pessoa pessoa) throws SQLException {
		// Instrução SQL para adicionar um registro no DB		
		String sql = "INSERT INTO pessoa (nome, email, telefone, cpf, cns_sus)"
				+ " VALUES (?, ?, ?, ?, ?)";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interrogação
		statement.setString(1, pessoa.getNome());
		statement.setString(2, pessoa.getEmail());
		statement.setString(3, pessoa.gettelefone());
		statement.setString(4, pessoa.getCns_sus());
		statement.setString(5, pessoa.getCpf());
		
		// Executa a instrução no DB
		statement.execute();
		
		// Fecha Statement e conexão DB
		statement.close();
		conexaoDB.fecharConexao(conn);
		
		return true; // Retorna sucesso do registro
	}
	
	public ResultSet buscarPessoaDAO(int id) throws SQLException {
		String sql = "";
		
		// Verifica o tipo de busca
		if (id < 1) {
			sql = "SELECT * FROM pessoa";
		
		} else {
			sql = "SELECT * FROM pessoa WHERE id = " + id;
		}
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		return statement.executeQuery();
	}
	
	public Boolean editarPessoaDAO(Pessoa pessoa, int idInformado) throws SQLException {
		// Instru��o SQL para atualizar o registro no DB
		String sql =
			"UPDATE pessoa " +
			"SET nome = ?, email = ?, teleone = ?, cpf = ?, cns_sus = ?" +
			"WHERE id = ?";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interroga��o
		statement.setString(1, pessoa.getNome());
		statement.setString(2, pessoa.getEmail());
		statement.setString(3, pessoa.gettelefone());
		statement.setString(4, pessoa.getCns_sus());
		statement.setString(5, pessoa.getCpf());
		statement.setInt(6, idInformado);
		
		statement.executeUpdate();
		return true;
	}
	
	public Boolean excluirPessoaDAO(int idInformado) throws SQLException {
		// Instru��o SQL para excluir o registro no DB
		String sql =
			"DELETE FROM pessoa " +
			"WHERE id = ?";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interroga��o
		statement.setInt(1, idInformado);
		
		statement.executeUpdate();
		return true;
	}
}







