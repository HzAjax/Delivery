package com.example.demo.service;

import com.example.demo.entity.Cargo;

import java.util.UUID;

public interface CargoService {
    public Cargo addCargo (Cargo cargo);
    public Cargo getCargoById (UUID id);
    public Cargo editCargoById (Cargo cargo);
    public void deleteCargoById (UUID id);
}
