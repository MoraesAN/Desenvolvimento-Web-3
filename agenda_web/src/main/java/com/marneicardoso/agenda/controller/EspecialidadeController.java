package com.marneicardoso.agenda.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.marneicardoso.agenda.model.Especialidade;

@Controller
public class EspecialidadeController {

	@PostMapping("/cadastrarEspecialidade")
	public String cadastrarContato(Model model, Especialidade especialidade) {
		
		Especialidade inst_especialidade = new Especialidade();
		
		try {
			String mensagem = inst_especialidade.cadastrarEspecialidade(especialidade);
			model.addAttribute("mensagem", mensagem);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "cadastro_especialidade";
	}
	
	@RequestMapping("/buscarEspecialidade")
	public String buscarEspecialidade(Model model) {
		
		Especialidade especialidade = new Especialidade();
		try {
			List<Especialidade> listaDeEspecialidade = new ArrayList<>();
			listaDeEspecialidade = especialidade.buscarEspecialidades(0);

			if (listaDeEspecialidade.size() < 1) {
				model.addAttribute("resultado", "Nenhuma especialidade registrada");
				return "index";
			}
			
			// Guarda a lista preenchida no Model
			model.addAttribute("especialidades", listaDeEspecialidade);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "index";
	}
}





