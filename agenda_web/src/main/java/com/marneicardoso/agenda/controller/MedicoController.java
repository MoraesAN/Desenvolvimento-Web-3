package com.marneicardoso.agenda.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marneicardoso.agenda.model.Especialidade;
import com.marneicardoso.agenda.model.Medico;

@Controller
public class MedicoController {

	@PostMapping("/cadastrarMedico")
	public String cadastrarContato(Model model, Medico medico) throws SQLException {
		
		Medico inst_medico = new Medico();

		Especialidade especialidade = new Especialidade();

		List<Especialidade> busca = new ArrayList<Especialidade>();
		busca = especialidade.buscarEspecialidades(0);
		
		try {
			String mensagem = inst_medico.cadastrarMedico(medico);
			model.addAttribute("especialidades", busca);
			model.addAttribute("mensagem", mensagem);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "cadastro_medico";
	}
	
	@RequestMapping("/buscarMedico")
	public String buscarMedico(Model model) {
		
		Medico medico = new Medico();
		try {
			List<Medico> listaDeMedico = new ArrayList<Medico>();
			listaDeMedico = medico.buscarMedico(0);

			if (listaDeMedico.size() < 1) {
				model.addAttribute("resultado", "Nenhuma medico registrada");
				return "index";
			}
			
			// Guarda a lista preenchida no Model
			model.addAttribute("index", listaDeMedico);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "index";
	}
}





