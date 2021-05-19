package br.com.mentoria10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.modelo.Turma;
import br.com.mentoria10.modelo.TurmaRequest;
import br.com.mentoria10.modelo.TurmaResponse;
import br.com.mentoria10.repository.TurmaRepository;

@Service
public class TurmaService {
	
	@Autowired
	private final TurmaRepository turmaReposytory;
	
		public TurmaService(TurmaRepository turmaReposytory) {
			this.turmaReposytory = turmaReposytory;
		}

		public List<TurmaResponse> findAll() {
			// TODO Auto-generated method stub
			return null;
		}

		public TurmaResponse detalhar(Long id) {
			// TODO Auto-generated method stub
			return null;
		}

		public TurmaResponse cadastra(TurmaRequest turmaRequest) {
			// TODO Auto-generated method stub
			return null;
		}

		public void delete(Integer id) {
			// TODO Auto-generated method stub
			
		}

		public void atualizar(Integer id, Turma turma) {
			// TODO Auto-generated method stub
			
		}

		public TurmaResponse getTurma(Integer id) {
			// TODO Auto-generated method stub
			return null;
		}

}
