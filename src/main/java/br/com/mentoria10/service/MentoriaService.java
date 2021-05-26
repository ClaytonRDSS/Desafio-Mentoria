package br.com.mentoria10.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.model.Mentoria;
import br.com.mentoria10.model.MentoriaRequest;
import br.com.mentoria10.model.MentoriaResponse;
import br.com.mentoria10.repository.MentorRepository;

@Service
public class MentoriaService {
	
	@Autowired
	private MentorRepository mentoriaRepository;


	public MentoriaResponse create(MentoriaRequest mentoriaRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Long id, Mentoria mentoria) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public MentoriaResponse findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<MentoriaResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public MentoriaResponse getMentoria(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
