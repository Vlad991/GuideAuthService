package com.guide.service;

import com.guide.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("foo".equals(username)) {
            return new UserDTO(
                    1L,
                    "foo",
                    "$2a$04$uuJcqqFvSlvI1d.E1oJHKeOCSunbz0RPwL4gzolMMWsHTq/.yc8Ei",
                    "foo@gmail.com",
                    "foo.facebook.com",
                    "foo.google.com",
                    new ArrayList<>()
            );
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
