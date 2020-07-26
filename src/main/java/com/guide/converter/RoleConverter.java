package com.guide.converter;

import com.guide.dto.RoleDTO;
import com.guide.entity.Role;
import com.guide.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoleConverter {
    public RoleDTO convertToDto(Role role) {
        return new RoleDTO(
                role.getId(),
                role.getName()
        );
    }

    public Role convertToEntity(RoleDTO roleDTO, List<User> userList) {
        return new Role(
                roleDTO.getId(),
                roleDTO.getName(),
                userList
        );
    }

    public List<RoleDTO> convertToListDto(List<Role> roleList) {
        return roleList.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
}
