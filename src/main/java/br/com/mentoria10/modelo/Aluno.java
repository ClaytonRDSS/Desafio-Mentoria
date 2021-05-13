package br.com.mentoria10.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;



@Entity
@Table(name = "aluno")
@NoArgsConstructor
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
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Long getMemtorId() {
		return memtorId;
	}

	public void setMemtorId(Long memtorId) {
		this.memtorId = memtorId;
	}

	public Long getTurmaId() {
		return turmaId;
	}

	public void setTurmaId(Long turmaId) {
		this.turmaId = turmaId;
	}

}
