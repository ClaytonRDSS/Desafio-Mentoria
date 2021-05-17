package br.com.mentoria10.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "turmas")
@NoArgsConstructor
@Getter @Setter
public class Turma {
	
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "id", updatable = false)
	    private Long id;

	    @Column(name = "ano")
	    private String ano;

	    @Column(name = "mentor_id")
	    @OneToMany
	    private String mentorId;

	  /*  public Turma(String ano, String mentorId) {
	        this.ano = ano;
	        this.mentorId = mentorId;
	    }*/
}
