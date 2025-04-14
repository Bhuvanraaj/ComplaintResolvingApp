package com.example.user_service.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "CUSTOMER_COMPLAINT")
@Getter
@Setter
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String complaintType;

    private String complaintRaisedDate;

    private String complaintDueDate;

    private String complaintDescription;

    private String complaintStatus;

}
