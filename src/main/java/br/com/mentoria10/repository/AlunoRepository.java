package br.com.mentoria10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mentoria10.modelo.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
