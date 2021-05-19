package br.com.mentoria10.modelo;

import lombok.*;

@Data
@Getter @Setter
@NoArgsConstructor
public class MentoriaRequest {

	   private Long alunoid;

	    private String data;

	    private String conteudo;
}
