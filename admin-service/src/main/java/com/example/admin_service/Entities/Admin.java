package com.example.admin_service.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Collate;

@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

}
