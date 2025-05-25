package com.example.complaintService.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USERS_COMPLAINTS")
@Data
public class Complaint {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name="COMPLAINT_TYPE")
    private String complaintType;

    @Column(name="COMPLAINT_RAISED_DATE")
    private String complaintRaisedDate;

    @Column(name="COMPLAINT_DUE_DATE")
    private String complaintDueDate;

    @Column(name="COMPLAINT_DESCRIPTION")
    private String complaintDescription;

    @Column(name="COMPLAINT_STATUS")
    private String complaintStatus;
}
