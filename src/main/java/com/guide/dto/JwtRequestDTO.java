package com.guide.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequestDTO implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String login;
    private String password;
}
