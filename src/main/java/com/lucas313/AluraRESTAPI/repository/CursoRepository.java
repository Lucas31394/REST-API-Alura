package com.lucas313.AluraRESTAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas313.AluraRESTAPI.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{
	
	Curso findByNome(String nomeCurso);
	
}
