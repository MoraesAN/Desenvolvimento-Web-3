package com.marneicardoso.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EspecialidadeDAO {

	public Boolean cadastrarEspecialidadeDAO(Especialidade especialidade) throws SQLException {
		// Instrução SQL para adicionar um registro no DB		
		String sql = "INSERT INTO especialidade (nome, pre_requisitos)"
				+ " VALUES (?, ?)";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interrogação
		statement.setString(1, especialidade.getNome());
		statement.setString(2, especialidade.getPre_requisitos());
		
		// Executa a instrução no DB
		statement.execute();
		
		// Fecha Statement e conexão DB
		statement.close();
		conexaoDB.fecharConexao(conn);
		
		return true; // Retorna sucesso do registro
	}
	
	public ResultSet buscarEspecialidadeDAO(int id) throws SQLException {
		String sql = "";
		
		// Verifica o tipo de busca
		if (id < 1) {
			sql = "SELECT * FROM especialidade";
		
		} else {
			sql = "SELECT * FROM especialidade WHERE id = " + id;
		}
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		return statement.executeQuery();
	}
	
	public Boolean editarEspecialidadeDAO(Especialidade especialidade, int idInformado) throws SQLException {
		// Instru��o SQL para atualizar o registro no DB
		String sql =
			"UPDATE especialidade " +
			"SET nome = ?, pre_requisitos = ?" +
			"WHERE id = ?";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interroga��o
		statement.setString(1, especialidade.getNome());
		statement.setString(2, especialidade.getPre_requisitos());
		statement.setInt(4, idInformado);
		
		statement.executeUpdate();
		return true;
	}
	
	public Boolean excluirEspecialidadeDAO(int idInformado) throws SQLException {
		// Instru��o SQL para excluir o registro no DB
		String sql =
			"DELETE FROM especialidade " +
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