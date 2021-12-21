package com.marneicardoso.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicoUnidadeDAO {

	public Boolean cadastrarMedicoUnidadeDAO(MedicoUnidade medicoUnidade) throws SQLException {

		// Instrução SQL para adicionar um registro no DB		
		String sql = "INSERT INTO medico_unidade (id_medico, id_unidade)"
				+ " VALUES (?, ?)";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interrogação
		statement.setInt(1, medicoUnidade.getId_medico());
		statement.setInt(2, medicoUnidade.getId_unidade());
		
        
		// Executa a instrução no DB
		statement.execute();

		// Fecha Statement e conexão DB
		statement.close();
		conexaoDB.fecharConexao(conn);
		
		return true; // Retorna sucesso do registro
	}
	
	public ResultSet buscarMedicoUnidadeDAO(int id) throws SQLException {
		String sql = "";
		
		// Verifica o tipo de busca
		if (id < 1) {
			sql = "SELECT * FROM medico_unidade";
		
		} else {
			sql = "SELECT * FROM medico_unidade WHERE id = " + id;
		}
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		return statement.executeQuery();
	}
	
	public Boolean editarMedicoUnidadeDAO(MedicoUnidade medicoUnidade, int idInformado) throws SQLException {
		// Instru��o SQL para atualizar o registro no DB
		String sql =
			"UPDATE medico_unidade " +
			"SET id_medico = ?, id_unidade = ?" +
			"WHERE id = ?";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interroga��o
		statement.setInt(1, medicoUnidade.getId_medico());
		statement.setInt(2, medicoUnidade.getId_unidade());
		statement.setInt(3, idInformado);
		
		statement.executeUpdate();
		return true;
	}
	
	public Boolean excluirMedicoUnidadeDAO(int idInformado) throws SQLException {
		// Instru��o SQL para excluir o registro no DB
		String sql =
			"DELETE FROM medico_unidade " +
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







