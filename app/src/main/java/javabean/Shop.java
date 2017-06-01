package javabean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Description:
 * Created by LiBing
 * Data:2017/6/1 15:34
 */
@Entity
public class Shop {
    //不能用int
    @Id(autoincrement = true)
    private Long id;
    //商品名称
    @Unique
    private String name;
    //商品价格
    @Property(nameInDb = "price")
    private String price;
    @Generated(hash = 1147965770)
    public Shop(Long id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Generated(hash = 633476670)
    public Shop() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPrice() {
        return this.price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
