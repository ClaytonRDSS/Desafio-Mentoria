package br.com.mentoria10.service;

import br.com.mentoria10.repository.TurmaRepository;

public class TurmaService {
	
	private final TurmaRepository turmaReposytory;
	
		public TurmaService(TurmaRepository turmaReposytory) {
			this.turmaReposytory = turmaReposytory;
		}

}
