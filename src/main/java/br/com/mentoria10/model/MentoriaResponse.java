package br.com.mentoria10.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MentoriaResponse {

    private String data;

    private String aluno;

    private String mentor;

    private String conteudo;

    private String criadoEm;

    private String atualizadoEm;

}
