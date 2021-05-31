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

import br.com.mentoria10.model.Turma;
import br.com.mentoria10.model.TurmaRequest;
import br.com.mentoria10.model.TurmaResponse;
import br.com.mentoria10.service.TurmaService;


@RestController
@RequestMapping("/turmas")
public class TurmaController {
	
	  @Autowired
	    private TurmaService turmaService;

	    @GetMapping
	    public List<TurmaResponse> findAll (){
	    	return turmaService.findAll();
	    	}

	    @GetMapping("/{id}")
	    public TurmaResponse findById (@PathVariable("id") final Long id){
	    	return turmaService.findById(id);
	    	}

	    @PostMapping
	    public ResponseEntity<TurmaResponse> create (@RequestBody TurmaRequest turmaRequest){
	        TurmaResponse turmaResponse = turmaService.create(turmaRequest);
	        return new ResponseEntity<>(turmaResponse, HttpStatus.CREATED);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteById(@PathVariable("id") Long id ){
	    	this.turmaService.deleteById(id);
	    	}

	    @PutMapping
	    public ResponseEntity<TurmaResponse> update(@PathVariable("id") Long id,
	                                                     @RequestBody Turma turma){
	        turmaService.update(id, turma);
	        TurmaResponse turmaResponse = turmaService.getTurma(id);
	        return new ResponseEntity<>(turmaResponse, HttpStatus.ACCEPTED);
	    }

}
