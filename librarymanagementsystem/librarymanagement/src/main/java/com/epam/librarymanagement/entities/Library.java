package com.epam.librarymanagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String username;
	int bookId;
}
