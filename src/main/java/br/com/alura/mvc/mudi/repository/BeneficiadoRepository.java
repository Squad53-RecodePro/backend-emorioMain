package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.mvc.mudi.model.BeneficiadoModel;

public interface BeneficiadoRepository extends JpaRepository<BeneficiadoModel, Integer> {
	// Listar
		List<BeneficiadoModel> findAll();

		// Pesquisar
		BeneficiadoModel findById(int id);

		// Remover
		void delete(BeneficiadoModel beneficiado);

		// Cadastrar / Alterar
		<BeneficiadoMod extends BeneficiadoModel> BeneficiadoMod save(BeneficiadoMod beneficiado);
}
