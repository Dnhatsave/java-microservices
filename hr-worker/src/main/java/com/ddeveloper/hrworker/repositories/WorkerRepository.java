package com.ddeveloper.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddeveloper.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
	
}
