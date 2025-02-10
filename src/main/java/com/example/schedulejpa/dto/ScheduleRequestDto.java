package com.example.schedulejpa.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleRequestDto {
    private String name;

    private String todo;

}
