package shop.tripn.api.backend.user.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Proxy;
import org.springframework.stereotype.Component;
import shop.tripn.api.backend.board.domain.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @Component @Table(name = "users") @Proxy(lazy = false)
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String name;
    @Column private @NotNull String email;
    @Column(name = "reg_date") @NotNull private String regDate;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Article> articleList = new ArrayList<>();



}
