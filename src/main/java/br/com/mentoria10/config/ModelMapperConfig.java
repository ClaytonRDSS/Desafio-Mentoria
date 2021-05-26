package br.com.mentoria10.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ModelMapperConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		//var modelMapper = new ModelMapper();
		//modelMapper.createTypeMap(Aluno.class, AlunoRequest.class).
		//<Long>addMapping(src -> src.getAluno(), (dest, value) -> dest.SetAluno(value));
		//return modelMapper;
		return new ModelMapper();
	}

}
