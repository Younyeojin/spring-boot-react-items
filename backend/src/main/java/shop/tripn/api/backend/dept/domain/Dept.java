package shop.tripn.api.backend.dept.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Component;
import shop.tripn.api.backend.board.domain.Article;
import shop.tripn.api.backend.emp.domain.Emp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Proxy(lazy = false)
@Data @Component @Table(name="dept")
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    @Id
    @Column(name="deptno")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long deptNo;
    @Column(name="dname") @NotNull private String dName;
    @Column(name="loc") @NotNull private String loc;
    @OneToMany(mappedBy = "dept", fetch = FetchType.EAGER) private List<Emp> empList = new ArrayList<>();
}
