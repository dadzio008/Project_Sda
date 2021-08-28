package pl.sda.auctionapp.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.auctionapp.Model.Categories;
import pl.sda.auctionapp.Repository.CategoriesRepo;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class HomePage {
    private final CategoriesRepo categoriesRepo;

    public HomePage(CategoriesRepo categoriesRepo) {
        this.categoriesRepo = categoriesRepo;
    }


    @GetMapping("/HomePage")
    public ResponseEntity<List<Categories>> getAllCategories(){
        List<Categories> allCategories = categoriesRepo.findAll();
        return new ResponseEntity<>(allCategories, HttpStatus.OK);
    }


}
