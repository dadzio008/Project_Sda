package pl.sda.auctionapp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameOfCategory;

    public Categories(Long number, String nameOfCategory) {
        this.id = number;
        this.nameOfCategory = nameOfCategory;
    }

    public Categories() {

    }

    public Long getNumber() {
        return id;
    }

    public void setNumber(Long number) {
        this.id = number;
    }

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }
}
