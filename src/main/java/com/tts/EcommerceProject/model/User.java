package com.tts.EcommerceProject.model;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long id; 
	
	@NotEmpty (message = "Please enter username")
	@Length( min = 3, message = "Your username must contain ay least three characters")
	@Length (max = 20, message = "Your username cannot be more than 20 characters long")
	@Pattern (regexp= "[^\\s]", message= "Your username cannot contain spaces")
	private String username;
	
	@Length (min = 8, message = "Password needs to be at least 8 characters")
	@NotEmpty (message = "Please provde a password")
	//@JsonProperty(access= Access.WRITE_ONLY)
	private String password;
	
	
}
