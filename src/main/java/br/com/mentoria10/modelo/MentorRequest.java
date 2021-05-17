package br.com.mentoria10.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MentorRequest {
	
	private Long id;
	
	private String nome;
	
	private Long alunoId;
	
	private Long turmaId;

}
