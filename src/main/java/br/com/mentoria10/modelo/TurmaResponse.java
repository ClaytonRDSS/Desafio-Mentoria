package br.com.mentoria10.modelo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class TurmaResponse {


	private Long id;
	
	private String ano;
	
	private String mentorId;
}
