package pl.sda.auctionapp.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order extends Products{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String nameOfProduct;
    private Long clientID;
    private Long valueOfCart;

    @OneToMany
    private List<Products> productsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Long getClientID() {
        return clientID;
    }

    public Long getValueOfCart() {
        return valueOfCart;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public void setValueOfCart(Long valueOfCart) {
        this.valueOfCart = valueOfCart;
    }

}
