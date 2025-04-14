package com.example.user_service.Services;

import com.example.user_service.Entities.Complaint;
import com.example.user_service.Repositories.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintraiseService {
    @Autowired
    ComplaintRepository complaintRepository;
    public Complaint submitComplaint(Complaint complaint, Long id) {
        return complaintRepository.save(complaint);
    }

    public List<Complaint> getcomplaints(String status,String service) {
       return complaintRepository.findbyStatus(status,service);
//        return complaintRepository.findAll();
    }
}
