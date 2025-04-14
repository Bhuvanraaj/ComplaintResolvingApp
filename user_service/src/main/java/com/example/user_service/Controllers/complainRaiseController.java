package com.example.user_service.Controllers;

import com.example.user_service.Entities.Complaint;
import com.example.user_service.Services.ComplaintraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/complaint")
public class complainRaiseController {
    @Autowired
    ComplaintraiseService complaintraiseService;
    @PostMapping("/submitComplaint")
    public ResponseEntity<Complaint> submitComplaint(@RequestBody Complaint complaint, @RequestParam Long id)
    {
        return new ResponseEntity<>(complaintraiseService.submitComplaint(complaint,id), HttpStatus.OK);
    }
    @GetMapping("/view-complaints")
    public ResponseEntity<List<Complaint>> getSubmittedComplaints(@RequestParam String status,@RequestParam String service)
    {
        return new ResponseEntity<>(complaintraiseService.getcomplaints(status,service),HttpStatus.OK);
    }

}
