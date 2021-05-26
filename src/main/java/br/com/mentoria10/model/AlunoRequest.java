package br.com.mentoria10.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class AlunoRequest {
	
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private  String matricula;
	
	private Long mentorId;
	
	private Long turmaId;
}
