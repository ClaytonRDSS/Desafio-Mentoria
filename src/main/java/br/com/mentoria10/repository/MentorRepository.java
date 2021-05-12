package br.com.mentoria10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mentoria10.modelo.Mentor;

public interface MentorRepository extends JpaRepository<Mentor, Long> {

}
