package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.model.ArtigoModel;
import br.com.alura.mvc.mudi.repository.ArtigoRepository;

@RestController
@RequestMapping("/api")
public class ArtigoController {
	
	@Autowired
	private ArtigoRepository acoes;

	// Listar
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/artigos", method = RequestMethod.GET)
	public @ResponseBody List<ArtigoModel> listar() {
		return acoes.findAll();
	}

}
