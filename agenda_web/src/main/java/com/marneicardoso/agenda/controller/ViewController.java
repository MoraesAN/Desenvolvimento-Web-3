package com.marneicardoso.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/cadastro_pessoa")
	public String cadastroPessoa() {
		return "cadastro_pessoa";
	}
	@RequestMapping("/cadastro_medico")
	public String cadastroMedico() {
		return "cadastro_medico";
	}
	@RequestMapping("/cadastro_unidade")
	public String cadastroUnidade() {
		return "cadastro_unidade";
	}
	@RequestMapping("/agendar_consulta")
	public String consulta() {
		return "agendar_consulta";
	}
	@RequestMapping("/contato")
	public String contato() {
		return "contato";
	}

	@RequestMapping("/visualizar")
	public String visualizar() {
		return "visualizar";
	}
}
