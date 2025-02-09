package com.example.schedulejpa.controller;

import com.example.schedulejpa.dto.ScheduleRequestDto;
import com.example.schedulejpa.dto.ScheduleResponseDto;
import com.example.schedulejpa.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ResponseEntity<ScheduleResponseDto> saveSchedule(@RequestBody ScheduleRequestDto requestDto){
        return ResponseEntity.ok(scheduleService.saveSchedule(requestDto));
    }

    @GetMapping("/schedules")
    public ResponseEntity<List<ScheduleResponseDto>> findSchedules(){
        return ResponseEntity.ok(scheduleService.findSchedules());
    }

    @GetMapping("/schedules/{id}")
    public ResponseEntity<ScheduleResponseDto> findScheduleOne(@PathVariable Long id){
        return ResponseEntity.ok(scheduleService.findScheduleOne(id));
    }

    @PutMapping("/schedules/{id}")
    public ResponseEntity<ScheduleResponseDto> update(@PathVariable Long id, @RequestBody ScheduleRequestDto dto){
        return ResponseEntity.ok(scheduleService.update(id, dto));
    }

    @DeleteMapping("/schedules/{id}")
    public void delete(@PathVariable Long id){
        scheduleService.delete(id);
    }
}
