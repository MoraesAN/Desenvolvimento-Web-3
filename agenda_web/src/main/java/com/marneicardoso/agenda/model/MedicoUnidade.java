package com.marneicardoso.agenda.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedicoUnidade {
	// Atributos
	private int id;
	private int id_medico;
    private int id_unidade;
    

	// Getters e Setters
	public int getId() {
		return id;
	}

	public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public int getId_unidade() {
        return id_unidade;
    }

    public void setId_unidade(int id_unidade) {
        this.id_unidade = id_unidade;
    }

    public void setId(int id) {
		this.id = id;
	}



	public String cadastrarMedicoUnidade(MedicoUnidade medicoUnidade) throws SQLException {
				
		// Envia o Contato (preenchido) para o Banco de Dados
		MedicoUnidadeDAO dao = new MedicoUnidadeDAO();
		
		return dao.cadastrarMedicoUnidadeDAO(medicoUnidade)
			? "Cadastro efetuado com sucesso!" : "Erro ao cadastrar  MedicoUnidade"; // IF ternário
	}
	
	public List<MedicoUnidade> buscarMedicoUnidade(int id) throws SQLException {
		MedicoUnidadeDAO dao = new MedicoUnidadeDAO();
		ResultSet resultado = dao.buscarMedicoUnidadeDAO(id);

		List<MedicoUnidade> listaDeMedicoUnidade = new ArrayList<>();

		while (resultado.next()) {
			// Preenche o objeto MedicoUnidade com os dados vindos do DB 
			MedicoUnidade objetoMedicoUnidade = new MedicoUnidade();
			objetoMedicoUnidade.setId(resultado.getInt("id"));
			objetoMedicoUnidade.setId_medico(resultado.getInt("id_medico"));
			objetoMedicoUnidade.setId_unidade(resultado.getInt("id_unidade"));
			
			// Adiciona o Contato preenchido na lista
			listaDeMedicoUnidade.add(objetoMedicoUnidade);
		}

		return listaDeMedicoUnidade;
	}
}
