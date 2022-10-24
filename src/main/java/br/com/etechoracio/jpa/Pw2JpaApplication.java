package br.com.etechoracio.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.entity.Usuario;
import br.com.etechoracio.jpa.repository.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}

	
		@Autowired
		private UsuarioRepository repo;
		
		

		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
				 Usuario us = Usuario.builder().nome("horacio.augusto")
						 						.senha("etec123")
						 				.build();
						 repo.save(us);
		}
	}

