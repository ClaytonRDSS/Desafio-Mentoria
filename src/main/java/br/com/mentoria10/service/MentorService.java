package br.com.mentoria10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.model.Mentor;
import br.com.mentoria10.model.MentorRequest;
import br.com.mentoria10.model.MentorResponse;
import br.com.mentoria10.repository.MentorRepository;

@Service
public class MentorService {
	
	@Autowired
	private MentorRepository mentorRepository;
	

		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}

		public void update(Long id, Mentor mentor) {
			// TODO Auto-generated method stub
			
		}

		public MentorResponse create(MentorRequest mentorRequest) {
			// TODO Auto-generated method stub
			return null;
		}

		public MentorResponse findById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<MentorResponse> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		public MentorResponse getMentor(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

}
