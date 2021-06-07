package com.vini.hrworker.resource;

import com.vini.hrworker.entities.Worker;
import com.vini.hrworker.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class workerResource {


    private final WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {
        Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}
