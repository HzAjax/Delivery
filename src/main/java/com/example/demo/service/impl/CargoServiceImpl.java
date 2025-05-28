package com.example.demo.service.impl;

import com.example.demo.entity.Cargo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.repository.CargoRepository;
import com.example.demo.service.CargoService;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CargoServiceImpl implements CargoService {

    private final CargoRepository cargoRepository;

    public Cargo addCargo (Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public Cargo getCargoById (UUID id) {
        return cargoRepository.findById(id).orElseThrow(() ->
                new NoSuchElementException("No Cargo in BD!"));
    }

    public Cargo editCargoById (Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public void deleteCargoById (UUID id) {
        cargoRepository.deleteById(id);
    }
}
