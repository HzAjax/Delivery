package com.example.demo.entity.dto;

import com.example.demo.entity.Branch;
import com.example.demo.entity.Cargo;
import com.example.demo.entity.CargoStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CargoDto {
    private String barcode;
    private String name;
    private CargoStatus status;
    private Branch branchFrom;
    private Branch branchTo;
    private LocalDateTime createdAt;
}
