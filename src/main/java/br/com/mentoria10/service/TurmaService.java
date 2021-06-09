package br.com.mentoria10.service;

import java.util.List;
import java.util.stream.Collectors;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.model.Turma;
import br.com.mentoria10.model.TurmaRequest;
import br.com.mentoria10.model.TurmaResponse;
import br.com.mentoria10.repository.TurmaRepository;

@Service
public class TurmaService {
	
	@Autowired
	private TurmaRepository turmaRepository;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private Turma toTurmaRequest(TurmaRequest turmaRequest) {
		return modelMapper.map(turmaRequest, Turma.class);
	}
	
	private TurmaResponse toTurmaResponse(Turma turma) {
		return modelMapper.map(turma, TurmaResponse.class);
	}

		public List<TurmaResponse> findAll() {
		return turmaRepository.findAll().stream().map(this::toTurmaResponse).collect(Collectors.toList());
					
		}

		public TurmaResponse findById(Long id) {
			Turma turma = turmaRepository.findById(id).orElseThrow(IllegalArgumentException::new);
			return toTurmaResponse(turma);
		}

		public TurmaResponse create(TurmaRequest turmaRequest) {
			Turma turma01 = toTurmaRequest(turmaRequest);
			turmaRepository.save(turma01);
			TurmaResponse turmaResponse = toTurmaResponse(turma01);
			return turmaResponse;
		}

		public void deleteById(Long id) {
			if(!turmaRepository.existsById(id)) { throw new IllegalArgumentException("Turma não encontrada");}
			turmaRepository.deleteById(id);
			
		}

		public void update(Long id, Turma turma) {
			Turma atualizar = turmaRepository.findById(id).orElseThrow(() -> new RuntimeException("Turma não encontrada: " +id));
			turmaRepository.save(atualizar);
		}

		public TurmaResponse getTurma(Long id) {
			Turma turma = turmaRepository.findById(id).orElseThrow(() -> new RuntimeException("Turma não encontrada: "+id));
			return toTurmaResponse(turma);
		}

}
