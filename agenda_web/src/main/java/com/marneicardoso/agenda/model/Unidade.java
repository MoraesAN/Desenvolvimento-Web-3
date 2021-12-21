package com.marneicardoso.agenda.model;

public class Unidade {
	// Atributos
	private int id;
	private String nome;
    private String telefone;
    private String local;
	private String atendimento;

	// Getters e Setters
	public int getId() {
		return id;
	}

	public String getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

}
