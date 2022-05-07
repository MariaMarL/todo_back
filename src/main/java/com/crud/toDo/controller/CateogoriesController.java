package com.crud.toDo.controller;

import com.crud.toDo.models.dto.CategoriesDto;
import com.crud.toDo.services.categories.CategoriesServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
@CrossOrigin(origins = "http://localhost:3000/")
public class CateogoriesController {

    @Autowired
    private CategoriesServiceInterface categoriesSI;

    @GetMapping
    public List<CategoriesDto> getCategories(){
        return categoriesSI.list();
    }

    @PostMapping
    public CategoriesDto saveCategories(@RequestBody CategoriesDto categoriesDto){
        return categoriesSI.save(categoriesDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCategories(@PathVariable Long id){
        categoriesSI.delete(id);
    }

    @GetMapping
    public CategoriesDto getCategories(@PathVariable Long id){
        return categoriesSI.getIdDto(id);
    }
}
