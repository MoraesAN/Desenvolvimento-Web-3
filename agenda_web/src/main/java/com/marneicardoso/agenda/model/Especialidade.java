package com.marneicardoso.agenda.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Especialidade {

    private int id;
    private String nome;
    private String pre_requisitos;
    public int getId() {
        return id;
    }
    public String getPre_requisitos() {
        return pre_requisitos;
    }
    public void setPre_requisitos(String pre_requisitos) {
        this.pre_requisitos = pre_requisitos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(int id) {
        this.id = id;
    }
    

	public String cadastrarEspecialidade(Especialidade especialidade) throws SQLException {
		// Valida os campos em branco
						
		// (preenchido) para o Banco de Dados
		EspecialidadeDAO dao = new EspecialidadeDAO();
		
		return dao.cadastrarEspecialidadeDAO(especialidade)
			? "Cadastro efetuado com sucesso!" : "Erro ao cadastrar  Especialidade"; // IF ternário
	}
	
	public List<Especialidade> buscarEspecialidades(int id) throws SQLException {
		EspecialidadeDAO dao = new EspecialidadeDAO();
		ResultSet resultado = dao.buscarEspecialidadeDAO(id);

		List<Especialidade> listaDeEspecialidade = new ArrayList<>();

		while (resultado.next()) {
			// Preenche o objeto Especialidade com os dados vindos do DB 
			Especialidade objetoEspecialidade = new Especialidade();
			objetoEspecialidade.setId(resultado.getInt("id"));
			objetoEspecialidade.setNome(resultado.getString("nome"));
			objetoEspecialidade.setPre_requisitos(resultado.getString("pre_requisitos"));
			
			
			// Adiciona o Contato preenchido na lista
			listaDeEspecialidade.add(objetoEspecialidade);
		}

		return listaDeEspecialidade;
	}
}
