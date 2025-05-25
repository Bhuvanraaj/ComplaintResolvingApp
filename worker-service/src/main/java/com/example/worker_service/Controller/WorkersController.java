package com.example.worker_service.Controller;

import com.example.worker_service.Entities.Workers;
import com.example.worker_service.Service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/worker")
public class WorkersController {
    @Autowired
    WorkerService workerService;

    @PostMapping("/add")
    public ResponseEntity<?> addworker(@RequestBody Workers worker)
    {
        return new ResponseEntity<>(workerService.addWorker(worker), HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getWorkerDetails(@RequestParam(required = false) String mail,@RequestParam(required = false) String type)
    {
        return new ResponseEntity<>(workerService.getWorker(mail,type),HttpStatus.OK);
    }
}
