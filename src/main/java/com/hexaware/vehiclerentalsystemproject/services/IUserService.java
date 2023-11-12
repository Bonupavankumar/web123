package com.hexaware.vehiclerentalsystemproject.services;

import com.hexaware.vehiclerentalsystemproject.dto.UserDTO;

public interface IUserService {
	public UserDTO addUser(UserDTO user);
	public UserDTO updateUser(UserDTO user);
	public UserDTO findById(Long id) throws Exception;
	public void deleteById(Long id);
	

}
