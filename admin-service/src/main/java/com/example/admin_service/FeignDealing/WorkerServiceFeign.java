package com.example.admin_service.FeignDealing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="worker-service")
public interface WorkerServiceFeign {

    @GetMapping("/worker/get")
    public Object getWorkers(@RequestParam(required = false) String mail,@RequestParam(required = false) String type);

}
