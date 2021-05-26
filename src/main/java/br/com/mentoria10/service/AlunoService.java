package br.com.mentoria10.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import br.com.mentoria10.model.Aluno;
import br.com.mentoria10.model.AlunoRequest;
import br.com.mentoria10.model.AlunoResponse;
import br.com.mentoria10.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private  AlunoRepository alunoRepository;	

	@Autowired
	private ModelMapper modelMapper;
	
	
	private Aluno toAlunoRequest(AlunoRequest alunoRequest) {
		return modelMapper.map(alunoRequest, Aluno.class);
	}
	
	private AlunoResponse toAlunoResponse(Aluno aluno) {
		return modelMapper.map(aluno, AlunoResponse.class);
	}

	public AlunoResponse create(AlunoRequest alunoRequest) {
		Aluno aluno01 = toAlunoRequest(alunoRequest);
		aluno01 = alunoRepository.save(aluno01);
		AlunoResponse alunoResponse = toAlunoResponse(aluno01);
		return alunoResponse;
		 
	}
	public void update(Long id, Aluno aluno) {
		Aluno alunoAtualizar = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado: " +id));
	
	}
	public void deleteById(Long id) {
		if(!alunoRepository.existsById(id)) { throw new IllegalArgumentException("Aluno não encontrado");}
		alunoRepository.deleteById(id);
	
		
	}
	public AlunoResponse findById(Long id) {
		Aluno aluno = alunoRepository.findById(id).orElseThrow( IllegalArgumentException::new);
		return toAlunoResponse(aluno);
	}

	public List<AlunoResponse> findAll() {
		return alunoRepository.findAll().stream().map(this::toAlunoResponse).collect(Collectors.toList());
	}
	public AlunoResponse getAluno(Long id) {
		Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado: "+id));
		return toAlunoResponse(aluno);
	}
}
