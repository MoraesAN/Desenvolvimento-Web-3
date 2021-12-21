package com.marneicardoso.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UnidadeDAO {

	public Boolean cadastrarUnidadeDAO(Unidade unidade) throws SQLException {
		// Instrução SQL para adicionar um registro no DB		
		String sql = "INSERT INTO unidade (nome, telefone, local, atendimento)"
				+ " VALUES (?, ?, ?, ?, ?)";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interrogação
		statement.setString(1, unidade.getNome());
		statement.setString(2, unidade.getAtendimento());
		statement.setString(3, unidade.gettelefone());
		statement.setString(4, unidade.getLocal());
		
		
		// Executa a instrução no DB
		statement.execute();
		
		// Fecha Statement e conexão DB
		statement.close();
		conexaoDB.fecharConexao(conn);
		
		return true; // Retorna sucesso do registro
	}
	
	public ResultSet buscarUnidadeDAO(int id) throws SQLException {
		String sql = "";
		
		// Verifica o tipo de busca
		if (id < 1) {
			sql = "SELECT * FROM unidade";
		
		} else {
			sql = "SELECT * FROM unidade WHERE id = " + id;
		}
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		return statement.executeQuery();
	}
	
	public Boolean editarUnidadeDAO(Unidade unidade, int idInformado) throws SQLException {
		// Instru��o SQL para atualizar o registro no DB
		String sql =
			"UPDATE unidade " +
			"SET nome = ?, email = ?, teleone = ?, cpf = ?, cns_sus = ?" +
			"WHERE id = ?";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interroga��o
		statement.setString(1, unidade.getNome());
		statement.setString(2, unidade.getAtendimento());
		statement.setString(3, unidade.gettelefone());
		statement.setString(4, unidade.getLocal());
		statement.setInt(6, idInformado);
		
		statement.executeUpdate();
		return true;
	}
	
	public Boolean excluirUnidadeDAO(int idInformado) throws SQLException {
		// Instru��o SQL para excluir o registro no DB
		String sql =
			"DELETE FROM unidade " +
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