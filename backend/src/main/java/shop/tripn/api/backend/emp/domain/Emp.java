package shop.tripn.api.backend.emp.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Component;
import shop.tripn.api.backend.dept.domain.Dept;

import javax.persistence.*;

@Entity @Proxy(lazy = false)
@Data @Component @Table(name="emp")
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    @Id
    @Column(name = "empno")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long empNo;
    @Column(name = "ename") @NotNull private String ename;
    @Column(name = "job") @NotNull private String job;
    @Column(name = "mgr") @NotNull private int mgr;
    @Column(name = "hiredate") @NotNull private String hiredate;
    @Column(name = "sal") @NotNull private int sal;
    @Column(name = "comm") @NotNull private int comm;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="deptno", insertable = false, updatable = false)
    private Dept dept;

}
