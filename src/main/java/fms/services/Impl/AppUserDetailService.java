package fms.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import fms.entity.User;
import fms.repository.UserRepository;

@Component
public class AppUserDetailService implements UserDetailsService {
	
    @Autowired
    private UserRepository userRepository;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		
		if (user == null) {
			throw new UsernameNotFoundException(String.format("the username %s doesnt't exist", username));
		}
		
		List <GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		user.getRoles().forEach(role -> {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		});
		
		UserDetails userDetails = new org.springframework.security.core.userdetails.
              User(user.getUsername(), user.getPassword(), authorities);
		
		return null;
	}


}

