package com.example.schedulejpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Schedule {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String todo;

    public Schedule(String name, String todo){
        this.name = name;
        this.todo = todo;
    }

    public void update(String name, String todo){
        this.name = name;
        this.todo = todo;
    }
}
