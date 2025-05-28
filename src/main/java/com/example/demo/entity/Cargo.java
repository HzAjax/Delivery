package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "cargo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String barcode;
    private String name;

    @Enumerated(EnumType.STRING)
    private CargoStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_from_id")
    private Branch branchFrom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_to_id")
    private Branch branchTo;

    private LocalDateTime createdAt;
}
