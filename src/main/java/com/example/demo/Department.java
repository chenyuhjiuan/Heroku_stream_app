package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    /*@NotNull
    @Size(min=3)*/
    private String depname;
    /*@NotNull
    @Size(min=3)*/
    private String headname;
    private String headshot;
    @OneToMany(mappedBy = "department",cascade = CascadeType.REMOVE, orphanRemoval = true)
    public Set<Employee> employees;

    public Department() {
    }

    public Department(String depname, String headname) {
        this.depname = depname;
        this.headname = headname;
    }

    public String getHeadname() {
        return headname;
    }

    public void setHeadname(String headname) {
        this.headname = headname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
