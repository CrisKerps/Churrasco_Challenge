package com.example.churrasco.Services;

import java.util.List;

import com.example.churrasco.DTO.UsersDTO;

public interface usersService {
	
		public UsersDTO createUsers(UsersDTO usersDTO);
		
		public List<UsersDTO> getAllUsers();
		
		public UsersDTO getUsersById(long id);
		
		public UsersDTO updateUsers(UsersDTO usersDTO, long id);
		
		public void deleteUsers(long id); 
		

}
