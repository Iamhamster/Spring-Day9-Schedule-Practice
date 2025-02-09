package com.example.schedulejpa.dto;

import lombok.Getter;

@Getter
public class ScheduleResponseDto {
    private final Long id;
    private final String name;
    private final String todo;

    public ScheduleResponseDto(Long id, String name, String todo){
        this.id = id;
        this.name = name;
        this.todo = todo;
    }
}
