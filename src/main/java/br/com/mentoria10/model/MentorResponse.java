package br.com.mentoria10.model;


import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MentorResponse {

	private Long id;
	
	private String nome;
	
	private Long alunoId;
	
	private Long turmaId;

}
