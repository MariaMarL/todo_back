package com.crud.toDo.controller;

import com.crud.toDo.models.dto.CategoriesDto;
import com.crud.toDo.services.categories.CategoriesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class CateogoriesController {

    @Autowired
    private CategoriesServiceInterface categoriesSI;

    @GetMapping(value = "get/categories")
    public List<CategoriesDto> getCategories(){
        return categoriesSI.list();
    }

    @PostMapping(value = "post/categories")
    public CategoriesDto saveCategories(@RequestBody CategoriesDto categoriesDto){
        return categoriesSI.save(categoriesDto);
    }

    @DeleteMapping(value = "delete/categories/{id}")
    public void deleteCategories(@PathVariable Long id){
        categoriesSI.delete(id);
    }

    @GetMapping(value = "delete/categories/{id}")
    public CategoriesDto getCategories(@PathVariable Long id){
        return categoriesSI.getIdDto(id);
    }
}
