package com.vini.hrworker.repository;

import com.vini.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
