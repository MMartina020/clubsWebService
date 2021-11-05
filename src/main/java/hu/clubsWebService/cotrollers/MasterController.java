package hu.clubsWebService.cotrollers;

import hu.clubsWebService.domain.Category;
import hu.clubsWebService.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MasterController {

    private CategoryService cetegoryService;

    @Autowired
    public void setCetegoryService(CategoryService cetegoryService) {
        this.cetegoryService = cetegoryService;
    }

    @GetMapping("/")
    public String home(){
        return "ClubService";
    }
    @GetMapping("/categories")
    public List<Category> getCategories(){
        return categoryService.getCategories();
    }
}
