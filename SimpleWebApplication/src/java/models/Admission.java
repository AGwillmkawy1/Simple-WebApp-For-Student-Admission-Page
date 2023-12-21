/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity
public class Admission {
 @Id
 private String firstname;
 private String lastname;
 private String email;
 private String Id;
 private String dob;
 @Column(columnDefinition = "longblob")
 private String diploma;
 @Column(columnDefinition = "longblob")
 private String photo;
 private String faculty;
 private String department;

    public Admission() {
    }

    public Admission(String firstname, String lastname, String email, String Id, String dob, String diploma, String photo, String faculty, String department) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.Id = Id;
        this.dob = dob;
        this.diploma = diploma;
        this.photo = photo;
        this.faculty = faculty;
        this.department = department;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
 
    
}
