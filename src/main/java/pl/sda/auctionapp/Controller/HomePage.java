package pl.sda.auctionapp.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.auctionapp.Model.Categories;
import pl.sda.auctionapp.Model.Order;
import pl.sda.auctionapp.Model.Products;
import pl.sda.auctionapp.Repository.CategoriesRepo;
import pl.sda.auctionapp.Repository.OrderRepo;
import pl.sda.auctionapp.Repository.ProductsRepo;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class HomePage {
    private final CategoriesRepo categoriesRepo;
    private final ProductsRepo productsRepo;
    private final OrderRepo orderRepo;

    public HomePage(CategoriesRepo categoriesRepo, ProductsRepo productsRepo, OrderRepo orderRepo) {
        this.categoriesRepo = categoriesRepo;
        this.productsRepo = productsRepo;
        this.orderRepo = orderRepo;
    }


    @GetMapping("/HomePage")
    public ResponseEntity<List<Categories>> getAllCategories(){
        List<Categories> allCategories = categoriesRepo.findAll();
        return new ResponseEntity<>(allCategories, HttpStatus.OK);
    }
    @PostMapping("/HomePage/cart/{id}")
    public ResponseEntity<Order> addToCart(@PathVariable Long id) {
        Order order = (Order) productsRepo.findById(id)
                .orElseThrow(()-> new RuntimeException());
        orderRepo.save(order);
        return new ResponseEntity<>(order,HttpStatus.OK);
    }


}
