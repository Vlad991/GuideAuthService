package com.guide.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponseDTO implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private String jwtToken;
}
