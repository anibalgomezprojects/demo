package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Task;
import com.example.demo.repository.TaskRepository;

@RestController
@RequestMapping("/task")
public class TaskController {
	@Autowired
	private TaskRepository taskRepository;

	@GetMapping("/")
	public ResponseEntity<Object> getAllTask() {
		List<Task> tsk = taskRepository.findAll();
		System.out.print("resultado :::" + tsk);
		return new ResponseEntity<Object>(tsk, HttpStatus.OK);
	}

	
}
