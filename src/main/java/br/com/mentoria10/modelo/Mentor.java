package br.com.mentoria10.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name = "mentores")
@NoArgsConstructor
@Getter @Setter
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "matricula")
	private String matricula;
	
	@ManyToOne
	private Long alunoId;
	
	@OneToOne
	private Long turmaId;

}
