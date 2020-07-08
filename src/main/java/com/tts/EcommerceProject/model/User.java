package com.tts.EcommerceProject.model;

import java.util.Collection;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
@Entity
public class User implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty
	private String username;
	@NotEmpty
	private String password;

	// makes map into a table with Product as the foreign key
	@ElementCollection
	protected Map<Product, Integer> cart;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public User() {
	}

	public User(String username, String password, Map<Product, Integer> cart) {

		this.username = username;
		this.password = password;
		this.cart = cart;
	}

	public long getId() {
		return this.id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<Product, Integer> getCart() {
		return this.cart;
	}

	public void setCart(Map<Product, Integer> cart) {
		this.cart = cart;
	}

	public User id(long id) {
		this.id = id;
		return this;
	}

	public User username(String username) {
		this.username = username;
		return this;
	}

	public User password(String password) {
		this.password = password;
		return this;
	}

	public User cart(Map<Product, Integer> cart) {
		this.cart = cart;
		return this;
	}

}