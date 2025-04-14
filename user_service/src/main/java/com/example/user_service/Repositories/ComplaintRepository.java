package com.example.user_service.Repositories;

import com.example.user_service.Entities.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint,Long> {

    @Query(value = "SELECT C FROM Complaint C where C.complaintStatus=:status and C.complaintType=:service")
    List<Complaint> findbyStatus(String status,String service);
}
