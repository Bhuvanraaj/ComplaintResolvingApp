package com.example.admin_service.Controller;

import com.example.admin_service.Entities.Admin;
import com.example.admin_service.FeignDealing.UserServiceFeign;
import com.example.admin_service.FeignDealing.WorkerServiceFeign;
import com.example.admin_service.Repository.AdminRepository;
import com.example.admin_service.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    UserServiceFeign userServiceFeign;

    @Autowired
    WorkerServiceFeign workerServiceFeign;

    public AdminController(AdminService adminService)
    {
        this.adminService=adminService;
    }

    @GetMapping("/view-complaints")
    public ResponseEntity<?> viewcomplaints(@RequestParam String status,@RequestParam String service)
    {
        return new ResponseEntity<>(userServiceFeign.getComplaints(status,service), HttpStatus.OK);
    }

    @PostMapping("/add-admin")
    public ResponseEntity<?> addAdmin(@RequestBody Admin admin)
    {
        return new ResponseEntity<>(adminRepository.save(admin),HttpStatus.OK);
    }

    @GetMapping("/wokers/get/details")
    public ResponseEntity<?> getWorkers(@RequestParam (required = false) String mail,@RequestParam(required = false) String type)
    {
        return new ResponseEntity<>(workerServiceFeign.getWorkers(mail,type),HttpStatus.OK);
    }
}
