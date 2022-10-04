package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.model.BeneficiadoModel;
import br.com.alura.mvc.mudi.model.RespostaModelo;
import br.com.alura.mvc.mudi.repository.BeneficiadoRepository;

@RestController
@RequestMapping("/api")
public class BeneficiadoController {

	@Autowired
	private BeneficiadoRepository acoes;

	// Listar
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/beneficiados", method = RequestMethod.GET)
	public @ResponseBody List<BeneficiadoModel> listar() {
		return acoes.findAll();
	}

	// Cadastrar
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/beneficiados", method = RequestMethod.POST)
	public @ResponseBody BeneficiadoModel cadastrar(@RequestBody BeneficiadoModel beneficiado) {

		return acoes.save(beneficiado);
	}

	// Filtrar
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/beneficiados/{id}", method = RequestMethod.GET)
	public @ResponseBody BeneficiadoModel filtrar(@PathVariable int id) {
		return acoes.findById(id);
	}

	// Alterar
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/beneficiados", method = RequestMethod.PUT)
	public @ResponseBody BeneficiadoModel alterar(@RequestBody BeneficiadoModel beneficiado) {
		return acoes.save(beneficiado);
	}

	// Remover
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/beneficiados/{id}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModelo remover(@PathVariable Integer id) {

		RespostaModelo resposta = new RespostaModelo();

		try {

			BeneficiadoModel beneficiado = filtrar(id);
			this.acoes.delete(beneficiado);
			resposta.setMensagens("Beneficiado removido com sucesso");
		} catch (Exception e) {
			resposta.setMensagens("Falha ao deletar: " + e.getMessage());
		}

		return resposta;
	}
	
}
