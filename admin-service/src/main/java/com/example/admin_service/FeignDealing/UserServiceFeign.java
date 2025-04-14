package com.example.admin_service.FeignDealing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "user-service",url = "http://localhost:8081/user/complaint")
public interface UserServiceFeign {

    @GetMapping("/view-complaints")
    List<Object> getComplaints(@RequestParam String status,@RequestParam String service);

}
