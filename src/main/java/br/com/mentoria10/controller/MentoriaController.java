package br.com.mentoria10.controller;


import java.util.List;

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

import br.com.mentoria10.model.Mentoria;
import br.com.mentoria10.model.MentoriaRequest;
import br.com.mentoria10.model.MentoriaResponse;
import br.com.mentoria10.service.MentoriaService;



@RestController
@RequestMapping("/mentorias")
public class MentoriaController {
	
	@Autowired
    private MentoriaService mentoriaService;

    @GetMapping
    public List<MentoriaResponse> findAll(){
        return mentoriaService.findAll();
    }

    @GetMapping("/{id}")
    public MentoriaResponse findById(@PathVariable("id") final Long id){
        return mentoriaService.findById(id);
    }

    @PostMapping
    public ResponseEntity<MentoriaResponse> create(@Validated @RequestBody MentoriaRequest mentoriaRequest ){
       MentoriaResponse mentoriaResponse = mentoriaService.create(mentoriaRequest);
       return new ResponseEntity<>(mentoriaResponse, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<MentoriaResponse> update(@PathVariable final Long id,
    		@RequestBody Mentoria mentoria){
        mentoriaService.update(id, mentoria);
        MentoriaResponse mentoriaResponse = mentoriaService.getMentoria(id);
        return new ResponseEntity<>(mentoriaResponse, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable final Long id) {
        this.mentoriaService.deleteById(id);
    }

}
