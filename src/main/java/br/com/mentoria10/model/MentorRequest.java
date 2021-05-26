package br.com.mentoria10.model;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
public class MentorRequest {

	private Long id;
	
	private String nome;
	
	private Long alunoId;
	
	private Long turmaId;
}
