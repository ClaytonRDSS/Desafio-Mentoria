package br.com.mentoria10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mentoria10.modelo.Mentor;
import br.com.mentoria10.modelo.MentorRequest;
import br.com.mentoria10.modelo.MentorResponse;
import br.com.mentoria10.service.MentorService;

@RestController
@RequestMapping("/mentores")
public class MentorController {
	
	@Autowired
	private MentorService mentorService;
	
		public MentorController(MentorService mentorService) {
			this.mentorService = mentorService;
		}
	
	@GetMapping
	public List<MentorResponse> findAll(){
		return mentorService.findAll();
	}
	
	@GetMapping("/{id}")
	public MentorResponse detalhar(@PathVariable final Long id) {
		return mentorService.detalhar(id);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<MentorResponse> cadastrar (MentorRequest mentorRequest){
		MentorResponse mentorResponse = mentorService.cadastrar(mentorRequest);
		return new ResponseEntity<>(mentorResponse, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<MentorResponse> atualizar(@PathVariable("id") Long id,
			@RequestBody Mentor mentor){
		mentorService.atualizar(id, mentor);
		MentorResponse mentorResponse = mentorService.getMentor(id);
		return new ResponseEntity<>(mentorResponse, HttpStatus.ACCEPTED);
	}
	@DeleteMapping
	public void delete (@PathVariable("id") Long id ) {
		mentorService.delete(id);
	}
	
	
	

}
