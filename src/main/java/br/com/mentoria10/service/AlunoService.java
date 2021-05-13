package br.com.mentoria10.service;

import org.springframework.stereotype.Service;

import br.com.mentoria10.repository.AlunoRepository;

@Service
public class AlunoService {
	
	private final AlunoRepository alunoRepository;
	
	
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

}
