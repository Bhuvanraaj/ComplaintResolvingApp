package com.example.admin_service.Service;

import com.example.admin_service.AdminServiceApplication;
import com.example.admin_service.FeignDealing.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    UserServiceFeign userServiceFeign;

    public AdminService(UserServiceFeign userServiceFeign)
    {
        this.userServiceFeign=userServiceFeign;
    }

    public List<Object> viewComplaints(String status,String service) {
        return userServiceFeign.getComplaints(status,service);
    }
}
