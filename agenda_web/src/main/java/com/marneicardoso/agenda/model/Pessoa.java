package com.marneicardoso.agenda.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	// Atributos
	private int id;
	private String nome;
    private String cpf;
	private String email;
	private String telefone;
    private String cns_sus;

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

    public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String gettelefone() {
		return telefone;
	}

	public void settelefone(String telefone) {
		this.telefone = telefone;
	}

    public String getCns_sus() {
		return cns_sus;
	}

	public void setCns_sus(String cns_sus) {
		this.cns_sus = cns_sus;
	}

	public String cadastrarPessoa(Pessoa pessoa) throws SQLException {
		// Valida os campos em branco
		if (pessoa.getNome().equals("")) {
			return "Preencha o campo nome";
		}
		
		if (pessoa.getEmail().equals("")) {
			return "Preencha o campo e-mail";
		}
		
		if (pessoa.gettelefone().equals("")) {
			return "Preencha o campo telefone";
		}

		if (pessoa.getCns_sus().equals("")) {
			return "Preencha o campo Nº do cartão SUS";
		}

		if (pessoa.getCpf().equals("")) {
			return "Preencha o campo CPF";
		}
				
		// Envia o Contato (preenchido) para o Banco de Dados
		PessoaDAO dao = new PessoaDAO();
		
		return dao.cadastrarPessoaDAO(pessoa)
			? "Cadastro efetuado com sucesso!" : "Erro ao cadastrar  Pessoa"; // IF ternário
	}
	
	public List<Pessoa> buscarPessoas(int id) throws SQLException {
		PessoaDAO dao = new PessoaDAO();
		ResultSet resultado = dao.buscarPessoaDAO(id);

		List<Pessoa> listaDePessoa = new ArrayList<>();

		while (resultado.next()) {
			// Preenche o objeto Pessoa com os dados vindos do DB 
			Pessoa objetoPessoa = new Pessoa();
			objetoPessoa.setId(resultado.getInt("id"));
			objetoPessoa.setNome(resultado.getString("nome"));
			objetoPessoa.setEmail(resultado.getString("email"));
			objetoPessoa.setCpf(resultado.getString("cpf"));
			objetoPessoa.setCns_sus(resultado.getString("cns_sus"));
			objetoPessoa.settelefone(resultado.getString("telefone"));
			
			// Adiciona o Contato preenchido na lista
			listaDePessoa.add(objetoPessoa);
		}

		return listaDePessoa;
	}
}
