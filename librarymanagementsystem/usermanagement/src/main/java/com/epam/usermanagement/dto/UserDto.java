package com.epam.usermanagement.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
	@NotNull(message="username cannot be null")
	@Size(min=3,max=10,message="username is not proper")
	String username;
	String email;
	@Size(min=3,max=10,message="name is not proper")
	String name;
}
