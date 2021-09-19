package pl.sda.auctionapp.Model;

import javax.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nameOfProduct;
    private String category;
    private String price;

    public Long getId() {
        return id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getCategory() {
        return category;
    }
    public String getPrince() {
        return price;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void setPrice(String price) {
        this.price = price;
    }
}
