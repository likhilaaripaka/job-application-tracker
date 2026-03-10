package com.jobtracker.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jobtracker.Entity.Job;
public interface Jobrepository extends JpaRepository<Job, Long> {

}
