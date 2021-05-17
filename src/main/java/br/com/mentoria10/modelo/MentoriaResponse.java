package br.com.mentoria10.modelo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Data
@NoArgsConstructor
public class MentoriaResponse {

    private Long id;

    private String data;

    private String aluno;

    private String mentor;

    private String conteudo;

    private String criadoEm;

    private String atualizadoEm;

}
