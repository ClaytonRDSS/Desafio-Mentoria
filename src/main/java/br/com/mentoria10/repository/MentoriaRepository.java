package br.com.mentoria10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mentoria10.modelo.Mentoria;

public interface MentoriaRepository extends JpaRepository<Mentoria, Long> {

}
