package com.example.demo.controller;

import com.example.demo.dto.RequestCarBrand;
import com.example.demo.handler.ResponseHandler;
import com.example.demo.repository.CarBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarBrandController {
    private final CarBrandRepository carBrandRepository;

    @PostMapping("/getListFilterUnitBrand")
    ResponseEntity<Object> getListFilterUnitBrand(@RequestBody RequestCarBrand requestCarBrand){

        return ResponseHandler.genereteResponse("T", "Success", "", HttpStatus.OK);
    }
}
