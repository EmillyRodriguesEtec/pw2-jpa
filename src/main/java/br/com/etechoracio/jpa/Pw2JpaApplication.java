package br.com.etechoracio.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.jpa.entity.GrupoUsuario;
import br.com.etechoracio.jpa.entity.Usuario;
import br.com.etechoracio.jpa.repository.GrupoUsuarioRepository;
import br.com.etechoracio.jpa.repository.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}

	
		@Autowired
		private UsuarioRepository repo;
		
		@Autowired
		private GrupoUsuarioRepository gp;
		
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			
			GrupoUsuario gu1 = GrupoUsuario.builder().nome("Admin")
													.id((long) 1)
											.build();
							//gp.save(gu1);
													
			GrupoUsuario gu2 = GrupoUsuario.builder().nome("Gerente")
													.id((long)2)
											.build();
							//gp.save(gu2);
			
							//List<GrupoUsuario> grupos;
			
				 /*Usuario us = Usuario.builder().nome("horacio.augusto")
						 						.senha("etec123")
						 				.build();
						 repo.save(us);*/
		}
	}

