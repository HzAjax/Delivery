package com.example.demo.controller;

import com.example.demo.entity.Cargo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.CargoService;

import java.util.UUID;

@RestController
@RequestMapping("/delivery/cargo")
@RequiredArgsConstructor
public class CargoController {

    private final CargoService cargoService;

    @PostMapping
    public ResponseEntity<?> addCargo (@Valid @RequestBody Cargo cargo) {
        return ResponseEntity.ok(cargoService.addCargo(cargo));
    }

    @GetMapping("/{cargoId}")
    public ResponseEntity<?> getCargo (@PathVariable("cargoId") UUID cargoId){
        return ResponseEntity.ok(cargoService.getCargoById(cargoId));
    }

    @PutMapping
    public ResponseEntity<?> editCargo (@Valid @RequestBody Cargo cargo) {
        return ResponseEntity.ok(cargoService.editCargoById(cargo));
    }

    @DeleteMapping("/{cargoId}")
    public ResponseEntity<?> deleteCargo (@PathVariable("cargoId") UUID cargoId){
        cargoService.deleteCargoById(cargoId);
        return ResponseEntity.ok().build();
    }

}
