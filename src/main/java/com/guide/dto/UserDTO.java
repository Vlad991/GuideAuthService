package com.guide.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String login;
    private String password;
    private String email;
    private String fbAccount;
    private String googleAccount;
    private List<RoleDTO> roleList;
}
