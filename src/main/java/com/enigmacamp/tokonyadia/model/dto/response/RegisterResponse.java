package com.enigmacamp.tokonyadia.model.dto.response;

import com.enigmacamp.tokonyadia.model.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterResponse {
    private String username;
    private Role.ERole role;

}
