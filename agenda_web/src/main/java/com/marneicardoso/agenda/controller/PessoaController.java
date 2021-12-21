package com.marneicardoso.agenda.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.marneicardoso.agenda.model.Pessoa;

@Controller
public class PessoaController {

	@PostMapping("/cadastrarPessoa")
	public String cadastrarContato(Model model, Pessoa pessoa) {
		
		Pessoa inst_pessoa = new Pessoa();
		
		try {
			String mensagem = inst_pessoa.cadastrarPessoa(pessoa);
			model.addAttribute("mensagem", mensagem);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "cadastro_pessoa";
	}
	
	@RequestMapping("/buscarPessoa")
	public String buscarPessoa(Model model) {
		
		Pessoa pessoa = new Pessoa();
		try {
			List<Pessoa> listaDePessoa = new ArrayList<>();
			listaDePessoa = pessoa.buscarPessoas(0);

			if (listaDePessoa.size() < 1) {
				model.addAttribute("resultado", "Nenhuma pessoa registrada");
				return "index";
			}
			
			// Guarda a lista preenchida no Model
			model.addAttribute("pessoas", listaDePessoa);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "index";
	}
}





