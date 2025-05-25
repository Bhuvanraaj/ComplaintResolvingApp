package com.example.worker_service.Repository;

import com.example.worker_service.Entities.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends JpaRepository<Workers,Long> {

    @Query(value="select W from Workers W where W.workType=:type")
    List<Workers> findByType(String type);

    @Query(value="select W from Workers W where W.mailId=:mail")
    Workers  findByMail(String mail);
}
