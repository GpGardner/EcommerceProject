package com.tts.EcommerceProject.model;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.annotation.Transient;
import org.springframework.security.core.GrantedAuthority;

public interface UserDetails extends Serializable {
	
	// UserDetails requires these, they are technically getters (is-ers?) overridden by Lombok.
	  // @Transient Makes it so these aren't persisted in the database, as they are hard coded.
	  @Transient 
	  boolean accountNonExpired = true;
	  @Transient
	  boolean accountNonLocked = true;
	  @Transient
	  boolean credentialsNonExpired = true;
	  @Transient
	  boolean enabled = true;
	  @Transient
	  Collection<GrantedAuthority> authorities = null;
}