package br.com.mentoria10.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
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
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private Mentor toMentorRequest(MentorRequest mentorRequest) {
		return modelMapper.map(mentorRequest, Mentor.class);
	}
	
	private MentorResponse toMentorResponse(Mentor mentor) {
		return modelMapper.map(mentor, MentorResponse.class);
	}
	

		public void deleteById(Long id) {
			if(!mentorRepository.existsById(id)) { throw new IllegalArgumentException("Mentor não encontrado");}
			mentorRepository.deleteById(id);
			
			
		}

		public void update(Long id, Mentor mentor) {
			Mentor Atualizar = mentorRepository.findById(id).orElseThrow(() -> new RuntimeException ("Mentor não encontrado: " +id));
			mentorRepository.save(Atualizar);
			
		}

		public MentorResponse create(MentorRequest mentorRequest) {
			Mentor mentor = toMentorRequest(mentorRequest);
			mentorRepository.save(mentor);
			MentorResponse mentorResponse = toMentorResponse(mentor);
			return mentorResponse;
		}

		public MentorResponse findById(Long id) {
			 Mentor mentor = mentorRepository.findById(id).orElseThrow( IllegalArgumentException::new);
			 return toMentorResponse(mentor);
		}

		public List<MentorResponse> findAll() {
			return mentorRepository.findAll().stream().map(this::toMentorResponse).collect(Collectors.toList());
		}

		public MentorResponse getMentor(Long id) {
			Mentor mentor = mentorRepository.findById(id).orElseThrow(() -> new RuntimeException("Mentor não encontrado: "+id));
			return toMentorResponse(mentor);
		}

}
