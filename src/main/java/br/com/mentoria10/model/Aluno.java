package br.com.mentoria10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.NoArgsConstructor;
import lombok.*;



@Entity
@Table(name = "alunos")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id" , updatable = false)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "matricula")
	private String matricula;
	
	@Column(name = "mentorId")
	private String memtorId;
	
	@Column(name = "turmaId")
	private String turmaId;

	

}
