package br.com.mentoria10.model;

import lombok.*;

@Data
@Getter @Setter
@AllArgsConstructor
public class MentoriaRequest {

	   private Long alunoid;

	    private String data;

	    private String conteudo;
}
