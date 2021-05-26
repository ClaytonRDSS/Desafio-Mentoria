package br.com.mentoria10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mentoria10.model.Mentor;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long> {

}
