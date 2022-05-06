package com.crud.toDo.models.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Categories")
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String categoryName;;

    @OneToMany(mappedBy = "fkCategoryId")           //delete orphaned entities from the database. An entity that is no longer attached to its parent
    //@JoinColumn(name = "categoryId")        //This annotation helps us specify the column we'll use for joining an entity association or element collection
    private List<ToDo> toDoList = new ArrayList<>();

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

    public List<ToDo> getToDoList() {
        return toDoList;
    }

    public void setToDoList(List<ToDo> toDoList) {
        this.toDoList = toDoList;
    }

    public Categories addToDo(ToDo toDo){
        this.toDoList.add(toDo);
        return this;
    }
 }
