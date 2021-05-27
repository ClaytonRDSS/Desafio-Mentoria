package br.com.mentoria10.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlunoResponse {
	

	private Long id;
	
	private String nome;
	
	private String matricula;
	
	private String cpf;

	private Long mentorId;
	
	private Long turmaId;
}
