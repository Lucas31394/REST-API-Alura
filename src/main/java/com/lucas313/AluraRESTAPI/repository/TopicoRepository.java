package com.lucas313.AluraRESTAPI.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas313.AluraRESTAPI.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
	
}
