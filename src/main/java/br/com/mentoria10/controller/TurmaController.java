package br.com.mentoria10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mentoria10.modelo.Turma;
import br.com.mentoria10.modelo.TurmaRequest;
import br.com.mentoria10.modelo.TurmaResponse;
import br.com.mentoria10.service.TurmaService;


@RestController
@RequestMapping("/turmas")
public class TurmaController {
	
	  @Autowired
	    private TurmaService turmaService;


	    public TurmaController (TurmaService turmaService){this.turmaService = turmaService;}

	    @GetMapping
	    public List<TurmaResponse> findAll (){
	    	return turmaService.findAll();
	    	}

	    @GetMapping("/{id}")
	    public TurmaResponse detalhar (@PathVariable("id")Long id){
	    	return turmaService.detalhar(id);
	    	}

	    @PostMapping
	    public ResponseEntity<TurmaResponse> cadastra (@RequestBody TurmaRequest turmaRequest){
	        TurmaResponse turmaResponse = turmaService.cadastra(turmaRequest);
	        return new ResponseEntity<>(turmaResponse, HttpStatus.CREATED);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable("id") Integer id ){
	    	turmaService.delete(id);
	    	}

	    @PutMapping("/{id}")
	    public ResponseEntity<TurmaResponse> atualizar(@PathVariable("id") Integer id,
	                                                     @RequestBody Turma turma){
	        turmaService.atualizar(id, turma);
	        TurmaResponse turmaResponse = turmaService.getTurma(id);
	        return new ResponseEntity<>(turmaResponse, HttpStatus.ACCEPTED);
	    }

}
