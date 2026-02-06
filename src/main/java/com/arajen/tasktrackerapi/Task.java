package com.arajen.tasktrackerapi;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity // This tells Spring to create a table in the database for this class
public class Task {

    @Id // This is your "idCount" replacement
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Database handles the ++ automatically
    private Integer id;

    private String description;
    private String status;

    // Standard Java stuff - you can right-click -> Generate -> Getters/Setters in IntelliJ
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
