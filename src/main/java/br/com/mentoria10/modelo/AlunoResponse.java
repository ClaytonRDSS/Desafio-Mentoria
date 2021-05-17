package br.com.mentoria10.modelo;

import lombok.NoArgsConstructor;
import lombok.*;

@Getter
@NoArgsConstructor
public class AlunoResponse {
	

	private Long id;
	
	private String nome;
	
	private String matricula;
	
	private String cpf;
}
