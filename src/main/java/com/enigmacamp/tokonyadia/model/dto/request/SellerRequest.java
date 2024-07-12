package com.enigmacamp.tokonyadia.model.dto.request;

import com.enigmacamp.tokonyadia.model.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data // Setter Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SellerRequest {
    private String id;
    @NotBlank(message = "Name is required")
    @Size(min = 5)
    private String name;
    private String phoneNumber;
    private String address;
    private Date birthDate;
    private User user;
}