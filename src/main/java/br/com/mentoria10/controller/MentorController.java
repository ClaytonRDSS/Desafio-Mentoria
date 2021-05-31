package br.com.mentoria10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mentoria10.model.Mentor;
import br.com.mentoria10.model.MentorRequest;
import br.com.mentoria10.model.MentorResponse;
import br.com.mentoria10.service.MentorService;

@RestController
@RequestMapping("/mentores")
public class MentorController {
	
	@Autowired
	private MentorService mentorService;
	
	
	@GetMapping
	public List<MentorResponse> findAll(){
		return mentorService.findAll();
	}
	
	@GetMapping("/{id}")
	public MentorResponse findById(@PathVariable("id") final Long id) {
		return mentorService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<MentorResponse> create (MentorRequest mentorRequest){
		MentorResponse mentorResponse = mentorService.create(mentorRequest);
		return new ResponseEntity<>(mentorResponse, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<MentorResponse> update(@PathVariable("id") Long id,
			@RequestBody Mentor mentor){
		mentorService.update(id, mentor);
		MentorResponse mentorResponse = mentorService.getMentor(id);
		return new ResponseEntity<>(mentorResponse, HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/{id}")
	public void deleteById (@PathVariable("id") Long id ) {
		this.mentorService.deleteById(id);
	}
	
	
	

}
