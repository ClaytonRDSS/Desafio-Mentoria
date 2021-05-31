package br.com.mentoria10.model;

import lombok.*;

@Data
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MentoriaRequest {

	  private String data;

	    private String aluno;

	    private String mentor;

	    private String conteudo;

	    private String criadoEm;

	    private String atualizadoEm;
}
