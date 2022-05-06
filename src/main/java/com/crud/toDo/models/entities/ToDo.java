package com.crud.toDo.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "toDo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    //generate a random id
    private Long id;
    private String task;
    private boolean done;
    private Long fkCategoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Long getFkCategoryId() {
        return fkCategoryId;
    }

    public void setFkCategoryId(Long fkCategoryId) {
        this.fkCategoryId = fkCategoryId;
    }
}
