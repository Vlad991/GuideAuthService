package com.guide.converter;

import com.guide.dto.UserDTO;
import com.guide.entity.Role;
import com.guide.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserConverter {
    private RoleConverter roleConverter;

    public UserConverter(RoleConverter roleConverter) {
        this.roleConverter = roleConverter;
    }

    public UserDTO convertToDto(User user) {
        return new UserDTO(
                user.getId(),
                user.getLogin(),
                user.getPassword(),
                user.getEmail(),
                user.getFbAccount(),
                user.getGoogleAccount(),
                roleConverter.convertToListDto(user.getRoleList())
        );
    }

    public User convertToEntity(UserDTO userDTO, List<Role> roleList) {
        return new User(
                userDTO.getId(),
                userDTO.getLogin(),
                userDTO.getPassword(),
                userDTO.getEmail(),
                userDTO.getFbAccount(),
                userDTO.getGoogleAccount(),
                roleList
        );
    }
}
