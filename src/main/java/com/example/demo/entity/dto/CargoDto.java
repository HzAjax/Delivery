package com.example.demo.entity.dto;

import com.example.demo.entity.Branch;
import com.example.demo.entity.CargoStatus;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CargoDto {
    private String name;
    private CargoStatus status;
    private Branch branchFrom;
    private Branch branchTo;
}
