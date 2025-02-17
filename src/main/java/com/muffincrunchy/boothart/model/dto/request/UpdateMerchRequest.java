package com.muffincrunchy.boothart.model.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.muffincrunchy.boothart.model.entity.Shipment;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UpdateMerchRequest {

    @NotBlank(message = "id is required")
    private String id;

    @NotBlank(message = "name is required")
    private String name;

    @NotBlank(message = "category is required")
    private String category;

    @NotNull(message = "price is required")
    private Long price;

    @NotNull(message = "stock is required")
    private Integer stock;

    @NotBlank(message = "artist_id is required")
    @JsonProperty("artist_id")
    private String artistId;

    @NotBlank(message = "type is required")
    private String type;
}
