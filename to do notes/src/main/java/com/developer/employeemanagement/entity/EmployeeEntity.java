package com.developer.employeemanagement.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="note_table")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="note_id")
    private Long id;

    @Column(name="name")
    private String name;

   

    @Column(name="date_of_note")
    private Date dateOfBirth;

    @Column(name="note")
    private String adress;
    public EmployeeEntity() {
    }
    public EmployeeEntity(Long id, String name, String gender, Date dateOfBirth, String adress) {
        this.id = id;
        this.name = name;
      
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    

}
