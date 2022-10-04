package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.ArtigoModel;

@Repository
public interface ArtigoRepository extends JpaRepository<ArtigoModel, Integer> {
	List<ArtigoModel> findAll();
}
