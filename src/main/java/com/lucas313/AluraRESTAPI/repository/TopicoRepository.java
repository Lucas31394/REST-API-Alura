package com.lucas313.AluraRESTAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas313.AluraRESTAPI.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	List<Topico> findByCursoNome(String nomeCurso);
	
}
