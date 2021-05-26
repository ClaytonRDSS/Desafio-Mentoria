package br.com.mentoria10.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "turmas")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Turma {
	
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "id", updatable = false)
	    private Long id;

	    @Column(name = "ano")
	    private String ano;

	    @Column(name = "mentor_id")
	    private String mentorId;

	  /* public Turma(String ano, String mentorId) {
	        this.ano = ano;
	        this.mentorId = mentorId;
	   }*/
}
