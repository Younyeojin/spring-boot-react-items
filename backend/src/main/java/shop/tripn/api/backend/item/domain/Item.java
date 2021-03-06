package shop.tripn.api.backend.item.domain;


import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;
import shop.tripn.api.backend.board.domain.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @Component @Table(name = "items")
public class Item {
    @Id
    @Column(name="item_id")
    @GeneratedValue
    private long itemId;
    @Column(name = "item_brand") @NotNull private String itemBrand;
    @Column(name = "item_name") @NotNull private String itemName;
    @Column(name = "item_color") @NotNull private String itemColor;
    @Column(name = "released_date") @NotNull private String releasedDate;
    @OneToMany(mappedBy = "item")
    private List<Article> articleList = new ArrayList<>();

}
