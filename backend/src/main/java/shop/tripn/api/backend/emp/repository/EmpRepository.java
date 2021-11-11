package shop.tripn.api.backend.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import shop.tripn.api.backend.emp.domain.Emp;
import shop.tripn.api.backend.emp.domain.EmpDto;

import java.util.Optional;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Long> {
    @Query(value = "select deptno, count(*) enoCountPerDept, sum(sal) salSum\n" +
            "from emp\n" +
            "group by deptno\n" +
            "having count(*)> 4;\n", nativeQuery = true)
    Optional<EmpDto> findEmployeesByDeptno(int empCountPerDept);
}
