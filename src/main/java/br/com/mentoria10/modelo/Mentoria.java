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
import lombok.NoArgsConstructor;


@Entity
@Table(name = "mentoria")
@Data
@NoArgsConstructor
public class Mentoria {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "mentoria_id")
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

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDate getData() {
			return data;
		}

		public void setData(LocalDate data) {
			this.data = data;
		}

		public String getAluno() {
			return aluno;
		}

		public void setAluno(String aluno) {
			this.aluno = aluno;
		}

		public String getMentor() {
			return mentor;
		}

		public void setMentor(String mentor) {
			this.mentor = mentor;
		}

		public String getConteudo() {
			return conteudo;
		}

		public void setConteudo(String conteudo) {
			this.conteudo = conteudo;
		}

		public LocalDateTime getCriadoEm() {
			return criadoEm;
		}

		public void setCriadoEm(LocalDateTime criadoEm) {
			this.criadoEm = criadoEm;
		}

		public LocalDateTime getAtualizadoEm() {
			return atualizadoEm;
		}

		public void setAtualizadoEm(LocalDateTime atualizadoEm) {
			this.atualizadoEm = atualizadoEm;
		}
}
