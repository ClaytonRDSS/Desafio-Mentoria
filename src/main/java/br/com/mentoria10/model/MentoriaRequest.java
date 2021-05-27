package br.com.mentoria10.model;

import lombok.*;

@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MentoriaRequest {

	   private Long aluno;

	    private String data;

	    private String conteudo;
}
