package br.com.mentoria10.modelo;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
public class MentorRequest {

	private Long id;
	
	private String nome;
	
	private Long alunoId;
	
	private Long turmaId;
}
