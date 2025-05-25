package com.example.complaintService.Controller;

import com.example.complaintService.Entity.Complaint;
import com.example.complaintService.Service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {
    @Autowired
    ComplaintService complaintService;
    @GetMapping("/view")
    public ResponseEntity<?> getComplaints()
    {
        return new ResponseEntity<>(complaintService.getComplaintsList(), HttpStatus.OK);
    }
    @PostMapping("/submit")
    public ResponseEntity<?> submitComplaint(@RequestBody Complaint complaint)
    {
        return new ResponseEntity<>(complaintService.submitComplaint(complaint),HttpStatus.OK);
    }

}
