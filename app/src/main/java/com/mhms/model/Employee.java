package com.mhms.model;

/**
 * Created by Rabin Shrestha on 4/10/2017.
 */

public abstract class Employee {
    private Integer empId;
    private String name;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
