package com.stackroute.modelmapper;

import com.stackroute.modelmapper.dto.UserDTO;
import com.stackroute.modelmapper.model.User;
import org.modelmapper.ModelMapper;

public class ModelmapperApplication {

	public static void main(String[] args) {
		simpleModelMappingDemo();
	}

	private static void simpleModelMappingDemo() {
		User sourceUser = new User(1, "Roopali", "roogand12@in.ibm.com", "9131664922","Bangalore");

		UserDTO targetUserDTO = new UserDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.map(sourceUser, targetUserDTO);

		System.out.println(targetUserDTO.getName());
		System.out.println(targetUserDTO.getEmailAddress());
		System.out.println(targetUserDTO.getMobileNumber());
		System.out.println(targetUserDTO.getUserCity());
	}
}
