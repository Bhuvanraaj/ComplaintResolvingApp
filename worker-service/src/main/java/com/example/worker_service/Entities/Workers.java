package com.example.worker_service.Entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Workers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name="AGE")
    private String age;

    @Column(name = "MAIL_ID")
    private String mailId;

    @Column(name="PHONE")
    private String mobile;

    @Column(name="WORK_TYPE")
    private String workType;
}
