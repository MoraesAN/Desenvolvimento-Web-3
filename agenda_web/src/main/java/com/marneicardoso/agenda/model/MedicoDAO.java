package com.marneicardoso.agenda.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicoDAO {

	public Boolean cadastrarMedicoDAO(Medico medico) throws SQLException {
		int id_medico = -1;
		// Instrução SQL para adicionar um registro no DB		
		String sql = "INSERT INTO medico (nome, crm, id_especialidade)"
				+ " VALUES (?, ?, ?)";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		// Adiciona os valores informados, em cada interrogação
		statement.setString(1, medico.getNome());
		statement.setString(2, medico.getCrm());
		statement.setInt(3, medico.getId_especialidade());
        
		// Executa a instrução no DB
		statement.execute();

		ResultSet rs = statement.getGeneratedKeys();
			if(rs.next())
			{
				id_medico = rs.getInt(1);
			}
		MedicoUnidade medicoUnidade = new MedicoUnidade();
		medicoUnidade.setId_medico(id_medico);
		medicoUnidade.setId_unidade(medico.getId_unidade());

		medicoUnidade.cadastrarMedicoUnidade(medicoUnidade);
		// Fecha Statement e conexão DB
		statement.close();
		conexaoDB.fecharConexao(conn);
		
		return true; // Retorna sucesso do registro
	}
	
	public ResultSet buscarMedicoDAO(int id) throws SQLException {
		String sql = "";
		
		// Verifica o tipo de busca
		if (id < 1) {
			sql = "SELECT * FROM medico";
		
		} else {
			sql = "SELECT * FROM medico WHERE id = " + id;
		}
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		return statement.executeQuery();
	}
	
	public Boolean editarMedicoDAO(Medico medico, int idInformado) throws SQLException {
		// Instru��o SQL para atualizar o registro no DB
		String sql =
			"UPDATE medico " +
			"SET nome = ?, crm = ?, id_especialidade = ?" +
			"WHERE id = ?";
		
		ConexaoDB conexaoDB = new ConexaoDB();
		Connection conn = conexaoDB.abrirConexao();
		PreparedStatement statement = conn.prepareStatement(sql);
		
		// Adiciona os valores informados, em cada interroga��o
		statement.setString(1, medico.getNome());
		statement.setString(2, medico.getCrm());
		statement.setInt(3, medico.getId_especialidade());
		statement.setInt(4, idInformado);
		
		statement.executeUpdate();
		return true;
	}
	
	public Boolean excluirMedicoDAO(int idInformado) throws SQLException {
		// Instru��o SQL para excluir o registro no DB
		String sql =
			"DELETE FROM medico " +
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







