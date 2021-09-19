package pl.sda.auctionapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.auctionapp.Model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
