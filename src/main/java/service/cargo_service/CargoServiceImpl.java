package service.cargo_service;

import entity.Cargo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CargoRepository;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CargoServiceImpl implements CargoService{

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
