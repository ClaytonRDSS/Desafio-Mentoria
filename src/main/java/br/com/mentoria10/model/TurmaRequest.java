package br.com.mentoria10.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class TurmaRequest {
	
	private Long id;
	
	private String ano;
	
	private String mentorId;

}
