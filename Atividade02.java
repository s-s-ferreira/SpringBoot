package br.org.generation.atividades.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade02 {

	@RequestMapping ("/atividade02")
	public String atividade02 () {
		
		return "Objetivo de aprendizagem: Spring Boot (Saudades MySQL).";
		
	}
}
