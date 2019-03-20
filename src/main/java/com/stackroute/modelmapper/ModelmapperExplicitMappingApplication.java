package com.stackroute.modelmapper;

import com.stackroute.modelmapper.dto.UserDTO;
import com.stackroute.modelmapper.model.User;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class ModelmapperExplicitMappingApplication {

	public static void main(String[] args) {
		explicitModelMappingDemo();
	}

	private static void explicitModelMappingDemo() {
		User sourceUser = new User(1, "Roopali", "roogand1@in.ibm.com", "9131664922", "bangalore");

		UserDTO targetUserDTO = new UserDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.addMappings(
				new PropertyMap<User, UserDTO>() {
			protected void configure() {
				map().setUserCity(source.getCity());
			}
		});

		modelMapper.map(sourceUser, targetUserDTO);

		System.out.println(targetUserDTO.getName());
		System.out.println(targetUserDTO.getEmailAddress());
		System.out.println(targetUserDTO.getMobileNumber());
		System.out.println(targetUserDTO.getUserCity());
	}
}
