package br.com.mentoria10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.modelo.Mentor;
import br.com.mentoria10.modelo.MentorRequest;
import br.com.mentoria10.modelo.MentorResponse;
import br.com.mentoria10.repository.MentorRepository;

@Service
public class MentorService {
	
	@Autowired
	private final MentorRepository mentorRepository;
	
		public MentorService(MentorRepository mentorRepository) {
			this.mentorRepository = mentorRepository;
		}

		public void delete(Long id) {
			// TODO Auto-generated method stub
			
		}

		public void atualizar(Long id, Mentor mentor) {
			// TODO Auto-generated method stub
			
		}

		public MentorResponse cadastrar(MentorRequest mentorRequest) {
			// TODO Auto-generated method stub
			return null;
		}

		public MentorResponse detalhar(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		public MentorResponse getMentor(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<MentorResponse> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

}
