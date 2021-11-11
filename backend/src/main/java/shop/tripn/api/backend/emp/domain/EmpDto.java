package shop.tripn.api.backend.emp.domain;

import lombok.Data;

@Data
public class EmpDto {
    private Long deptNo;
    private int enoCountPerDept;
    private int salSum;
}
