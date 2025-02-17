package com.muffincrunchy.boothart.model.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateCustomerRequest {

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "birthDate is required")
    @JsonProperty("birth_date")
    private String birthDate;

    @NotBlank(message = "phone_no is required")
    @JsonProperty("phone_no")
    private String phoneNo;

    @NotBlank(message = "email is required")
    private String email;
}
