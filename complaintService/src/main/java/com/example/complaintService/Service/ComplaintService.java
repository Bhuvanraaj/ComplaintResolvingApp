package com.example.complaintService.Service;

import com.example.complaintService.Entity.Complaint;
import com.example.complaintService.Repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {

    @Autowired
    ComplaintRepository complaintRepository;
    public Object getComplaintsList() {
        return complaintRepository.findAll();
    }

    public Object submitComplaint(Complaint complaint) {
        return complaintRepository.save(complaint);
    }
}
