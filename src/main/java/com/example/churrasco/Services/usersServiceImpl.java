package com.example.churrasco.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.churrasco.DTO.UsersDTO;
import com.example.churrasco.Exceptions.ResourceNotFoundException;
import com.example.churrasco.Models.Usuario;
import com.example.churrasco.Repository.userRepository;

public class usersServiceImpl implements usersService{

	@Autowired
	private userRepository userRepository;

	@Override
	public UsersDTO createUsers(UsersDTO usersDTO) {
		Usuario usuario = mapEntity(usersDTO);
		Usuario newProducts = userRepository.save(usuario);
		UsersDTO productsResponse = mapDTO(newProducts);
		return productsResponse;
	}

	@Override
	public List<UsersDTO> getAllUsers() {
		List<Usuario> usuario = userRepository.findAll();
		return usuario.stream().map(user -> mapDTO(user)).collect(Collectors.toList());
	}

	// Metodo que convierte Entidad a DTO

	private UsersDTO mapDTO(Usuario usuario) {
		UsersDTO usersDTO = new UsersDTO();
		usersDTO.setId(usuario.getId());
		usersDTO.setCreated(usuario.getCreated());
		usersDTO.setEmail(usuario.getEmail());
		usersDTO.setFirst_name(usuario.getFirst_name());
		usersDTO.setLast_name(usuario.getLast_name());
		usersDTO.setRole(usuario.getRole());
		usersDTO.setUpdated(usuario.getUpdated());
		usersDTO.setUsername(usuario.getUsername());
		usersDTO.setPassword(usuario.getPassword());
		return usersDTO;
	}

	// Metodo que convierte DTO a Entidad

	private Usuario mapEntity(UsersDTO usersDTO) {
		Usuario usuario = new Usuario();
		usuario.setId(usersDTO.getId());
		usuario.setCreated(usersDTO.getCreated());
		usuario.setEmail(usersDTO.getEmail());
		usuario.setFirst_name(usersDTO.getFirst_name());
		usuario.setLast_name(usersDTO.getLast_name());
		usuario.setRole(usersDTO.getRole());
		usuario.setUpdated(usersDTO.getUpdated());
		usuario.setUsername(usersDTO.getUsername());
		usuario.setPassword(usersDTO.getPassword());
		return usuario;
	}

	@Override
	public UsersDTO getUsersById(long id) {
		Usuario usuario = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario", "id", id));
		return mapDTO(usuario);
	}

	@Override
	public UsersDTO updateUsers(UsersDTO usersDTO, long id) {
		Usuario usuario = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario", "id", id));
		usuario.setId(usersDTO.getId());
		usuario.setCreated(usersDTO.getCreated());
		usuario.setEmail(usersDTO.getEmail());
		usuario.setFirst_name(usersDTO.getFirst_name());
		usuario.setLast_name(usersDTO.getLast_name());
		usuario.setRole(usersDTO.getRole());
		usuario.setUpdated(usersDTO.getUpdated());
		usuario.setUsername(usersDTO.getUsername());
		usuario.setPassword(usersDTO.getPassword());
	
		Usuario updateUsers = userRepository.save(usuario);
		
		return mapDTO(updateUsers);
	}

	@Override
	public void deleteUsers(long id) {
		Usuario usuario = userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Products", "id", id));
		userRepository.delete(usuario);
}
}
