package br.com.mentoria10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mentoria10.modelo.Aluno;
import br.com.mentoria10.modelo.AlunoRequest;
import br.com.mentoria10.modelo.AlunoResponse;
import br.com.mentoria10.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private final AlunoRepository alunoRepository;
	
	
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	public AlunoResponse cadastrar(AlunoRequest alunoRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	public void atualizar(Long id, Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public AlunoResponse detalhar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<AlunoResponse> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public AlunoResponse getAluno(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
