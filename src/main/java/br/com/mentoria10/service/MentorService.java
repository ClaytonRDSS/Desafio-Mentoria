package br.com.mentoria10.service;

import br.com.mentoria10.repository.MentorRepository;

public class MentorService {
	
	private final MentorRepository mentorRepository;
	
		public MentorService(MentorRepository mentorRepository) {
			this.mentorRepository = mentorRepository;
		}

}
