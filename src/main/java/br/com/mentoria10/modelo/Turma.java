package br.com.mentoria10.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.NoArgsConstructor;


@Entity
@Table(name = "turmas")
@NoArgsConstructor
public class Turma {
	
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "turma_id", updatable = false)
	    private Integer turmaId;

	    @Column(nullable = false)
	    private String ano;

	    @Column(name = "mentor_id", nullable = false)
	    private String mentorId;

	    public Turma(String ano, String mentorId) {
	        this.ano = ano;
	        this.mentorId = mentorId;
	    }

		public Integer getTurmaId() {
			return turmaId;
		}

		public void setTurmaId(Integer turmaId) {
			this.turmaId = turmaId;
		}

		public String getAno() {
			return ano;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

		public String getMentorId() {
			return mentorId;
		}

		public void setMentorId(String mentorId) {
			this.mentorId = mentorId;
		}

}
