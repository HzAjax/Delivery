package com.example.demo.soap;

import com.example.demo.entity.Branch;
import com.example.demo.entity.Cargo;
import com.example.demo.entity.CargoStatus;
import com.example.demo.entity.dto.CargoDto;
import com.example.demo.repository.CargoRepository;
import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@WebService(
        serviceName = "CargoService",
        portName = "CargoPort",
        targetNamespace = "http://soap.demo.example.com/",
        endpointInterface = "com.example.demo.soap.CargoSoapService"
)
@Service
@RequiredArgsConstructor
public class CargoSoapServiceImpl implements CargoSoapService{

    private final CargoRepository cargoRepository;

    @Override
    public Cargo createCargo(String barcode, String name, String status, Branch branchFrom, Branch branchTo) {
        Cargo cargo = Cargo.builder()
                .barcode(barcode)
                .name(name)
                .status(CargoStatus.valueOf(status.toUpperCase()))
                .branchFrom(branchFrom)
                .branchTo(branchTo)
                .createdAt(LocalDateTime.now())
                .build();
        //TODO сделать DTO
        return cargoRepository.save(cargo);
    }
}
