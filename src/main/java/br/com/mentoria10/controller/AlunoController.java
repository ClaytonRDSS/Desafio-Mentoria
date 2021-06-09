package br.com.mentoria10.controller;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mentoria10.model.Aluno;
import br.com.mentoria10.model.AlunoRequest;
import br.com.mentoria10.model.AlunoResponse;
import br.com.mentoria10.service.AlunoService;


@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private  AlunoService alunoService;
	
	
	
	@GetMapping
	public List<AlunoResponse> findAll(){
		return alunoService.findAll();
	}
	
	@GetMapping("/{id}")
	public AlunoResponse findById(@PathVariable("id") final Long id) {
		return alunoService.findById(id);
	}
	
	@PostMapping
	 public ResponseEntity<AlunoResponse> create(@Validated @RequestBody AlunoRequest alunoRequest){
		AlunoResponse alunoResponse = alunoService.create(alunoRequest);
		return new  ResponseEntity<>(alunoResponse, HttpStatus.CREATED);
	
	}
	
	 @PutMapping
	 public ResponseEntity<AlunoResponse> update(@PathVariable Long id,
			 @RequestBody Aluno aluno){
	        alunoService.update(id,aluno);
	        AlunoResponse alunoResponse = alunoService.getAluno(id);
	        //return new ResponseEntity<>(mentorService.update(id,mentor), HttpStatus.ACCEPTED);
	        return new ResponseEntity<>(alunoResponse, HttpStatus.ACCEPTED);
	    }
	 
	 @DeleteMapping("/{id}")
	 public void deleteById(@PathVariable Long id) {
	      this.alunoService.deleteById(id); 
	}	

}
