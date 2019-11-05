package pe.edu.upn.T3.service;

import java.util.Optional;

import pe.edu.upn.T3.model.entity.Usuario;



public interface UsuarioService extends CrudService<Usuario, Long> {
	Optional<Usuario> findByUsername(String username) throws Exception;
}
