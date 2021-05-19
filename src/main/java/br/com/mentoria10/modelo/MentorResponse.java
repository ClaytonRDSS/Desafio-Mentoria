package br.com.mentoria10.modelo;

import lombok.NoArgsConstructor;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
public class MentorResponse {
private Long id;
	
	private String nome;
	
	private Long alunoId;
	
	private Long turmaId;

}
