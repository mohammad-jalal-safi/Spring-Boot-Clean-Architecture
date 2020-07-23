package com.clean.domain.entity.employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    public int ID ;
    public String Name;
}
