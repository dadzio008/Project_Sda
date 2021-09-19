package pl.sda.auctionapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.auctionapp.Repository.OrderRepo;

@Service
public class CartValue {

    private final OrderRepo orderRepo;
    @Autowired
    public CartValue(OrderRepo orderRepo){
        this.orderRepo = orderRepo;
    }

}
