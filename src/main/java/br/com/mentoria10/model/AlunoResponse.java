package br.com.mentoria10.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoResponse {

	private String nome;
	
	private String cpf;
	
	private String matricula;

	private String mentorId;
	
	private String turmaId;
}
