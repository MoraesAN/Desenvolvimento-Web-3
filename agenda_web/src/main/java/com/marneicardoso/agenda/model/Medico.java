package com.marneicardoso.agenda.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Medico {
	// Atributos
	private int id;
	private String nome;
    private String crm;
	private int id_especialidade;
    private int id_unidade;
	

	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public int getId_especialidade() {
		return id_especialidade;
	}

	public void setId_especialidade(int id_especialidade) {
		this.id_especialidade = id_especialidade;
	}

    public int getId_unidade() {
		return id_unidade;
	}

	public void setId_unidade(int id_unidade) {
		this.id_unidade = id_unidade;
	}


	public String cadastrarMedico(Medico medico) throws SQLException {
		// Valida os campos em branco
		if (medico.getNome().equals("")) {
			return "Preencha o campo nome";
		}

		if (medico.getCrm().equals("")) {
			return "Preencha o campo CRM";
		}

				
		// Envia o Contato (preenchido) para o Banco de Dados
		MedicoDAO dao = new MedicoDAO();
		
		return dao.cadastrarMedicoDAO(medico)
			? "Cadastro efetuado com sucesso!" : "Erro ao cadastrar  Medico"; // IF ternário
	}
	
	public List<Medico> buscarMedico(int id) throws SQLException {
		MedicoDAO dao = new MedicoDAO();
		ResultSet resultado = dao.buscarMedicoDAO(id);

		List<Medico> listaDeMedico = new ArrayList<>();

		while (resultado.next()) {
			// Preenche o objeto Medico com os dados vindos do DB 
			Medico objetoMedico = new Medico();
			objetoMedico.setId(resultado.getInt("id"));
			objetoMedico.setNome(resultado.getString("nome"));
			objetoMedico.setCrm(resultado.getString("crm"));
			objetoMedico.setId_especialidade(resultado.getInt("id_especialidade"));
			// Adiciona o Contato preenchido na lista
			listaDeMedico.add(objetoMedico);
		}

		return listaDeMedico;
	}
}
