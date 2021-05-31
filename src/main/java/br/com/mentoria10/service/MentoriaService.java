package br.com.mentoria10.service;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.model.Aluno;
import br.com.mentoria10.model.AlunoResponse;
import br.com.mentoria10.model.Mentoria;
import br.com.mentoria10.model.MentoriaRequest;
import br.com.mentoria10.model.MentoriaResponse;
import br.com.mentoria10.repository.MentoriaRepository;

@Service
public class MentoriaService {
	
	@Autowired
	private MentoriaRepository mentoriaRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private Mentoria toMentoriaRequest(MentoriaRequest mentoriaRequest) {
		return modelMapper.map(mentoriaRequest, Mentoria.class);
	}
	
	private MentoriaResponse toMentoriaResponse(Mentoria mentoria) {
		return modelMapper.map(mentoria, MentoriaResponse.class);
	}


	public MentoriaResponse create(MentoriaRequest mentoriaRequest) {
		Mentoria mentoria = toMentoriaRequest(mentoriaRequest);
		mentoriaRepository.save(mentoria);
		MentoriaResponse mentoriaResponse = toMentoriaResponse(mentoria);
		return mentoriaResponse;
	}

	public void update(Long id, Mentoria mentoria) {
		Mentoria Atualizar = mentoriaRepository.findById(id).orElseThrow(() -> new RuntimeException ("mentoria não encontrada: " +id));
		mentoriaRepository.save(Atualizar);
		
	}

	public void deleteById(Long id) {
		if(!mentoriaRepository.existsById(id)) { throw new IllegalArgumentException("Mentoria não encontrada");}
		mentoriaRepository.deleteById(id);
		
	}

	public MentoriaResponse findById(Long id) {
		Mentoria mentoria = mentoriaRepository.findById(id).orElseThrow( IllegalArgumentException::new);
		 return toMentoriaResponse(mentoria);
	}


	public List<MentoriaResponse> findAll() {
		return mentoriaRepository.findAll().stream().map(this::toMentoriaResponse).collect(Collectors.toList());
	}

	public MentoriaResponse getMentoria(Long id) {
		Mentoria mentoria = mentoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado: "+id));
		return toMentoriaResponse(mentoria);
	}

}
