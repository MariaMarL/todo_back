package com.crud.toDo.controller;

import com.crud.toDo.models.dto.ToDoDto;
import com.crud.toDo.services.toDo.ToDoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")                            //the url when we execute the request.
@CrossOrigin(origins = "http://localhost:3000/")   //tell that accepts request from a fronted app; tell that it will be an origin localed in the localhost.
public class ToDoController {

    @Autowired //dependency injection without making an instance from this class.
    private ToDoServiceInterface toDoServiceInterface;


    @GetMapping
    public List<ToDoDto> getToDos(){
        return toDoServiceInterface.getToDos();
    }

    @PostMapping
    public ToDoDto save(@RequestBody ToDoDto toDoDto){
        return toDoServiceInterface.saveToDo(toDoDto);
    }

   @PutMapping
   public ToDoDto update(@RequestBody ToDoDto toDoDto){
       if(toDoDto.getId() != null){
           return toDoServiceInterface.saveToDo(toDoDto);
       }else {
           throw new RuntimeException("This toDo doesn't exist");
       }
   }

   @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        toDoServiceInterface.deleteToDo(id);
   }

   @GetMapping
    public ToDoDto getTodo(@PathVariable Long id){
        return toDoServiceInterface.getToDoIdDto(id);
   }
}
