package br.com.mentoria10.service;

import br.com.mentoria10.repository.MentoriaRepository;

public class MentoriaService {
	
	private final MentoriaRepository mentoriaRepository;
	
	public MentoriaService(MentoriaRepository mentoriaRepository) {
		this.mentoriaRepository = mentoriaRepository;
	}

}
