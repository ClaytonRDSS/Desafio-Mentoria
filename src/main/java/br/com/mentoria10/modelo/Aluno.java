package br.com.mentoria10.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.*;



@Entity
@Table(name = "aluno")
@NoArgsConstructor
@Getter @Setter
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aluno_id")
	private Long id;
	@Column(name = "aluno_nome")
	private String nome;
	
	@Column(name = "aluno_cpf")
	private String cpf;
	
	@Column(name = "aluno_matricula")
	private String matricula;
	
	@Column(name = "aluno_mentorId")
	private Long memtorId;
	
	@Column(name = "aluno_turmaId")
	private Long turmaId;

}
