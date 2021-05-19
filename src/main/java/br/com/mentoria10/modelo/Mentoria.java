package br.com.mentoria10.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Table(name = "mentoria")
@Data @Getter @Setter
@NoArgsConstructor
@Entity
public class Mentoria {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

		@Column(name = "data")
	    private LocalDate data;

	    @Column(name = "aluno_nome")
	    private String aluno;

	    @Column(name = "mentor_nome")
	    private String mentor;

	    @Column(name = "conteudo")
	    private String conteudo;

	    @CreationTimestamp
	    @Column(name = "criado_em")
	    private LocalDateTime criadoEm;

	    @UpdateTimestamp
	    @Column(name = "atualizado_em")
	    private LocalDateTime atualizadoEm;
}
