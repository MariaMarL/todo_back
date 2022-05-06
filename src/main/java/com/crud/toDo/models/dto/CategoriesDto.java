package com.crud.toDo.models.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoriesDto {

    private Long id;;
    private String categoryName;
    private List<ToDoDto> toDoList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ToDoDto> getToDoList() {
        return toDoList;
    }

    public void setToDoList(List<ToDoDto> toDoList) {
        this.toDoList = toDoList;
    }
}
