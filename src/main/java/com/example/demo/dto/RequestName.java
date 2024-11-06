package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RequestName {
//    @NotNull(message = "Tidak null")
    @NotBlank(message = "TIdak boleh kosong")
    private String name;
}
