package br.com.mentoria10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoRequest {
	
	private String nome;
	
	private String cpf;
	
	private String matricula;
	
	private String mentorId;
	
	private String turmaId;

}
