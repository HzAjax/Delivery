package entity.dto;

import entity.Branch;
import entity.CargoStatus;
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
