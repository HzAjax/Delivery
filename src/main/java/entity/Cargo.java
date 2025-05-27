package entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cargo {
    private Long id;
    private String barcode;
    private String name;
    private CargoStatus status;
    private Branch branchFrom;
    private Branch branchTo;
    private LocalDateTime createdAt;
}
