package com.jobtracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobtracker.Entity.Job;
import com.jobtracker.repository.Jobrepository;
@Service
public class Jobservice {
	
 @Autowired
  private Jobrepository jobRepository;
 
 public Job addJob(Job job) {
	 return jobRepository.save(job);
 }
 
 public List<Job> getAllJobs(){
	 return jobRepository.findAll();
 }
   public Job updateJob(Long id , Job jobDetails) {
	   Job job = jobRepository.findById(id).orElse(null);
	   
	   if(job !=null) {
		   job.setCompanyName(jobDetails.getCompanyName());
		   job.setRole(jobDetails.getRole());
		   job.setStatus(jobDetails.getStatus());
		   job.setAppliedDate(jobDetails.getAppliedDate());
		   return jobRepository.save(job);
	   }
	   return null;
   }
   public void deleteJob(Long id) {
	   jobRepository.deleteById(id);
   }
}


