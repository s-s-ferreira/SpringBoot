package br.org.generation.atividades.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade01 {

	@RequestMapping ("/atividade01")
	public String atividade01 () {
		
		return "Habilidade: PERSISTÊNCIA! e Mentalidade: Atenção ao Detalhe.";
		
	}
}