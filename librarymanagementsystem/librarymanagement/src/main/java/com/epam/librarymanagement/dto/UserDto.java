package com.epam.librarymanagement.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto {
	String username;
	String email;
	String name;
	@JsonInclude(Include.NON_NULL)
	List<BookDto> booksList;
}
