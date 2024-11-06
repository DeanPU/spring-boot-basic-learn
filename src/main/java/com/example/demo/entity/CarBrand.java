package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CarBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String CD_BRAND;
    private String DESC_BRAND;
}
