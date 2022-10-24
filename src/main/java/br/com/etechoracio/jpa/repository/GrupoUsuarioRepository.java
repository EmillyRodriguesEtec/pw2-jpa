package br.com.etechoracio.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.jpa.entity.GrupoUsuario;
import br.com.etechoracio.jpa.entity.Usuario;

public interface GrupoUsuarioRepository extends JpaRepository<Usuario, List<GrupoUsuario>>{

}
