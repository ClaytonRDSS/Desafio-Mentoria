package br.com.mentoria10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.modelo.Mentoria;
import br.com.mentoria10.modelo.MentoriaRequest;
import br.com.mentoria10.modelo.MentoriaResponse;
import br.com.mentoria10.repository.MentoriaRepository;

@Service
public class MentoriaService {
	
	@Autowired
	private final MentoriaRepository mentoriaRepository;
	
	public MentoriaService(MentoriaRepository mentoriaRepository) {
		this.mentoriaRepository = mentoriaRepository;
	}

	public List<MentoriaResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public MentoriaResponse detalhar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public MentoriaResponse cadastrar(MentoriaRequest mentoriaRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	public void atualizar(Long id, Mentoria mentoria) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public MentoriaResponse getMentoria(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
