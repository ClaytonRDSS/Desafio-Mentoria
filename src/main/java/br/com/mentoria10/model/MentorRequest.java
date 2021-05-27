package br.com.mentoria10.model;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MentorRequest {
	
	private String nome;
	
	private Long alunoId;
	
	private Long turmaId;
}
