package pl.sda.auctionapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionapp.Model.Categories;

public interface CategoriesRepo extends JpaRepository<Categories, Long> {

}
