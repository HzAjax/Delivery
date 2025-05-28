package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "branch")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String location;

    // Заказы, отправленные из этого филиала
    @OneToMany(mappedBy = "branchFrom", cascade = CascadeType.ALL)
    private List<Cargo> sentCargos;

    // Заказы, пришедшие в этот филиал
    @OneToMany(mappedBy = "branchTo", cascade = CascadeType.ALL)
    private List<Cargo> receivedCargos;
}
