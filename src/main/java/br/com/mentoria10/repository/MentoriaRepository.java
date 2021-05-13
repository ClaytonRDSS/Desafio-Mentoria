package br.com.mentoria10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mentoria10.modelo.Mentoria;

@Repository
public interface MentoriaRepository extends JpaRepository<Mentoria, Long> {

}
