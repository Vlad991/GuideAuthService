package com.guide.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements UserDetails {
    private Long id;
    private String login;
    private String password;
    private String email;
    private String fbAccount;
    private String googleAccount;
    private List<RoleDTO> roleList;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roleList;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // todo
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // todo
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // todo
    }

    @Override
    public boolean isEnabled() {
        return true; // todo
    }
}
