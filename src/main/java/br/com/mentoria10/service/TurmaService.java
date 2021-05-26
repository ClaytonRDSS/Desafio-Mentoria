package br.com.mentoria10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.model.Turma;
import br.com.mentoria10.model.TurmaRequest;
import br.com.mentoria10.model.TurmaResponse;
import br.com.mentoria10.repository.TurmaRepository;

@Service
public class TurmaService {
	
	@Autowired
	private TurmaRepository turmaReposytory;

		public List<TurmaResponse> findAll() {
			return null;
					
		}

		public TurmaResponse findById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		public TurmaResponse create(TurmaRequest turmaRequest) {
			// TODO Auto-generated method stub
			return null;
		}

		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}

		public void update(Long id, Turma turma) {
			// TODO Auto-generated method stub
			
		}

		public TurmaResponse getTurma(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

}
