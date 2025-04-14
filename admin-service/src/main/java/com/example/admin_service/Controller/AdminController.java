package com.example.admin_service.Controller;

import com.example.admin_service.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    public AdminController(AdminService adminService)
    {
        this.adminService=adminService;
    }

    @GetMapping("/view-complaints")
    public ResponseEntity<?> viewcomplaints(@RequestParam String status,@RequestParam String service)
    {
        return new ResponseEntity<>(adminService.viewComplaints(status,service), HttpStatus.OK);
    }

}
