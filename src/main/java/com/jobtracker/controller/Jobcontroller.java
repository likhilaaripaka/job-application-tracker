package com.jobtracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobtracker.Entity.Job;
import com.jobtracker.service.Jobservice;

@RestController
@RequestMapping("/jobs")
public class Jobcontroller {

	@Autowired
	private Jobservice jobservice;
	
	@PostMapping
	public Job addJob(@RequestBody Job job) {
		return jobservice.addJob(job);
	}
	@GetMapping
	public List<Job> getAllJobs(){
		return jobservice.getAllJobs();
	}
	@PutMapping("/{id}")
	public Job updateJob(@PathVariable Long id , @RequestBody Job job) {
		return jobservice.updateJob(id, job);
	}
	@DeleteMapping("/{id}")
	public void deleteJob(@PathVariable Long id) {
		jobservice.deleteJob(id);
	}
	
}

