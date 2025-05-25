package com.example.admin_service.FeignDealing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "complaint-service",url = "http://localhost:8096")
public interface UserServiceFeign {

    @GetMapping("/complaints/view")
    List<Object> getComplaints(@RequestParam String status,@RequestParam String service);

}
