package br.com.mentoria10.modelo;

import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class AlunoRequest {
	
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private  String matricula;
}
