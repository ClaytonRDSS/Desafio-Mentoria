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


import br.com.mentoria10.modelo.Mentoria;
import br.com.mentoria10.modelo.MentoriaRequest;
import br.com.mentoria10.modelo.MentoriaResponse;
import br.com.mentoria10.service.MentoriaService;



@RestController
@RequestMapping("/mentorias")
public class MentoriaController {
	
	@Autowired
    private final MentoriaService mentoriaService;

    public MentoriaController(MentoriaService mentoriaService) {
        this.mentoriaService = mentoriaService;
    }

    @GetMapping
    public List<MentoriaResponse> findAll(){
        return mentoriaService.findAll();
    }

    @GetMapping("/{id}")
    public MentoriaResponse detalhar(@PathVariable final Long id){
        return mentoriaService.detalhar(id);
    }

    @PostMapping
    public ResponseEntity<MentoriaResponse> cadastrar(@Validated @RequestBody MentoriaRequest mentoriaRequest ){
       MentoriaResponse mentoriaResponse = mentoriaService.cadastrar(mentoriaRequest);
       return new ResponseEntity<>(mentoriaResponse, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MentoriaResponse> atualizar(@PathVariable final Long id,
    		@RequestBody Mentoria mentoria){
        mentoriaService.atualizar(id, mentoria);
        MentoriaResponse mentoriaResponse = mentoriaService.getMentoria(id);
        return new ResponseEntity<>(mentoriaResponse, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable final Long id) {
        mentoriaService.delete(id);
    }

}
