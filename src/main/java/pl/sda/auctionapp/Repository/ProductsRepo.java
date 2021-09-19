package pl.sda.auctionapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionapp.Model.Products;

public interface ProductsRepo extends JpaRepository<Products, Long> {

}
