package com.example.worker_service.Service;

import com.example.worker_service.Entities.Workers;
import com.example.worker_service.Repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    @Autowired
    WorkerRepository workerRepository;
    public Object addWorker(Workers worker) {
        return workerRepository.save(worker);
    }

    public Object getWorker(String mail, String type) {
        if(mail == null && type==null)
        {
            return workerRepository.findAll();
        }
        else if(mail ==null && type!=null)
        {
            return workerRepository.findByType(type);
        }
        else
        {
            return workerRepository.findByMail(mail);
        }
    }
}
